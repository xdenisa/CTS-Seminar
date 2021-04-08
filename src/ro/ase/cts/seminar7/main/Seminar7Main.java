package ro.ase.cts.seminar7.main;

import ro.ase.cts.seminar7.clase.*;

public class Seminar7Main {
    public static void main(String[] args) {
        Persoana persoana1=new Persoana("Persoana 1","2015847625987");
        Bilet bilet1=new Bilet("Persoana 1","1A");

        if(bilet1.getNume().equals(persoana1.getNume())){
            if(!Politie.esteUrmarita(persoana1)){
                if(!BazaHuligani.esteHuligan(persoana1)){
                    System.out.println("Se permite accesul!");
                }
            }
        }

        if(Facade.iSePermiteAccesul(persoana1,bilet1)==true)
            System.out.println("Se permite accesul!");

        Persoana persoana2=new Persoana("Persoana 2","7777777777777");
        Bilet bilet2=new Bilet("Persoana 2","2B");
        if(Facade.iSePermiteAccesul(persoana2,bilet2)==true)
            System.out.println("Se permite accesul persoanei "+persoana2.getNume());
        else
            System.out.println(persoana2.getCNP()+"Nu i se permite accesul!");

    }
}
