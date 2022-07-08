#include <stdio.h>
#include <stdlib.h>
#define MAX 5

struct PILHA{
    int qtd;
    char letras[MAX];
};
typedef struct PILHA Pilha;

Pilha* criar_pilha(){
    Pilha *pilha = (Pilha*) malloc(sizeof(Pilha));
    if(pilha != NULL){
        pilha->qtd = 0;
    }
    return pilha;
}

void liberar_pilha(Pilha *pilha){
    free(pilha);
}

int push(Pilha *pilha, char letra){
    if(pilha == NULL){
        return 0;
    }
    if(pilha->qtd == MAX){
        return 0;
    }
    pilha->letras[pilha->qtd] = letra;
    pilha->qtd++;
    return 1;
}

int pop(Pilha *pilha){
    if(pilha == NULL){
        return 0;
    }
    if(pilha->qtd == MAX){
        return 0;
    }
    pilha->qtd--;
    return 1;
}

int elemento_topo(Pilha *pilha, char *letra){
    if(pilha == NULL){
        return 0;
    }
    if(pilha->qtd == MAX){
        return 0;
    }
    *letra = pilha->letras[pilha->qtd-1];
    return 1;
}

int main(){
    char letra;

    //elemento_topo(pilha, &letra);
    
    return 1;
}