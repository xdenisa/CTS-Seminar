package ro.ase.cts.seminar5.clase.factories;

import ro.ase.cts.seminar5.clase.entities.Brancardier;
import ro.ase.cts.seminar5.clase.entities.PersonalSpital;

public class FactoryBrancardier implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
