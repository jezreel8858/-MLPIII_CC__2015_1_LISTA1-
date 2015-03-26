package locadora;

public class FitaLancamento extends Fita {
	
	public FitaLancamento(String titulo,double valor){
		super(titulo, valor);
	}
	
	public void setPreco(double valor){
		this.preco = valor + valor * 0.20; 
	}
}
