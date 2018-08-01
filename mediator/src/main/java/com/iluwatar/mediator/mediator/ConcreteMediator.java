package com.iluwatar.mediator.mediator;

public class ConcreteMediator extends Mediator {

    @Override
    public void doSomething1() {
        System.out.println("ConcreteMediator doSomething1");
    }

    @Override
    public void doSomething2() {
        System.out.println("ConcreteMediator doSomething2");
    }
}
