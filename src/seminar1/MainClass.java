package seminar1;

public class MainClass {
    public static void main(String[] args) {
        Zoo zoo=new Zoo();
        Giraffe giraffe=new Giraffe("Girafa");
        Zebra zebra1=new Zebra("Zebra1");
        Zebra zebra2=new Zebra("Zebra2",5);
        zoo.AdaugaAnimal(giraffe);
        zoo.AdaugaAnimal(zebra1);
        zoo.AdaugaAnimal(zebra2);
        zoo.FeedAnimals();
    }
}
