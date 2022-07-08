
public class Gerente extends Funcionario{
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	private String projeto;

	public String getProjeto() {
		return projeto;
	}
	
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	
	public void informarProjeto() {
		System.out.println("O projeto é "+getProjeto());
	}
	
}
