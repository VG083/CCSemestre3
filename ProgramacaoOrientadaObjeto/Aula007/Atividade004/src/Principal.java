
public class Principal {

	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		
		for(int linha = 0; linha < 5; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				matriz[linha][coluna] = linha+1;
			}
		}
		
		for(int linha = 0; linha < 5; linha++) {
			System.out.print(" | ");
			for(int coluna = 0; coluna < 5; coluna++) {
				System.out.print(" " + matriz[linha][coluna] + " ");
			}
			System.out.println(" | ");
		}
	}

}
