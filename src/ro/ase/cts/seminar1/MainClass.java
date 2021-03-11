package ro.ase.cts.seminar1;

public class MainClass {
    public static void main(String[] args) {
        IZoo zoo=new Zoo();
        Giraffe giraffe=new Giraffe("Girafa");
        Zebra zebra1=new Zebra("Zebra1");
        Zebra zebra2=new Zebra("Zebra2",5);
        zoo.addAnimal(giraffe);
        zoo.addAnimal(zebra1);
        zoo.addAnimal(zebra2);
        zoo.feedAnimals();
    }
}
