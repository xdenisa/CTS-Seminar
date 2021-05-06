package ro.ase.cts.seminar10.chain;

public class Main {
    public static void main(String[] args) {
            Client client1=new Client("Ion",null,null);
            Client client2=new Client("Maria","telefon",null);
            Client client3=new Client("Ana",null,"email");

            Notificator notificatorSMS=new NotificatorSMS();
            Notificator notificatorEmail=new NotificatorEmail();

            notificatorSMS.setNotificator(notificatorEmail);
            notificatorSMS.trimiteNotificare(client2,"Mesaj1");

    }
}
