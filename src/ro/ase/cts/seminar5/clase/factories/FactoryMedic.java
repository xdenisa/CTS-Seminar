package ro.ase.cts.seminar5.clase.factories;

import ro.ase.cts.seminar5.clase.entities.Medic;
import ro.ase.cts.seminar5.clase.entities.PersonalSpital;

public class FactoryMedic  implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
