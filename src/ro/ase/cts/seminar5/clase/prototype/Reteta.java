package ro.ase.cts.seminar5.clase.prototype;

public class Reteta implements PrototypeAbstract{
    private String denumireSolutie;
    private int cantitateSolutie;

    public Reteta(String denumireSolutie, int cantitateSolutie) {
        //validari
        this.denumireSolutie = denumireSolutie;
        this.cantitateSolutie = cantitateSolutie;
    }

    private Reteta() {
        //nu face validari
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("denumireSolutie='").append(denumireSolutie).append('\'');
        sb.append(", cantitateSolutie=").append(cantitateSolutie);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototypeAbstract clone() {
        Reteta copie=new Reteta();
        copie.cantitateSolutie=this.cantitateSolutie;
        copie.denumireSolutie=this.denumireSolutie;
        return copie;
    }
}
