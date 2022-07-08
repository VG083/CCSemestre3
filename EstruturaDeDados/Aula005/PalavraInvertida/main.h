#include <stdio.h>
#include <stdlib.h>

struct PILHA{
    int qtd;
    char palavra[50];
};
typedef struct PILHA Pilha;

Pilha* criar_pilha(){
    Pilha *pilha = (Pilha*)malloc(sizeof(Pilha));
    int i = 0;
    if(pilha != NULL){
        pilha->qtd = 0;
    }
    return pilha;
}

int copiar_palavra(Pilha *pilha, char palavra[]){
    int i = 0;
    while(palavra[i] != '\0'){
        pilha->palavra[i] = palavra[i];
        i++;
    }
    pilha->qtd=i;
    return 1;
}

void imprimir_pilha(Pilha *pilha){
    int i;
    printf("//--------------------------\n");
    for(i = pilha->qtd-1; i >= 0; i--){
        printf("%c",pilha->palavra[i]);
    }
    printf("\n");
    printf("--------------------------\\\n");
}
