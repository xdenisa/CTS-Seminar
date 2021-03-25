package ro.ase.cts.seminar5.clase;

public class FactoryInfirmier implements IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Infirmier(nume);
    }
}
