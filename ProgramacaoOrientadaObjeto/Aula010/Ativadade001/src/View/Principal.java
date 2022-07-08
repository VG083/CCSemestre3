package View;

import Animais.*;

public class Principal {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		gato.setRaça("Preto");
		System.out.println(gato.exibirBarulho());
		
		Cachorro cachorro = new Cachorro();
		cachorro.setRaça("Vira lata");
		System.out.println(cachorro.exibirBarulho());
	}

}
