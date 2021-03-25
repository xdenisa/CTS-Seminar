package ro.ase.cts.seminar5.clase;

public class FactoryAsistent implements IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Asistent(nume);
    }
}
