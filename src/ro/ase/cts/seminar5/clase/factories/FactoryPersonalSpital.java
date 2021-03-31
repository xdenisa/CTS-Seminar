package ro.ase.cts.seminar5.clase.factories;

import ro.ase.cts.seminar5.clase.entities.*;

public class FactoryPersonalSpital {

    public PersonalSpital createPersonal(TipPersonalSpital personalSpital, String numeAngajat){
        switch (personalSpital){
            case Medic -> {
                return new Medic(numeAngajat);
            }
            case Asistent -> {
                return new Asistent(numeAngajat);
            }
            case Brancardier -> {
                return new Brancardier(numeAngajat);
            }
            default -> throw new IllegalArgumentException();
        }
    }
}
