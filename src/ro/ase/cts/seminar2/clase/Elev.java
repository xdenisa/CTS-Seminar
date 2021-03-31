package ro.ase.cts.seminar2.clase;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	private static float sumaFinantare=30;

	public float getSumaFinantata() {
		return sumaFinantare;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Elev: ");
		sb.append(super.toString());
		sb.append(" Clasa= ").append(clasa);
		sb.append(" Tutore= ").append(tutore);
		return sb.toString();
	}
	
	public Elev() {
		super();
	}
}
