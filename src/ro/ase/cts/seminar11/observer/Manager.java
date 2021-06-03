package ro.ase.cts.seminar11.observer;

public class Manager extends ManagerSalaDeSport{
   public void anuntaMeci(String tip)
   {
       super.notificaObservator("Va avea loc un meci de "+tip);
   }
}
