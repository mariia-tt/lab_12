package ua.edu.ucu.taskone;

public class ATM {
    public Tray firstTray;

    public ATM() {
        firstTray = new Tray25(0);
        firstTray.setNext(new Tray10(0)
        .setNext(new Tray5(0)
        .setNext(new Tray1(0))));
    }
    public void process(int amount) {
        firstTray.process(amount);
    }
}
