#include "main.h"

int main()
{
    char palavra[50];
    Pilha *pilha = criar_pilha();

    printf("Informe a palavra: ");
    gets(palavra);

    copiar_palavra(pilha, palavra);

    imprimir_pilha(pilha);

    return 0;
}
