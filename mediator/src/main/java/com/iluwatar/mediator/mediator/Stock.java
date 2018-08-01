package com.iluwatar.mediator.mediator;

public class Stock extends Colleague {

    public Stock(Mediator mediator) {
        super(mediator);
    }

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.err.println("increate " + number + ", now number is " + COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.err.println("decrease " + number + ", now number is " + COMPUTER_NUMBER);
    }

    public int findStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
//        super.mediator.execute("clear stock number is %s", COMPUTER_NUMBER);
    }


}
