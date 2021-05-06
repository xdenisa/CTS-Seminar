package ro.ase.cts.seminar10.chain;

public class NotificatorEmail extends Notificator{
    @Override
    public void trimiteNotificare(Client client, String text) {
        if(client.getEmail()!=null)
        {
            System.out.println("Trimitere email catre "+client.getNume()+", mesaj: "+text);
        }
        else
        {
            if(super.getNotificator()!=null)
            {
                super.getNotificator().trimiteNotificare(client,text);
            }
            else
            {
                System.out.println("Pentru clientul "+client.getNume()+" nu avem date de contact!");
            }
        }
    }
}
