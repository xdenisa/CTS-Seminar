package ro.ase.cts.seminar10.strategy;

public class PlataCard implements IPlata{
    @Override
    public void plateste(float suma) {
        System.out.println("S-a platit suma de "+suma+" cu cardul bancar.");
    }
}
