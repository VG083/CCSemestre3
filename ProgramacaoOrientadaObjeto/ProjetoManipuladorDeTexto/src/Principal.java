import java.io.File;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "";
        int escolha = 0;
        boolean ligar = true;
	
	System.out.println("Manipulador de arquivo txt v1.0\n");
	    
        // Laco de repeticao do...while para manter o programa rodando enquanto
        // a variavel ligar for verdadeira
        do {
        // Apresente um menu no console com 3 opcoes
        System.out.println("1. Inserir nome no arquivo");
        System.out.println("2. Exibir todos os nomes do arquivo");
        System.out.println("3. Apagar todo arquivo");
        System.out.println("4. Fechar programa");
        
        // Receber escolha do usuario:
        System.out.println("\nO que voce deseja fazer?");
       	escolha = entrada.nextInt();
        
        // Realizar escolha do usuario atraves da variável escolha
      	switch(escolha) {
            // 1- Inserir nome no arquivo
            case 1:
                // Recebendo variavel para ser utilizada a funcao escrever
                // dentro da classe Secundaria
                System.out.println("Digite um nome");
                entrada.nextLine();
                nome = entrada.nextLine();
                Secundaria.escrever("projeto.txt", nome + "\n");
                break;
            // 2- Exibir todos os nomes do arquivo
            case 2: 
                // Utilizando a funcao de ler dentro da classe Secundaria
            	Secundaria.ler("projeto.txt");
                System.out.println("\n");
            	break;
            // 3- Apagar todo arquivo
            case 3:
                // Reconhecendo o arquivo para ser deletado
                File arquivo = new File("projeto.txt");
                if(arquivo.delete()){
                  System.out.println("Arquivo excluido com sucesso.");
                }
                else{
                  System.out.println("Nao foi possivel excluir o arquivo");
                }
            	break;
            case 4:
                // Mudar a variavel ligar para encerrar o do...while
                ligar = false;
                break;
            default:
                // Opcao para caso o usuario erre uma opcao valida
                System.out.println("Opcao invalida, tente novamente");
            	break;
            }
        }while(ligar == true);

    }
    
}
