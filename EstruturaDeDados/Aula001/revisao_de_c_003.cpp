#include<stdio.h>

int main(){
    /*
        Estruturas de repetiçoes
        - for - com variável de controle
        - while - teste lógico no início do laço
        - do... while - teste lógico no final do laço
    */

    int idade, media;
    int acumulador = 0, contador = 0;

    printf("Informe uma idade: ");
       scanf("%d", &idade);
    while(idade > 0){
       printf("Informe uma idade: ");
       scanf("%d", &idade);
       acumulador += idade;
       contador++;
    }
    
   return 1;
}