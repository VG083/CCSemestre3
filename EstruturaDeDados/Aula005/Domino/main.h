#include <stdio.h>
#include <stdlib.h>
#define MAX 5

struct PECA{
    int valor_dir, valor_esq;
};
typedef struct PECA Peca;

struct PILHA{
	int qtd;
	Peca pecas[MAX];
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

int push(Pilha *pilha, Peca peca){
	if(pilha == NULL){
		return 0;
	}
	if(pilha->qtd == MAX){
		return 0;
	}
	pilha->pecas[pilha->qtd] = peca;
	pilha->qtd++;
	return 1;
}

int pop(Pilha *pilha){
	if(pilha == NULL){
		return 0;
	}
	if(pilha->qtd == 0){
		return 0;
	}
	pilha->qtd--;
	return 1;
}

int elemento_topo(Pilha *pilha, Peca *peca){
	if(pilha == NULL){
		return 0;
	}
	if(pilha->qtd == 0){
		return 0;
	}
	*peca = pilha->pecas[pilha->qtd-1];
	return 1;
}
