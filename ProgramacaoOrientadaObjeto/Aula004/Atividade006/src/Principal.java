import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nome1, nome2, nome3, maior;
		System.out.println("Digite o primeiro nome: ");
		nome1 = entrada.nextLine();
		System.out.println("Digite o segundo nome: ");
		nome2 = entrada.nextLine();
		System.out.println("Digite o terceiro nome: ");
		nome3 = entrada.nextLine();
		
		if (nome1.compareTo(nome2)>0) {maior = nome1;}
		else {maior = nome2;}
		
		if (maior.compareTo(nome3)>0) {}
		else {maior = nome3;}
		
		System.out.println("O nome mais próximo de z é "+maior);
	}

}
