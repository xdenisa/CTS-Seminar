package ro.ase.cts.seminar4.clase;

public class Presedinte {

    private String nume;
    private int varsta;
    private int mandat;

    private Presedinte(){
        nume="Putin";
        varsta=68;
        mandat=5;
    }

    private Presedinte(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    private static Presedinte instance=new Presedinte(); //la eager putem lasa public

    public static Presedinte getInstance()
    {
        return instance;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Presedinte{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }
}
