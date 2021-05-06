package ro.ase.cts.seminar10.state;

public class MainState {
    public static void main(String[] args) {
        Masa masa=new Masa(9);

        masa.elibereazaMasa();
        masa.rezervaMasa();
        masa.rezervaMasa();
        masa.ocupaMasa();
    }
}
