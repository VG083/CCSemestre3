
public class Retangulo {
	private int altura;
	private int largura;
	
	public void setLargura(int largura){
		this.largura = largura;
	}
	
	public int getLargura(){
		return this.largura;
	}
	
	public void setAltura(int altura){
		this.altura = altura;
	}
	
	public int getAltura(){
		return this.altura;
	}
	
	public int calcularArea(){
		return (this.altura * this.largura);
	}
	
	public int calcularPerimetro(){
		return ( (2*getAltura()) + (2*getLargura()) );
	}
	
	public String toString() {
		return "Altura: "+getAltura()+" | Largura: "+getLargura();
	}
}
