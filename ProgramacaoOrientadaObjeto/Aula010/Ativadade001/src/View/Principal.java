package View;

import Animais.*;

public class Principal {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.setRa�a("Preto");
		System.out.println(gato.exibirBarulho());
		
		Cachorro cachorro = new Cachorro();
		cachorro.setRa�a("Vira lata");
		System.out.println(cachorro.exibirBarulho());
	}

}
