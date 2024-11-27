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

    public void setDenomination(int newDenomination) {
        this.denomination = newDenomination;
    }

    public Tray setNext(Tray newNext) {
        this.next = newNext;
        return next;
    }

    public void process(int amount) {
        System.out.println(amount / denomination + " x " + denomination);
        if (next != null) {
            next.process(amount % denomination);
        }
    }
}