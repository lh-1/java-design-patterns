package com.iluwatar.mediator.mediator;

public class Purchase extends Colleague {

    public Purchase(Mediator mediator) {
        super(mediator);
    }

    public void buyComputer(int number) {
//        super.mediator.execute("purchase.buy %s computer", number);
        super.mediator.doSomething1();
    }

    public void refuseBuy() {
        System.out.println("refuse buy");
    }


}
