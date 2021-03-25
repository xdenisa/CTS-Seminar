package ro.ase.cts.seminar5.clase;

public class FactoryMedic  implements IFactory{
    @Override
    public PersonalSpital getPersonal(String nume) {
        return new Medic(nume);
    }
}
