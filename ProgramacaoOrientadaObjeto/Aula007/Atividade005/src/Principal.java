import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) { 
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Ana");
		nomes.add("Bruno");
		nomes.add("Carlos");
		nomes.add(3, "Daniel");
		nomes.remove(1);
		nomes.set(1, "Carol");
		System.out.println(nomes.size());

		for(String n: nomes){
		System.out.println(n);
		}
		
		entrada.close();
	}

}
