
public class Contato {
	private String contato;
	private String nome;
	
	public String getContato() {
		return contato;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String exibeContato() {
		return "Nome: "+getNome()+" | Contato: "+getContato();
	}
	
}
