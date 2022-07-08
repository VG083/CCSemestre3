#include "main.h"

int main()
{
    Peca peca1 = {4,5};
    Peca peca2 = {1,1};
    Peca peca3 = {2,5};
    Peca peca_topo;

    Pilha *pilha = criar_pilha();

    push(pilha, peca2);
    push(pilha, peca1);
    push(pilha, peca3);

    elemento_topo(pilha, &peca_topo);

    printf("A ultima peca empilhada foi %d-%d\n", peca_topo.valor_dir, peca_topo.valor_esq);

    return 0;
}
