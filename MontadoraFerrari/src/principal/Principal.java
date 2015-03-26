package principal;

import carro.Carro;

public class Principal {

	public static void main(String[] args) {
		
		Carro fusca = new Carro("vermelho","Passeio");
		fusca.acelerar(90);
		System.out.println(fusca);

	}

}
