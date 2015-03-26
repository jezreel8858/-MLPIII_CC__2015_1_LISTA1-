package carro;

public class Carro {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMaxima;
	private String estadoCarro; 		//Criei esse atributo para que o metodo 
										//ligar altere o estado do carro	
	
	public Carro(String cor,String modelo){
		this(cor,modelo,0,80,"Desligado");
	}
	public Carro(String cor,String modelo,int velocidadeA,int velocidadeMax,String estadoCarro){
		this.cor=cor;
		this.modelo=modelo;
		this.velocidadeAtual=velocidadeA;
		this.velocidadeMaxima=velocidadeMax;
		this.estadoCarro=estadoCarro;
	}	
	
	public void ligar(){
		this.estadoCarro = "Ligado";	
	}
	
	public void acelerar(int velocidade){
		if(velocidade + this.velocidadeAtual > this.velocidadeMaxima){
			System.out.println("A Velocidade Máxima do carro foi excedida");
		} else{
			this.velocidadeAtual += velocidade;
		}		
	}
	
	public String toString(){
		return String.format("Cor: %s\nModelo: %s\nVelocidade Atual: %d\nVelocidade Máxima: %d\nEstado do Carro: %s",cor,modelo,velocidadeAtual,velocidadeMaxima,estadoCarro);
	}
	


	public String getEstadoCarro() {
		return estadoCarro;
	}
	public void setEstadoCarro(String estadoCarro) {
		this.estadoCarro = estadoCarro;
	}
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}	
}
