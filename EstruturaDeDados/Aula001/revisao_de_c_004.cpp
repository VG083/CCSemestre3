#include<stdio.h>

struct PESSOA{
    int matricula;
    float peso, altura;
};
//typedef struct PESSOA Pessoa;

int main(){
    // Declarando vetor: tipo_primitivo nome[espaço_do_vetor]
    
    struct PESSOA p;
    // Pessoa p;

    printf("Digite a matricula: ");
    scanf("%d", &p.matricula);
    printf("Digite o peso: ");
    scanf("%f", &p.peso);
    printf("Digite a altura: ");
    scanf("%f", &p.altura);

    printf("O peso da pessoa e: %.2f", p.peso);
    
    return 1;
}