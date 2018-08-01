package com.iluwatar.mediator.mediator;

public class Client {

    public static void main(String[] args) {

        Mediator mediator = new ConcreteMediator();

        Purchase purchase = new Purchase(mediator);

        purchase.buyComputer(54);

        Sale sale = new Sale(mediator);

        sale.sellComputer(2);

        Stock stock = new Stock(mediator);

        stock.clearStock();

    }

}
