
public class Principal {

	public static void main(String[] args) {
		Retangulo r1 = new Retangulo();
		r1.setAltura(10);
		r1.setLargura(20);
		System.out.println("A largura �: "+r1.getLargura());
		System.out.println("A altura �: "+r1.getAltura());
		System.out.println("A largura �: "+r1.calcularArea());
		System.out.println("A largura �: "+r1.calcularPerimetro());
		System.out.println(r1);
	}

}
