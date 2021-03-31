package ro.ase.cts.seminar2.clase;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;
	private static float sumaFinantare=10;

	public  float getSumaFinantata() {
		return sumaFinantare;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}
	public Angajat() {
		super();
		
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Angajat: ");
		sb.append(super.toString());
		sb.append(" Ocupatie= ").append(ocupatie);
		sb.append(" Salariu= ").append(salariu);
		return sb.toString();
	}
	
}
