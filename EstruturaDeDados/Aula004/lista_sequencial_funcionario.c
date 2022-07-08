#include <stdio.h>
#define MAX 5

struct FUNCIONARIO{
    int matricula;
    float salario
};
typedef struct FUNCIONARIO Funcionario;

struct LISTA
{
    int qtd;
    Funcionario funcionarios[MAX];
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

int inserir_final_lista(Lista *li, Funcionario funcionario){
	if(li == NULL){
		return 0;
	}
	if(verificar_cheia(li)){
		return 0;
	}
	li->funcionarios[li->qtd] = funcionario;
	li->qtd++;
	return 1;
}

int inserir_inicio_lista(Lista *li, Funcionario funcionario){
	if(li == NULL){
		return 0;
	}
	if(li->qtd == MAX){
		return 0;
	}
	int i;
	for(i = li->qtd-1; i >= 0; i--){
		li->funcionarios[i+1] = li->funcionarios[i];
	}
	li->funcionarios[0] = funcionario;
	li->qtd++;
	return 1;
}

void imprimir_lista(Lista *li){
	int i;
	printf("\\--------------------------\n");
	for(i = 0; i < li->qtd; i++){
		printf("Matricula: %d\n", i, li->funcionarios[i].matricula);
        printf("Salario: %.2f\n", i, li->funcionarios[i].salario);
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
		li->funcionarios[i] = li->funcionarios[i+1];
	}
	li->qtd--;
	return 1;
}

int remover_elemento_especifico(Lista *li, Funcionario funcionario){
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
		if (li->funcionarios[i].matricula == funcionario.matricula){
			break;
		}
	}
	for (j = i; j < li->qtd; j++){
		li->funcionarios[j] = li ->funcionarios[j+1];
	}
	li->qtd--;
	return 1;
}

int main(){
    Lista *lista = criar_lista();
    Funcionario f;
    int opcao;

    do{
        printf("--------Menu--------\n");
        printf("1. Inserir no final da lista\n");
        printf("2. Imprimir a lista\n");
        printf("3. Sair\n");
        printf("Digite a opcao: ");
        scanf("%d", &opcao);

        switch(opcao){
        case 1:
            printf("Informe a matricula do funcionario: ");
            scanf("%d", &f.matricula);
            printf("Informe o salario do funcionario: ");
            scanf("%f", &f.salario);
            if (inserir_final_lista(lista, f) == 1){
                printf("Inserido com sucesso!\n");
            }else{
                printf("Erro ao inserir na lista!\n");
            }
            break;
        case 2:
            imprimir_lista(lista);
            break;
        default:
            printf("Informe uma opcao valida(1-3)!");
        }
    }while (opcao != 3);
    
    
    return 1;
}