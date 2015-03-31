package principal;

import java.util.Scanner;

public class Principal {

	private static Scanner scanf;

	public static void main(String[] args) {
		
		scanf = new Scanner(System.in);
		System.out.println("Entrada:");
		String matriz[] = scanf.next().split("[^ 0-9]+");
		int valor=0;
		for(int x=0;x<matriz.length;x++){
			if(!matriz[x].equals("")){
				valor += Integer.parseInt(matriz[x]);
			}
		}
		System.out.println("Saiba\n"+valor);		
	}
}
