package ua.edu.ucu.taskone;

public class Main {
    private static final int TEST_AMOUNT = 26;
    public static void main(String[] args) {
        ATM test = new ATM();
        test.process(TEST_AMOUNT);
    }
}