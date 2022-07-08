import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 
import java.nio.file.Files;

public class Secundaria {
    
    public static void ler(String pCaminho){
        try(
                // Ler o arquivo atraves da funcao FileReader
                BufferedReader buffRead = new BufferedReader(new FileReader(pCaminho));
                ){

            String linha = "";
            
            // Iniciacao de um laco "infinito"
            while(true){
                // Se a linha lida for diferente de nulo, ou seja tiver
                // algum conteudo, ele sera printado
                if(linha != null){
                    System.out.println(linha);
                }
                // Se a linha nao tiver conteudo o laco sera quebrado
                else{
                    break;
                }
                // Funcao responsavel por ler cada linha do programa
                linha = buffRead.readLine();
            }

        }catch(IOException e){
            // IOException e pra saber caso aconteca algum erro no programa
            e.printStackTrace();
        }
    }

    public static void escrever(String pCaminho, String pTexto) {
	try(
                // Funcao para criar um arquivo txt, a booleana true serve
                // para que caso o arquivo não exista ele crie o arquivo, e
                // se existir vai apenas alterar o arquivo
                FileWriter criarArquivo = new FileWriter (pCaminho, true);
				// Funcao buffer para armazenar os dados no arquivo criado
                BufferedWriter buffer = new BufferedWriter(criarArquivo);
                // Funcao para imprimir o buff recebido anteriormente no arquivo
				PrintWriter escritor = new PrintWriter(buffer);

            ){
                // Adicionar o que foi passado na String pTexto no arquivo
				escritor.append(pTexto);

            }catch(IOException e) {
                // IOException e pra saber caso aconteca algum erro no programa
            	e.printStackTrace();
            }
    }
    
}
