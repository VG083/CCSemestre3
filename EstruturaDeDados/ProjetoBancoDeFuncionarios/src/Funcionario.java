
public class Funcionario {
	public String nome;
	public float salario;
	private float imposto;
	private float receber;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, float salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public float getImposto() {
		return this.imposto;
	}
	
	public void calcularImposto() {
		if(this.salario < 850) {
			this.imposto = 0;
		}
		if(this.salario >= 850 && this.salario < 1200) {
			this.imposto = (this.salario/100)*10;
		}
		if(this.salario >= 1200) {
			this.imposto = (this.salario/100)*20;
		}
	}
	
	public float getReceber() {
		return this.receber;
	}
	
	public void calcularReceber() {
		this.receber = this.salario-this.imposto;
	}
}
