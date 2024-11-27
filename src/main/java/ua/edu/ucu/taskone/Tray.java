package ua.edu.ucu.taskone;
public class Tray {
    private int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray next) {
        this.next = next;
        return next;
    }

    public void process(int amount) {
        System.out.println(amount / denomination + " x " + denomination);
        if (next != null) {
            next.process(amount % denomination);
        }
    }
}