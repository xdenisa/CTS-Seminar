package ro.ase.cts.seminar2.clase;


public class Student extends Aplicant {
	protected String facultate;
	protected int an_studii;
	private static float sumaFinantare=20;

	public float getSumaFinantata() {
		return sumaFinantare;
	}


	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public void setAn_studii(int an_studii) {
		this.an_studii = an_studii;
	}


	public Student() {
		super();
		
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student: ");
		sb.append(super.toString());
		sb.append(" Facultate= ").append(facultate);
		sb.append(" An studii= ").append(an_studii);
		return sb.toString();
	}

	
}
