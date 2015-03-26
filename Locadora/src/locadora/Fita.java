package locadora;

public class Fita {
	protected String titulo;
	protected double preco;
	
	public Fita(String titulo,double valor){
		this.titulo = titulo;
		setPreco(valor);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String toString(){
		return String.format("Titulo: %s\nPreço: %.2f",this.titulo,this.preco);
	}
	
}
