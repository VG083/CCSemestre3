#include<stdio.h>

int main(){
    


    int idade = 30;
    float peso = 100;
    char letra = 'a';

    //Instrução de saída
    printf("Revisao da Linguagem C\n");
    printf("Informe uma idade: ");
    /*
        Marcadores (Formatador)
        - %d - int
        - %f - float
        - %c - char
    */
   scanf("%d", &idade);
   printf("Sua idade e: %d\n", idade);

   return 1;
}