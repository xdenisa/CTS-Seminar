package ro.ase.cts.seminar11.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {
    private List<Observator> observators;

    public ManagerSalaDeSport() {
        this.observators = new ArrayList<>();
    }

    public void adaugaObservator(Observator observator)
    {
        observators.add(observator);
    }

    public void stergeObservator(Observator observator)
    {
        observators.remove(observator);
    }

    public void notificaObservator(String mesaj)
    {
        for (var item:observators) {
            item.primesteMesaj(mesaj);
        }
    }
}
