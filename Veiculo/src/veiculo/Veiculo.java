package veiculo;

public class Veiculo {
	
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected double valorKmRodado;
	protected int kmInicial;
	protected int kmFinal;
	protected double valorLocacao;
	
	public Veiculo(String placa,String marca,String modelo,int ano){
		this(placa,marca,modelo,ano,0,0,0,0f);
	}

	public Veiculo(String placa,String marca,String modelo,int ano,double valorKm,int kmIni,int kmFin,double valorLocacao){
		this.placa = placa;
		this.marca=marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKm;
		this.kmInicial = kmIni;
		this.kmFinal = kmFin;
		this.valorLocacao = valorLocacao;
	}
	
	public String toString(){
		return "";
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		if(kmInicial>=0){
			this.kmInicial = kmInicial;
		}		
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		if(kmFinal>kmInicial){
			this.kmFinal = kmFinal;
		}
	}
	public double getValorLocacao() {
		return valorLocacao = Math.abs((kmInicial - kmFinal)) * valorKmRodado;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
