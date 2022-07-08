#include<stdio.h>

int main(){
	int matricula;
	float nota1, nota2, media;
	
	printf("Informe a sua matricula: ");
	scanf("%d",&matricula);
	printf("Informe a primeira nota: ");
	scanf("%f",&nota1);
	printf("Informe a segunda nota: ");
	scanf("%f",&nota2);
	
	/*
		Operadores Aritmeticos
		- +,-,*,/
		- =
	*/
	
	media = (nota1+nota2)/2;
	
	printf("A media do aluno eh: %.2f\n", media);
	
	/*
		Estruturas Condicionais
		Simples - if
		Composta - if..else
		Aninhada - if...else if...
		
		Operadores Relacionais
		- >, <, >=, <=, ==, !=
		
		Operadores Lógicos
		- &&, ||, !
	*/
	
	if(media < 4){
		printf("Reprovado!\n");
	}else if(media < 6){
		printf("Recuperacao!\n");
	}else{
		printf("Aprovado!\n");
	}
	
	return 1;
}
