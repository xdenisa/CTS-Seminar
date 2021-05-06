package ro.ase.cts.seminar10.chain;

public abstract class Notificator {
    private Notificator notificator;

    public void setNotificator(Notificator notificator) {
        this.notificator = notificator;
    }

    public Notificator getNotificator() {
        return notificator;
    }

    public abstract void trimiteNotificare(Client client, String text);
}
