import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int qtdsim = 0;
		int qtdnao = 0;
		int escolha = -1;
		
		do {
			System.out.println("\nQual seu voto: 1-sim; 2-nao; 0-sair");
			escolha = entrada.nextInt();
			switch(escolha) {
			case 0: 
				System.out.println("Saindo");
				break;
			case 1: 
				qtdsim++;
				System.out.println("Votou sim");
				break;
			case 2: 
				qtdnao++;
				System.out.println("Votou não");
				break;
			default:
				System.out.println("Erro");
				break;
			}
		}while(escolha!=0);
		
		System.out.println("\nVotos sim: "+qtdsim);
		System.out.println("Votos não: "+qtdnao);
	}

}
