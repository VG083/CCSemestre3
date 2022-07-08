import java.io.File;
import java.util.Scanner;

public class Principal {

	static Elemento inicio = null;
	static Elemento fim = null;
	static Elemento auxiliar = null;
	static Elemento anterior = null; 
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String letra = "";
		String nome = "";
		float salario = 0;
        int escolha = 0;
        boolean ligar = true;
	
        inserirFuncionario(new Funcionario("Jose Nilton", 7000));
        inserirFuncionario(new Funcionario("Danilo Oliveira", 6000));
        inserirFuncionario(new Funcionario("Josemilson", 5000));
		inserirFuncionario(new Funcionario("Ricardo Sardinha", 4000));
		inserirFuncionario(new Funcionario("Pedro Lucas", 3000));
		inserirFuncionario(new Funcionario("Everton Neto", 2000));
		inserirFuncionario(new Funcionario("Thiago Medeiros", 1000));
        
        System.out.println("Banco de Funcionarios");
        do {
        	System.out.println("\n1. Cadastrar novo funcionário");
        	System.out.println("2. Listar funcionarios em ordem crescente");
        	System.out.println("3. Listar funcionarios em ordem decrescente");
	        System.out.println("4. Pesquisar por letra");
	        System.out.println("5. Fechar programa");
	        
	        System.out.println("\nO que voce deseja fazer?");
	       	escolha = entrada.nextInt();
	        
	      	switch(escolha) {
	            case 1:
	            	System.out.println("\nCadastrando novo funcionário\n");
	            	System.out.println("Digite o nome do novo funcionário: ");
	                entrada.nextLine();
	                nome = entrada.nextLine();
	                System.out.println("Digite o salário do novo funcionário: ");
	                salario = entrada.nextFloat();
	                if(inicio == null) {
	                	inserirFuncionario(new Funcionario(nome, salario));
	                }else {
	                	inserirFuncionarioNaOrdem(new Funcionario(nome, salario));
	                }
	                break;
	            case 2:
	            	System.out.println("\n2. Listando funcionários em ordem crescente\n");
	            	listar();
	            	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	            	break;
	            case 3:
	            	System.out.println("\n3. Listando funcionários em ordem decrescente\n");
	            	listarReverso();
	            	System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	            	break;
	            case 4:
	            	System.out.println("\n4. Pesquisando por letra");
	            	System.out.println("Digite uma letra: ");
	                entrada.nextLine();
	                letra = entrada.nextLine();
	                pesquisar(letra);
	                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
	                break;
	            case 5:
	                ligar = false;
	                break;
	            default:
	                // Opcao para caso o usuario erre uma opcao valida
	                System.out.println("\nOpcao invalida, tente novamente");
	            	break;
	            }
        }while(ligar == true);
		
		System.out.println("\nFim do programa");
	}

	static void inserirFuncionario(Funcionario funcionario) {
		Elemento novoElemento = new Elemento();
		funcionario.calcularImposto();
		funcionario.calcularReceber();
		novoElemento.funcionario = funcionario;
		if(inicio == null) {
			inicio = novoElemento;
			fim = novoElemento;
			novoElemento.ant = null;
			novoElemento.prox = null;
		}else {
			novoElemento.ant = null;
			inicio.ant = novoElemento;
			novoElemento.prox = inicio;
			inicio = novoElemento;
		}
	}
	
	static void inserirFuncionarioNaOrdem(Funcionario funcionario) {
		Elemento novoElemento = new Elemento();
		funcionario.calcularImposto();
		funcionario.calcularReceber();
		novoElemento.funcionario = funcionario;
		auxiliar = inicio;
		anterior = inicio;
		if(inicio == null) {
			inicio = novoElemento;
			fim = novoElemento;
			novoElemento.ant = null;
			novoElemento.prox = null;
		}else {
			
		}
		while(auxiliar != null) {
			if(auxiliar.funcionario.salario > novoElemento.funcionario.salario) {
				break;
			}
		anterior = auxiliar;
		auxiliar = auxiliar.prox;
		}
		novoElemento.ant = auxiliar.ant; 
		auxiliar.ant = novoElemento;
		novoElemento.prox = auxiliar;
		anterior.prox = novoElemento; 
	}
	
	static void listar() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		auxiliar = inicio;
		while(auxiliar != null) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Nome: " + auxiliar.funcionario.nome);
			System.out.println("Salario: " + auxiliar.funcionario.salario);
			System.out.println("Imposto: " + auxiliar.funcionario.getImposto());
			System.out.println("Receber: " + auxiliar.funcionario.getReceber());
			auxiliar = auxiliar.prox;
		}
		
	}
	
	static void listarReverso() {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		auxiliar = fim;
		while(auxiliar != null) {
			System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			System.out.println("Nome: " + auxiliar.funcionario.nome);
			System.out.println("Salario: " + auxiliar.funcionario.salario);
			System.out.println("Imposto: " + auxiliar.funcionario.getImposto());
			System.out.println("Receber: " + auxiliar.funcionario.getReceber());
			auxiliar = auxiliar.ant;
		}
		
	}
	
	static void pesquisar(String letra) {
		if(inicio == null) {
			System.out.println("Lista vazia");
			return;
		}
		Elemento aux = inicio;
		while(aux != null) {
			if(aux.funcionario.nome.startsWith(letra) == true) {
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				System.out.println("Nome: " + aux.funcionario.nome);
				System.out.println("Salario: " + aux.funcionario.salario);
				System.out.println("Imposto: " + aux.funcionario.getImposto());
				System.out.println("Receber: " + aux.funcionario.getReceber());
			}
			aux = aux.prox;
		}
	}
	
	
}
