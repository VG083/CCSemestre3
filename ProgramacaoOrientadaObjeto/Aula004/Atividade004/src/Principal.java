import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double num;
		
		System.out.println("Digite a média do aluno: ");
		num = entrada.nextDouble();
		
		if(num < 5) {
			System.out.println("Reprovou");
		}else if(num <7){
			System.out.println("Vai para a prova final");
		}else{
			System.out.println("Passou por média");
		}
		
		entrada.close();
	}
}