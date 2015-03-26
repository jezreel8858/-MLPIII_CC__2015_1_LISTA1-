package principal;

import veiculo.VeiculoCarga;
import veiculo.VeiculoPasseio;

public class Principal {
	
	public static void main(String[] args) {
		
		VeiculoPasseio passeio = new VeiculoPasseio("amx1020","Honda","civic",2015);
		VeiculoCarga carga = new VeiculoCarga("mov2230","Iveco","TH2000",2010);
		
		passeio.setAr_condicionado(true);
		passeio.setQtdPorta(4);
		passeio.setKmInicial(0);
		passeio.setKmFinal(100);
		passeio.setValorKmRodado(20f);
		carga.setCapacidadeCarga(1000);
		carga.setKmInicial(0);
		carga.setKmFinal(50);
		carga.setValorKmRodado(20f);
		
		System.out.println(passeio);
		System.out.println(carga);
		
	}
}
