package ro.ase.cts.seminar10.state;

public class StareLibera implements Stare{
    @Override
    public void modificaStare(Masa masa) {
        if(masa.getStare() instanceof StareLibera)
        {
            System.out.println("Nu putem elibera masa");
        }else
        {
            masa.setStare(this);
            System.out.println("Masa cu numarul "+masa.getNumar()+" a fost eliberata!");
        }
    }
}
