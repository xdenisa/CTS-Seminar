package ro.ase.cts.seminar5.clase.factories;

import ro.ase.cts.seminar5.clase.entities.Asistent;
import ro.ase.cts.seminar5.clase.entities.PersonalSpital;

public class FactoryAsistent implements IFactory {
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
