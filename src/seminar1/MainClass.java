package seminar1;

public class MainClass {
    public static void main(String[] args) {
        Zoo zoo=new Zoo();
        Giraffe giraffe=new Giraffe("Girafa");
        Zebra zebra=new Zebra("Zebra");
        zoo.AdaugaAnimal(giraffe);
        zoo.AdaugaAnimal(zebra);
        zoo.FeedAnimals();
    }
}
