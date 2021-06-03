package ro.ase.cts.seminar14.teste.mocks;

import ro.ase.cts.seminar14.clase.IStudent;

import java.util.List;

public class DummyStudent2 implements IStudent {
    @Override
    public String getNume() {
        return "Dummy";
    }

    @Override
    public void setNume(String nume) {

    }

    @Override
    public List<Integer> getNote() {
        return null;
    }

    @Override
    public void adaugaNota(int nota) {

    }

    @Override
    public float calculeazaMedie() {
        return 6;
    }

    @Override
    public int getNota(int index) {
        return 7;
    }

    @Override
    public boolean areRestante() {
        return false;
    }
}
