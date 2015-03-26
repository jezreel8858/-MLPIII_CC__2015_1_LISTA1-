package fabrica;

public class FabricaCarro {
	
	private static FabricaCarro unicoInstance = null;
	
	private FabricaCarro(){
		
	}
	
	public static synchronized FabricaCarro getInstance(){
		if(unicoInstance == null){
			unicoInstance = new FabricaCarro();
		}
		 return unicoInstance;
	}
}
