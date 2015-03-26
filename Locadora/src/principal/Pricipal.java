package principal;

import locadora.Fita;
import locadora.FitaInfantil;
import locadora.FitaLancamento;

public class Pricipal {

	public static void main(String[] args) {
		Fita lancamento = new FitaLancamento("Armagedon",10f);
		Fita infantil = new FitaInfantil("Rei Leão",10f);
		
		System.out.println(lancamento);
		System.out.println(infantil);
	}

}
