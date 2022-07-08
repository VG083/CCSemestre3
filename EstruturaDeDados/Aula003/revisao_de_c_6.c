#include<stdio.h>

//Declarar
void imprimir(int);
float imc(float, float);

int main(){
	
	float peso, altura;
	//Executar
	imprimir(2);
	
	printf("Informe o peso: ");
	scanf("%f", &peso);
	printf("Informe a altura: ");
	scanf("%f", &altura);
	
	float res = imc(peso, altura);
	
	printf("IMC: %.2f\n", res);
	printf("Fim do Main!\n");
	return 1;
}

void imprimir(int numero){
	printf("Estudando Funcoes em C, na aula %d!\n", numero);
}

float imc(float peso, float altura){
	return peso/(altura*altura);
}
