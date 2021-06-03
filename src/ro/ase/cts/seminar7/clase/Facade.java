package ro.ase.cts.seminar7.clase;

public class Facade {
    public static boolean iSePermiteAccesul(Persoana persoana,Bilet bilet)
    {
        if(bilet.getNume().equals(persoana.getNume())){
            if(!Politie.esteUrmarita(persoana)){
                if(!BazaHuligani.esteHuligan(persoana)){
                    return true;
                }
            }
        }
        return false;
    }
}
