package ro.ase.cts.seminar9.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> factory;

    public FlyweightFactory() {
        this.factory = new HashMap<>();
    }

    public Flyweight getFlyweight(String nrTelefon){
        if(factory.containsKey(nrTelefon))
        {
            return factory.get(nrTelefon);
        }
        else {
            //adaugam noul client
            Client client = new Client("Anonim", nrTelefon, "anonim@email.com");
            factory.put(nrTelefon,client);
            return client;
        }
    }
}
