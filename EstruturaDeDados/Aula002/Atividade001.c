#include <stdio.h>
#define MAX 5

struct LISTA{
	int qtd;
	char letras[MAX];
};
typedef struct LISTA Lista;

Lista* criar_lista(){
	Lista *li = (Lista*) malloc(sizeof(Lista));
	if(li != NULL){
		li->qtd = 0;
	}
	return li;
}

void inserir_final_lista(Lista *li, char letra){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == MAX){
		return 0;
	}
	li->letras[li->qtd] = letra;
	li->qtd++;
	return 1;
}

int main(){
	
	Lista *li = criar_lista();
	
	inserir_final_lista(li, 'a');
	inserir_final_lista(li, 'e');
	
	printf("qtde: %d\n", li->qtd);
	
	return 1;
}
