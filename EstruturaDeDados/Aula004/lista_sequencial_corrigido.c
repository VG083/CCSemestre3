#include <stdio.h>
#include <stdlib.h>
#define MAX 5

struct LISTA{
	int qtd;
	char letras[MAX];
};
typedef struct LISTA Lista;

Lista* criar_lista(){
	Lista *li = (Lista*) malloc(sizeof(Lista));
	if(li != NULL){//existe memória disponível para alocar a lista
		li->qtd = 0;
	}
	return li;
}

int verificar_cheia(Lista *li){
	if(li == NULL){
		return 0;
	}
	return (li->qtd == MAX);
}

int verificar_vazio(Lista *li){
	if(li == NULL){
		return 0;
	}
	return (li->qtd == 0);
}

void liberar_lista(Lista *li){
	free(li);
}

int qtde_elementos(Lista *li){
	if(li == NULL){
		return -1;
	}
	return li->qtd;
}

int inserir_final_lista(Lista *li, char letra){
	if(li == NULL){
		return 0;
	}
	if(verificar_cheia(li)){
		return 0;
	}
	li->letras[li->qtd] = letra;
	li->qtd++;
	return 1;
}

int inserir_inicio_lista(Lista *li, char letra){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == MAX){
		return 0;
	}
	int i;
	for(i = li->qtd-1; i >= 0; i--){
		li->letras[i+1] = li->letras[i];
	}
	li->letras[0] = letra;
	li->qtd++;
	return 1;
}

void imprimir_lista(Lista *li){
	int i;
	printf("\\--------------------------\n");
	for(i = 0; i < li->qtd; i++){
		printf("letras[%d]: %c\n", i, li->letras[i]);
	}
	printf("--------------------------\\\n");
}

int remover_final_lista(Lista *li){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == 0){
		return 0;
	}
	li->qtd--;
	return 1;
}

int remover_inicio_lista(Lista *li){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == 0){
		return 0;
	}
	int i;
	for(i = 0; i < li->qtd-1; i++){
		li->letras[i] = li->letras[i+1];
	}
	li->qtd--;
	return 1;
}

int remover_elemento_especifico(Lista *li, char letra){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == 0){
		return 0;
	}
	int i,j = 0;
	/*
	while (i < li->qtd && li->letras[i] != letra){
		i++;
	}
	*/
	for (i = 0; i < li->qtd; i++){
		if (li->letras[i] == letra){
			break;
		}
	}
	for (j = i; j < li->qtd; j++){
		li->letras[j] = li ->letras[j+1];
	}
	li->qtd--;
	return 1;
}

int main(){
	
	Lista *li = criar_lista();
	
	inserir_final_lista(li, 'a');
	inserir_final_lista(li, 'e');
	
	inserir_inicio_lista(li, 'f');
	
	//a
	
	//remover_final_lista(li);
	//remover_inicio_lista(li);
	
	remover_elemento_especifico(li, 'a');

	imprimir_lista(li);
	
	printf("qtde : %d\n", qtde_elementos(li));
	
	return 1;
}