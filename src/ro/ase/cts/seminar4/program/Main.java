package ro.ase.cts.seminar4.program;

import ro.ase.cts.seminar4.clase.Medic;
import ro.ase.cts.seminar4.clase.Presedinte;
import ro.ase.cts.seminar4.clase.PresedinteLazy;

public class Main {
    public static void main(String[] args) {
//        Presedinte presedinte1=Presedinte.getInstance();
//        Presedinte presedinte2=Presedinte.getInstance();
//
//        System.out.println(presedinte1.toString());
//        System.out.println(presedinte2.toString());
//
//        presedinte1.setNume("Basescu");
//        presedinte2.setMandat(3);
//
//        System.out.println(presedinte1.toString());
//        System.out.println(presedinte2.toString());

//        PresedinteLazy presedinteLazy1=PresedinteLazy.getInstance("Putin",68,5);
//        System.out.println(presedinteLazy1.toString());
//
//        PresedinteLazy presedinteLazy2=PresedinteLazy.getInstance("Basescu",50,4);
//        System.out.println(presedinteLazy2.toString());
//        presedinteLazy2.setMandat(10);
//        System.out.println(presedinteLazy2.toString());

        Medic medic1=Medic.getInstance();
        System.out.println(medic1.toString());

        Medic medic2=Medic.getInstance();
        medic2.setEsteSpecialist(false);
        medic1.setVarsta(30);
        System.out.println(medic1);
        System.out.println(medic2);

    }
}
