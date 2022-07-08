package Animais;

public abstract class Animal {

	private String raça;
	
	public String getRaça() {
		return raça;
	}
	
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
	public abstract String exibirBarulho();
}
