import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int VetorA[] = new int[5];
		int VetorB[] = new int[5];
		int i = 0;
		
		for(i=0; i<5; i++) {
			System.out.println("Digite um número");
			VetorA[i] = entrada.nextInt();
		}
		
		for(i=0; i<5; i++) {
			System.out.println("Digite um número");
			VetorB[i] = VetorA[i] * VetorA[i];
		}
		
		System.out.println("\nVetor A");
		System.out.println("1) " + VetorA[0]);
		System.out.println("2) " + VetorA[1]);
		System.out.println("3) " + VetorA[2]);
		System.out.println("4) " + VetorA[3]);
		System.out.println("5) " + VetorA[4]);
		
		System.out.println("\nVetor B");
		System.out.println("1) " + VetorB[0]);
		System.out.println("2) " + VetorB[1]);
		System.out.println("3) " + VetorB[2]);
		System.out.println("4) " + VetorB[3]);
		System.out.println("5) " + VetorB[4]);
		
		
		
		
		entrada.close();
	}

}
