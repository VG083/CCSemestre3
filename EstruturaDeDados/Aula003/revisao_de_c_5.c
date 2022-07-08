#include<stdio.h>
#define tam 3

struct PESSOA{
	int matricula;
	float peso, altura, imc;
};
typedef struct PESSOA Pessoa;

int main(){
	
	Pessoa pessoas[tam];
	int i;
	
	for(i = 0; i < tam; i++){
		printf("Informe a matricula do aluno: ");
		scanf("%d",&pessoas[i].matricula);
		printf("Informe o peso do aluno: ");
		scanf("%f",&pessoas[i].peso);
		printf("Informe o altura do aluno: ");
		scanf("%f",&pessoas[i].altura);
		
		pessoas[i].imc = pessoas[i].peso/(pessoas[i].altura*pessoas[i].altura);
	}
	
	return 1;
}
