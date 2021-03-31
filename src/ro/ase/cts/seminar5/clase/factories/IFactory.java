package ro.ase.cts.seminar5.clase.factories;

import ro.ase.cts.seminar5.clase.entities.PersonalSpital;

public interface IFactory {
    public PersonalSpital getPersonal(String nume);
}
