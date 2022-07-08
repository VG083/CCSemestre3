#include<stdio.h>
#include<stdlib.h>

struct ALUNO{
    int matricula;
    float nota1, nota2;
};
typedef struct ALUNO Aluno;

struct ELEMENTO{
    Aluno aluno;
    struct ELEMENTO *prox;
};
typedef struct ELEMENTO Elemento;

Elemento *inicio = NULL;
Elemento *fim = NULL;
Elemento *aux;

void inserir_inicio(Aluno aluno){
    //Alocar memória para o novo elemento
    Elemento *novo = (Elemento*)malloc(sizeof(Elemento));
    //Armazenar o aluno que está sendo enviado por parâmetro na memória alocada
    novo->aluno = aluno;
    //verificar se a lista está vazia
    //Se a lista estiver vazia
    if(inicio == NULL){
        //Inserir no inicio da lista (estrategia 1)
        inicio = novo;
        fim = novo;
        fim->prox = NULL;
    }else{
        //Senão
        //Inserir no inicio da lista (estrategia 2)
        novo->prox = inicio;
        inicio = novo;
    }
}

void inserir_final(Aluno aluno){
    Elemento *novo = (Elemento*)malloc(sizeof(Elemento));
    novo->aluno = aluno;
    if(inicio == NULL){
        inicio = fim = novo;
        fim->prox = NULL;
    }else{
        fim->prox = novo;
        fim = novo;
        fim->prox = NULL;
    }
}

void imprimir(){
    if(inicio == NULL){
        printf("Lista Vazia.");
    }else{
        aux = inicio;
        while(aux != NULL){
            printf("Matricula: %d\n", aux->aluno.matricula);
            printf("//------------------------//\n");
            aux = aux->prox;
        }
    }
}

void buscar_aluno(int matricula){
    int encontrado = 0;
    if(inicio == NULL){
        printf("Lista Vazia.");
    }else{
        aux = inicio;
        while(aux != NULL){
            if(aux->aluno.matricula == matricula){
                encontrado = 1;
                printf("Matricula: %d\n", aux->aluno.matricula);
                break;
            }
            aux = aux->prox;
        }
        if(encontrado == 0)
            printf("Aluno nao encontrado.");
    }
}

int main(){
    Aluno aluno1 = {123, 9,8};
    Aluno aluno2 = {321, 7,8};
    Aluno aluno3 = {432, 6,8};
    Aluno aluno4 = {543, 9,5};

    inserir_inicio(aluno1);
    inserir_inicio(aluno2);
    inserir_inicio(aluno3);
    inserir_final(aluno4);

    //imprimir();
    buscar_aluno(432);

    return 1;
}
