import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int[] x = new int[5];
		int[] y = new int[5];
		
		for(int i = 0; i < x.length; i++) {
			System.out.println("Digite o n� " + (i+1) + "� ");
			int n = entrada.nextInt();
			x[i] = n;
			int m = (n/2);
			y[i] = m;
		}
		
		System.out.println("\nVetor X");
		for(int i = 0; i < x.length; i++) {
			System.out.println("Posi��o " + (i+1) + ": " + x[i]);
		}
		System.out.println("\nVetor Y");
		for(int i = 0; i < y.length; i++) {
			System.out.println("Posi��o " + (i+1) + ": " + y[i]);
		}
		
		
		entrada.close();
	}

}
