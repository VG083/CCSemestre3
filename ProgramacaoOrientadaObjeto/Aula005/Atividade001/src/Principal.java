import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1,n2,n3, media;
		
		System.out.println("Digite a 1� nota: ");
		n1 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a 2� nota: ");
		n2 = Double.parseDouble(entrada.nextLine());
		System.out.println("Digite a 3� nota: ");
		n3 = Double.parseDouble(entrada.nextLine());
		
		media = (n1+n2+n3)/3;
		
		if(media <= 5){
			System.out.println("Reprovado ");
		}else if(media <= 6){
			System.out.println("Prova final ");
		}else {
			System.out.println("Aprovado ");
		}
		
		System.out.printf("M�dia: %.2f", media);
		
		entrada.close();
	}

}
