#include <stdio.h>
#include <stdlib.h>
#define MAX 5

struct FILA{]
    int qtd, inicio, fim;
    int dados[MAX];
};
typedef struct FILA Fila;

Fila* criar_fila(){
    Fila *fila = (Fila*)malloc(sizeof(Fila));
    if(fila != NULL){
        fila->inicio = 0;
        fila->fim = 0;
        fila->qtd = 0;
    }
    return fila;
}

int enfileirar(Fila *fila, int valor){
    if(fila == NULL || fila->qtd == MAX){
        return 0;
    }
    fila->dados[fila->fim] = valor;
    fila->fim = (fila->fim+1)%MAX;
    /*if(fila->fim == MAX){
        fila->fim = 0;
    }*/
    fila->qtd++;
    return 1;
}


int main()
{
    printf("Hello world!\n");
    return 0;
}
