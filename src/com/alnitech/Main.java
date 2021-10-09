package com.alnitech;

import factoryPattern.firstStage.PizzaFactory;
import factoryPattern.firstStage.PizzaStore;
import factoryPattern.secondStage.creator.Impl.ChicagoPizzaStore;
import factoryPattern.secondStage.creator.Impl.NyPizzaStore;
import factoryPattern.secondStage.creator.PizzaStoreSS;
import factoryPattern.secondStage.product.PizzaSS;

public class Main {

    public static void main(String[] args) {
        System.out.println("######First Stage Pizzas######");
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);
        pizzaStore.orderPizza("cheese");

        System.out.println("");
        System.out.println("######Second Stage Pizzas######");
        PizzaStoreSS nyStore = new NyPizzaStore();
        PizzaSS nyCheesePizza = nyStore.orderPizza("cheese");
        System.out.println("You ordered "+nyCheesePizza.getName()+ " is ready.");

        System.out.println("");
        PizzaStoreSS chicagoStore = new ChicagoPizzaStore();
        PizzaSS chicagoVeggiPizza = chicagoStore.orderPizza("veggie");
        System.out.println("You ordered "+chicagoVeggiPizza.getName()+ " is ready.");
    }
}
