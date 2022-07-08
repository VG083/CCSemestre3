struct ALUNO{
    int matricula;
    char materia[40];
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
Elemento *ant;

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

void inserir_ordenada(Aluno aluno){
    Elemento *novo = (Elemento*)malloc(sizeof(Elemento));
    novo->aluno = aluno;
    if(inicio == NULL){
        inicio = fim = novo;
        fim->prox = NULL;
    }else{
        aux = inicio;
        ant = inicio;
        while(aux != NULL && aux->aluno.matricula < novo->aluno.matricula){
            ant = aux;
            aux = aux->prox;
        }
        if(aux == inicio){
            novo->prox = inicio;
            inicio = novo;
        }
        else{
            novo->prox = ant->prox;
            ant->prox = novo;
        }
    }
}

void imprimir_especifico(int matricula){
    if(inicio == NULL){
        printf("\nLista Vazia");
    }
    else{
        aux = inicio;
        while(aux != NULL){
            if(matricula == aux->aluno.matricula){
                printf("Materia: %s\n", aux->aluno.materia);
            }
            aux = aux->prox;
        }
    }
}

void imprimir(){
    if(inicio == NULL){
        printf("Lista Vazia.");
    }else{
        aux = inicio;
        while(aux != NULL){
            printf("Matricula: %d\n", aux->aluno.matricula);
            printf("Materia: %s", aux->aluno.materia);
            printf("\n//------------------------//\n\n");
            aux = aux->prox;
        }
    }
}