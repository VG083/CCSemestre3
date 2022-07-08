import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String senha = "";
		
		while(!senha.equals("naodigo")) {
			System.out.println("\nDigite a senha");
			senha = entrada.next();
			
			if(senha.equals("naodigo")) {
				System.out.println("Senha correta");
			}
			else {
				System.out.println("Você não sabe a senha =P");
			}
		}
		
		entrada.close();
	}

}
