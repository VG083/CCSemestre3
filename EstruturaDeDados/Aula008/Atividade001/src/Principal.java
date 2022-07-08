import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//int numero, expoente;
		//System.out.println("Digite o numero");
		//numero = entrada.nextInt();
		//System.out.println("Digite o expoente");
		//expoente = entrada.nextInt();
		
		System.out.println(pow(5,2));
		System.out.println(powrecursivo(5,2));
		System.out.println(pow(2,4));
		System.out.println(powrecursivo(2,4));
		System.out.println(fatorial(7));
		System.out.println(fatorial(14));
		System.out.println(fatorial(15));
		System.out.println(fatorial(16));

		entrada.close();
	}
	
	static int pow(int num, int exp) {
		int mult = 1;
		if(exp == 0) {
			return 1;
		}
		for(int i = 0; i < exp; i++) {
			mult *= num;
		}
		return mult;
	}
	
	static int powrecursivo(int num, int exp) {
		if(exp == 0) return 1;
		num *= powrecursivo(num, exp-1);
		return num;
	}
	
	static int fatorial(int num) {
		if(num == 1) return 1;
		num *= fatorial(num-1);
		return num;
	}

}
