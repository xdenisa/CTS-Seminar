package ro.ase.cts.seminar4.clase;

public class Medic {
    private String nume;
    private int varsta;
    private String specializare;
    private boolean esteSpecialist;

    private static Medic instance=null;

    private Medic()
    {
        nume="Denisa";
        varsta=20;
        specializare="Pediatrie";
        esteSpecialist=true;
    }

    private Medic(String nume, int varsta, String specializare, boolean esteSpecialist) {
        this.nume = nume;
        this.varsta = varsta;
        this.specializare = specializare;
        this.esteSpecialist = esteSpecialist;
    }

    public static Medic getInstance()
    {
        //if (instance==null) {
            synchronized (Medic.class) {
                if (instance == null) {
                    instance = new Medic();
                }
            }
     //   }
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medic{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", specializare='").append(specializare).append('\'');
        sb.append(", esteSpecialist=").append(esteSpecialist);
        sb.append('}');
        return sb.toString();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public void setEsteSpecialist(boolean esteSpecialist) {
        this.esteSpecialist = esteSpecialist;
    }
}
