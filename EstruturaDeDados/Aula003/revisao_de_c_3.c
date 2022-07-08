#include<stdio.h>

int main(){
	
	/*
		-Estruturas de Repeti��o
		-for - com vari�vel de controle
		-while - teste l�gico no in�cio do la�o
		-do...while - teste l�gico no final do la�o
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
