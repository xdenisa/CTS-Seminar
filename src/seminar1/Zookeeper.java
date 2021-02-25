package seminar1;

public class Zookeeper {
    private String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Feed(Animal animal)
    {
        System.out.println(name+" hraneste animalul: "+animal.getName());
    }
}
