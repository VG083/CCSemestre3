#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "Encadeada.h"
#include "Sequencial.h"

int main(){
    int ligar_programa = 0;
    Lista *li = criar_lista();
    Aluno aluno;

    inserir_lista_ordenada(li, 27287467);
    inserir_lista_ordenada(li, 40028922);
    inserir_lista_ordenada(li, 86368899);
    Aluno aluno1 = {27287467, "Estrutura de dados"};
    Aluno aluno2 = {27287467, "Programacao orientada a objetos"};
    Aluno aluno3 = {27287467, "Matematica discreta"};
    Aluno aluno4 = {40028922, "Estrutura de dados"};
    Aluno aluno5 = {40028922, "Programacao orientada a objetos"};
    Aluno aluno6 = {40028922, "Matematica discreta"};
    Aluno aluno7 = {86368899, "Estrutura de dados"};
    Aluno aluno8 = {86368899, "Programacao orientada a objetos"};
    Aluno aluno9 = {86368899, "Matematica discreta"};
    inserir_ordenada(aluno1);
    inserir_ordenada(aluno2);
    inserir_ordenada(aluno3);
    inserir_ordenada(aluno4);
    inserir_ordenada(aluno5);
    inserir_ordenada(aluno6);
    inserir_ordenada(aluno7);
    inserir_ordenada(aluno8);
    inserir_ordenada(aluno9);
    
    

    while(ligar_programa == 0){
        int escolha = 0;

        system("cls");
        printf("Menu\n");
        printf("\n1. Ver lista de alunos e suas materias");
        printf("\n2. Procurar aluno por RGM");
        printf("\n3. Criar cadastro de aluno");
        printf("\n4. Inserir nova materia por RGM");
        printf("\n5. Remover aluno por RGM");
        printf("\n6. Fechar programa\n");
        printf("\nO que voce deseja fazer? ");
        scanf("%d", &escolha);
        
        switch (escolha){
        case 1:
            system("cls");
            printf("Ver lista de alunos e suas materias\n");
            int i;
            for(i = 0; i < li->qtd; i++){
                printf("\nRGM do %d aluno: %d\n", i+1, li->rgm[i]);
                imprimir_especifico(li->rgm[i]);
            }
            system("pause");
            break;
        case 2:
            system("cls");
            printf("Procurar aluno por RGM\n");
            int buscar_rgm;
            printf("Digite o RGM que deseja apagar: ");
            scanf("%d", &buscar_rgm);
            printf("\nAluno de RGM %d\n", buscar_rgm);
            imprimir_especifico(buscar_rgm);
            system("pause");
            break;
        case 3:
            system("cls");
            printf("Criar cadastro de aluno\n");
            int novorgm;
            printf("\nInsira o RGM do novo aluno: ");
            scanf("%d", &novorgm);
            inserir_lista_ordenada(li, novorgm);
            imprimir_lista(li);
            system("pause");
            break;
        case 4:
            system("cls");
            printf("Inserir nova materia por RGM\n");
            printf("\nInsira o RGM do aluno: ");
            scanf("%d", &aluno.matricula);
            printf("Insira o nome da materia: ");
            getchar();
            fgets(aluno.materia, 40, stdin);
            aluno.materia[strcspn(aluno.materia, "\n")] = '\0';
            inserir_ordenada(aluno);
            imprimir();
            system("pause");
            break;
        case 5:
            system("cls");
            printf("Remover aluno por RGM\n");
            int apagar = 0;
            printf("Digite o RGM do aluno que deseja apagar: ");
            scanf("%d", &apagar);
            remover_elemento_especifico(li, apagar);
            system("pause");
            break;
        case 6:
            ligar_programa = 1;
            break;
        default:
            system("cls");
            printf("Opcao inexistente, tente novamente\n");
            system("pause");
            break;
        }
    }
    printf("Programa fechado");
    return 1;



    /*
    Aluno aluno;
    scanf("%d", &aluno.matricula);
    getchar();
    fgets(aluno.materia, 40, stdin);
    aluno.materia[strcspn(aluno.materia, "\n")] = '\0';

    inserir_ordenada(aluno);

    imprimir();

    Lista *li = criar_lista();
	
	inserir_lista_ordenada(li, 11111111);
	inserir_lista_ordenada(li, 33333333);
	
	//inserir_inicio_lista(li, 22222222);
	inserir_lista_ordenada(li, 22222222);

	imprimir_lista(li);
	
	printf("qtde : %d\n", qtde_elementos(li));
    */
}

