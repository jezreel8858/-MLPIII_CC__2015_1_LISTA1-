package fatura;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtdCompra;
	private double preco;
	
	public Fatura(String numero,String descricao,int qtdCompra,double preco){
		this.numero = numero;
		this.descricao = descricao;
		this.qtdCompra = qtdCompra;
		this.preco = preco;
	}
	
	public double getValorFatura(){
		
		double valor = qtdCompra*preco;
		
		if(valor < 0 ){
			valor = 0.0f;
		}
		if(this.preco < 0){
			this.preco = 0.0f;
		}
		return valor;
	}
	
	public String toString(){
		return String.format("Numero: %s\nDescrição: %s\nQuantidade de compras: %d\nPreco: %.2f",numero,descricao,qtdCompra,preco);
	}
	
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQtdCompra() {
		return qtdCompra;
	}
	public void setQtdCompra(int qtdCompra) {
		this.qtdCompra = qtdCompra;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
