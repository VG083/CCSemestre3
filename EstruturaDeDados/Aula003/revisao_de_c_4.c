#include<stdio.h>
#define tam 3

int main(){
	int numeros[tam];
	int i;
	
	//for clássico
	for(i = 0; i < tam; i++){
		printf("Informe um numero: ");
		scanf("%d", &numeros[i]);
	}
	
	for(i = 0; i < tam; i++){
		printf("numeros[%d]: %d\n", i, numeros[i]);
	}
	return 1;
}
