import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int codigo;
		
		System.out.println("Digite o c�digo do produto: ");
		codigo = entrada.nextInt();
		
		switch(codigo) {
			case 1:
				System.out.println("Ver�o");
				break;
			case 2:
				System.out.println("Outono");
				break;
			case 3:
				System.out.println("Inverno");
				break;
			case 4:
				System.out.println("Primavera");
				break;
			default:
				System.out.println("Op��o inv�lida");
		}
	}

}
