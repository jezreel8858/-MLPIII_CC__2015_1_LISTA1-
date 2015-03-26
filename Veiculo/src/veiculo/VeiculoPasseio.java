package veiculo;

public class VeiculoPasseio extends Veiculo {
	
	protected boolean ar_condicionado;
	protected int qtdPorta;
	
	public VeiculoPasseio(String placa,String marca,String modelo,int ano){
		this( placa, marca,modelo,ano,0,0,0,0f,2,false);
	}
	
	public VeiculoPasseio(String placa,String marca,String modelo,int ano,double valorKm,int kmIni,int kmFin,double valorLocacao,int qtdPorta,boolean ar_condicionado){
		super(placa, marca, modelo, ano, valorKm, kmIni, kmFin, valorLocacao);
		this.qtdPorta=qtdPorta;
		this.ar_condicionado=ar_condicionado;
	}
	
	public String toString(){
		return String.format("Placa: %s\nMarca: %s\nModelo: %s\nAno: %d\nValor por Km Rodado: %.2f\nValor da Locação: %.2f\nQuantidade portas: %d\n"
				+ "Ar-Condicionado: %b\n",placa,marca,modelo,ano,valorKmRodado,getValorLocacao(),qtdPorta,ar_condicionado);
	}
	
	public boolean isAr_condicionado() {
		return ar_condicionado;
	}
	public void setAr_condicionado(boolean ar_condicionado) {
		this.ar_condicionado = ar_condicionado;
	}
	public int getQtdPorta() {
		return qtdPorta;
	}
	public void setQtdPorta(int qtdPorta) {
		this.qtdPorta = qtdPorta;
	}
	
}
