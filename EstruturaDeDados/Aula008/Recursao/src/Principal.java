
public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println(pow(5,2));
		System.out.println(pow(2,4));
		
		System.out.println();
		
		System.out.println(pow_recursivo(2, 4));
	}
	
	static int pow(int num, int exp) {
		int mult = 1;
		if(exp == 0) {
			return 1;
		}
		
		//Repetição -> Recursividade
		for(int i = 0; i < exp; i++) {
			mult *= num;
		}
		
		return mult;
	}
	
	static int pow_recursivo(int num, int exp) {
		if(exp == 0) return 1;
		num *= pow_recursivo(num, exp-1);
		return num;
	}
	
	static int fatorial(int num) {
		if(num == 1) return 1;
		num *= fatorial(num-1);
		return num;
	}

}
