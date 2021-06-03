package ro.ase.cts.seminar10.state;

public class StareRezervata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera)
        {
            masa.setStare(this);
            System.out.println("Masa cu numarul "+masa.getNumar()+" este rezervata!");
        }
        else
        {
            System.out.println("Nu putem rezerva masa!");
        }
    }
}
