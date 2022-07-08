
public class Aluno {
	public int rgm;
	public String nome;
	public float n1, n2;
	private float media;
	
	public Aluno() {
		
	}
	
	public Aluno(int rgm, String nome, float n1, float n2) {
		this.rgm = rgm;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	
	public float getMedia() {
		return this.media;
	}
	
	public void calcularMedia() {
		this.media = (this.n1+this.n2)/2;
	}
}
