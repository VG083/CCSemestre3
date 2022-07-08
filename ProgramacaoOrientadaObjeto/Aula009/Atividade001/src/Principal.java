import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Gerente g = new Gerente(null, 1000);
		Programador p = new Programador(null, 1000);
		System.out.println("Qual o projeto do gerente? ");
		g.setProjeto(entrada.nextLine());
		System.out.println("Qual a linguagem do programador? ");
		p.setLinguagem(entrada.nextLine());
		
		g.informarProjeto();
		p.informarLinguagem();
		
		Funcionario f1 = new Gerente(null, 1000);
		Funcionario f2 = new Programador(null, 1000);
		
		
		
		
	}

}
