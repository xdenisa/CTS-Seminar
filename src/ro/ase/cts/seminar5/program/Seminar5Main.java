package ro.ase.cts.seminar5.program;

import ro.ase.cts.seminar5.clase.FactoryPersonalSpital;
import ro.ase.cts.seminar5.clase.PersonalSpital;
import ro.ase.cts.seminar5.clase.TipPersonalSpital;

public class Seminar5Main {
    public static void main(String[] args) {
        FactoryPersonalSpital factory=new FactoryPersonalSpital();
        PersonalSpital asistent= factory.createPersonal(TipPersonalSpital.Asistent,"George");
        PersonalSpital medic= factory.createPersonal(TipPersonalSpital.Medic,"Mircea");

        System.out.println(asistent);
        System.out.println(medic);
    }
}
