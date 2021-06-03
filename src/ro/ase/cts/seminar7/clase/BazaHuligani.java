package ro.ase.cts.seminar7.clase;

public class BazaHuligani {
    public static boolean esteHuligan(Persoana persoana)
    {
        return Integer.parseInt(""+persoana.getCNP().charAt(11))%2==0;
    }
}
