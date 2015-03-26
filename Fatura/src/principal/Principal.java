package principal;

import fatura.Fatura;

public class Principal {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura("112014","Caixa de Som",10,50.0f);
		
		System.out.println(fatura.getValorFatura());

	}

}
