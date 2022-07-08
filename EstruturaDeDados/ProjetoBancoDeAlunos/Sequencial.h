#define MAX 60

struct LISTA{
	int qtd;
	int rgm[MAX];
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

int inserir_final_lista(Lista *li, int novorgm){
	if(li == NULL){
		return 0;
	}
	if(verificar_cheia(li)){
		return 0;
	}
	li->rgm[li->qtd] = novorgm;
	li->qtd++;
	return 1;
}

int inserir_inicio_lista(Lista *li, int novorgm){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == MAX){
		return 0;
	}
	int i;
	for(i = li->qtd-1; i >= 0; i--){
		li->rgm[i+1] = li->rgm[i];
	}
	li->rgm[0] = novorgm;
	li->qtd++;
	return 1;
}

int inserir_lista_ordenada(Lista *li, int novorgm){
	if(li == NULL){
		return 0;
	}
	if(verificar_cheia(li)){
		return 0;
	}
	int k, i = 0;
	while(i<li->qtd && li->rgm[i] < novorgm){
		i++;
	}
	for(k = li->qtd-1; k>= i; k--){
		li->rgm[i+1] = li->rgm[k];
	}
	li->rgm[i] = novorgm;
	li->qtd++;
	return 1;
}

void imprimir_lista(Lista *li){
	int i;
	printf("\\--------------------------\n");
	for(i = 0; i < li->qtd; i++){
		printf("RGM do %d aluno: %d\n", i+1, li->rgm[i]);
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
		li->rgm[i] = li->rgm[i+1];
	}
	li->qtd--;
	return 1;
}

int remover_elemento_especifico(Lista *li, int novorgm){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == 0){
		return 0;
	}
	int i,j = 0;
	for (i = 0; i < li->qtd; i++){
		if (li->rgm[i] == novorgm){
			break;
		}
	}
	for (j = i; j < li->qtd; j++){
		li->rgm[j] = li ->rgm[j+1];
	}
	li->qtd--;
	return 1;
}