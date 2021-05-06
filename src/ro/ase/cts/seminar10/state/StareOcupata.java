package ro.ase.cts.seminar10.state;

public class StareOcupata implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera || masa.getStare() instanceof StareRezervata)
        {
            masa.setStare(this);
            System.out.println("Masa cu numarul "+masa.getNumar()+" este ocupata!");
        }
        else {
            System.out.println("Nu putem ocupa masa");
        }
    }
}
