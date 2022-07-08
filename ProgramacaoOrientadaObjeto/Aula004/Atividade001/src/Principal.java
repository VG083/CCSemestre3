
public class Principal {

	public static void main(String[] args) {
		double n1 = 10;
		double n2 = 3;
		double resultado = (n1/n2);
		String nome = "Zé";
		
		System.out.println(String.format("%.2f", resultado));
		
		System.out.printf("%.2f"+nome, resultado);
		
		System.out.printf("\n"+nome);
	}

}
