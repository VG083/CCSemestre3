#include<stdio.h>

int main(){
    int matricula;
    float nota1, nota2, media;
    printf("Informe a sua matricula: ");
    scanf("%d", &matricula);
    printf("Informe a primeira nota: ");
    scanf("%f", &nota1);
    printf("Informe a segunda nota: ");
    scanf("%f", &nota2);
    
    /*
        Operadores aritmeticos
        - +, -, *, /
        - =
    */

    media = (nota1+nota2)/2;
    
    printf("A media do aluno e: %.2f\n", media);

    /*
        Estruturas condicionais
        Simples - if
        Composta - if... else
        Aninhada - if... else if...

        Operadores relacionais
        - >, <, >=, <=, ==, !=
    */

   if(media <4){
       printf("Reprovado!\n");
   }else if(media >= 4 && media <6){
       printf("Recuperacao!\n");
   }else{
       printf("Aprovado!\n");
   }

    return 1;
}