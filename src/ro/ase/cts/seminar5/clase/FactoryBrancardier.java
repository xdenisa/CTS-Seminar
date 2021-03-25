package ro.ase.cts.seminar5.clase;

public class FactoryBrancardier implements IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Brancardier(nume);
    }
}
