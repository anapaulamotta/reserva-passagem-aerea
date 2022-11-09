package domain;

public class Aviao extends Aeronave{

	public Passageiro[][] lugares;


	public Aviao(String modelo, int fileira, int assento) {
		super.modelo = modelo;
		this.lugares = new Passageiro[fileira][assento];
	}
	
	public Passageiro getPassageiro(int fileira, int assento) {
		if(lugares[fileira][assento] == null)
			return null;
		else
			return lugares[fileira][assento];
	}
	
	public boolean verificaLugarOcupado(int fileira, int assento) {
		if(lugares[fileira][assento] == null)
			return false;
		else
			return true;
	}
	
	public void setPassageiro(int fileira, int assento, Passageiro passageiro) {
		lugares[fileira][assento] = passageiro;
	}
}
