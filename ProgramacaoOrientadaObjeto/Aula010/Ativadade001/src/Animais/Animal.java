package Animais;

public abstract class Animal {

	private String ra�a;
	
	public String getRa�a() {
		return ra�a;
	}
	
	public void setRa�a(String ra�a) {
		this.ra�a = ra�a;
	}
	
	public abstract String exibirBarulho();
}
