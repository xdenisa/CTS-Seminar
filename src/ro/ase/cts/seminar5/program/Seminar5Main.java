package ro.ase.cts.seminar5.program;

import ro.ase.cts.seminar5.clase.entities.PersonalSpital;
import ro.ase.cts.seminar5.clase.entities.TipPersonalSpital;
import ro.ase.cts.seminar5.clase.factories.*;

public class Seminar5Main {

    public static void afisareInformatiiPersonalSpital(IFactory factory, String nume){
        PersonalSpital personalSpital=factory.getPersonal(nume);
        System.out.println(personalSpital.toString());
    }
    public static void main(String[] args) {
        FactoryPersonalSpital factory=new FactoryPersonalSpital();
        PersonalSpital asistent= factory.createPersonal(TipPersonalSpital.Asistent,"George");
        PersonalSpital medic= factory.createPersonal(TipPersonalSpital.Medic,"Mircea");

        System.out.println(asistent);
        System.out.println(medic);

        afisareInformatiiPersonalSpital(new FactoryBrancardier(),"Ana");
        afisareInformatiiPersonalSpital(new FactoryAsistent(),"Maria");
        afisareInformatiiPersonalSpital(new FactoryInfirmier(),"Andreea");
    }
}
