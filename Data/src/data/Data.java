package data;
public class Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Data(){
		
	}
		
	public Data(int dia, int mes, int ano) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	
	public String validaData(){
		if(this.dia<1 ||this.dia>30 ||this.mes<1||this.mes>12||this.ano<1){
			return "(data inválida)";
		}
		return "";
	}
	
	public String toString() {
		return dia + "/" + mes + "/" + ano + validaData();
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
			this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
			this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
			this.ano = ano;
	}
	
			
}
