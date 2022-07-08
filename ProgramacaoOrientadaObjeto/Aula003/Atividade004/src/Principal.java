import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Graus Fahrenheit: ");
		double fahrenheit = Double.parseDouble(entrada.next());
		
		System.out.println("\nGraus Fahrenheit: " + fahrenheit);
		System.out.println("Graus Celsius: " + (((fahrenheit-32)/9)*5));
	}

}
