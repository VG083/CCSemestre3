#include<stdio.h>

int main(){
	
	/*
		-Estruturas de Repetição
		-for - com variável de controle
		-while - teste lógico no início do laço
		-do...while - teste lógico no final do laço
	*/
	
	int idade;
	int acumulador = 0, contador = 0;
	float media;
	
	for(;;){
		printf("Informe uma idade: ");
		scanf("%d",&idade);
		if(idade > 0){
			acumulador += idade;
			contador++;
		}
		if(idade <= 0){
			break;
		}
	}
	
	if(contador > 0){
		media = acumulador/contador;
		printf("A media eh: %.2f", media);
	}
	
	return 1;
}
