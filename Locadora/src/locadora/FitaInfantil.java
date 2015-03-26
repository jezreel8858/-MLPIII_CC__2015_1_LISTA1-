package locadora;

public class FitaInfantil extends Fita {
	
	public FitaInfantil(String titulo,double valor){
		super(titulo, valor);
	}
	
	public void setPreco(double valor){
		this.preco = valor - valor * 0.40 ; 
	}
}
