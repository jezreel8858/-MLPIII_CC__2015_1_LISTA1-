package veiculo;

public class VeiculoCarga extends Veiculo {
	protected int capacidadeCarga;

	public VeiculoCarga(String placa,String marca,String modelo,int ano){
		this(placa,marca,modelo,ano,0,0,0,0f,0);
	}
	
	public VeiculoCarga(String placa,String marca,String modelo,int ano,double valorKm,int kmIni,int kmFin,double valorLocacao,int capacidade){
		super(placa, marca, modelo, ano, valorKm, kmIni, kmFin, valorLocacao);
		this.capacidadeCarga=capacidade;
	}
	
	public String toString(){
		return String.format("Placa: %s\nMarca: %s\nModelo: %s\nAno: %d\nValor por Km Rodado: %.2f\nValor da Locação: %.2f\n"
				+ "Capacidade carga: %d\n",placa,marca,modelo,ano,valorKmRodado,getValorLocacao(),capacidadeCarga);
	}
	
	public int getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(int capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
}
