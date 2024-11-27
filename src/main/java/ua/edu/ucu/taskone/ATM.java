package ua.edu.ucu.taskone;

public class ATM {
    private Tray firstTray;

    public ATM() {
        firstTray = new TrayTwentyFive(0);
        firstTray.setNext(new TrayTen(0)
        .setNext(new TrayFive(0)
        .setNext(new TrayOne(0))));
    }

    public Tray getFirstTray() {
        return firstTray;
    }
    public void setFirstTray(Tray firstTray) {
        this.firstTray = firstTray;
    }

    public void process(int amount) {
        firstTray.process(amount);
    }
}
