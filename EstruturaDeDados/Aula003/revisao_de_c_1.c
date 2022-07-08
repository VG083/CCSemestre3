#include<stdio.h>

int main(){
	int idade = 30;
	float peso = 100;
	char letra = 'a';
	
	//Instrução de Saída
	printf("Revisao da Linguagem C\n");
	printf("Informe uma idade: ");
	/*
		Marcadores (Formatador)
		-%d - decimal (inteiro)
		-%f - real
		-%c - charactere
	*/
	scanf("%d",&idade);
	printf("Sua idade eh: %d\n", idade);

	
	return 1;	
}
