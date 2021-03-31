package ro.ase.cts.seminar5.clase.factories;

import ro.ase.cts.seminar5.clase.entities.Infirmier;
import ro.ase.cts.seminar5.clase.entities.PersonalSpital;

public class FactoryInfirmier implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}
