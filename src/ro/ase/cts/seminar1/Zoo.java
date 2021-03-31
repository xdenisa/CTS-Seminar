package ro.ase.cts.seminar1;

import java.util.ArrayList;
import java.util.List;

public class Zoo implements IZoo {
   private Zookeeper zookeeper;
   private List<Animal> animalList;

    public Zoo() {
        animalList=new ArrayList<>();
        zookeeper=new Zookeeper("Ion");
    }

    public Zoo(Zookeeper zookeeper, List<Animal> animalList) {
        this.zookeeper = zookeeper;
        this.animalList = animalList;
    }


    @Override
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    @Override
    public void feedAnimals() {
        for (Animal animal:animalList) {
            zookeeper.Feed(animal);
        }
    }
}
