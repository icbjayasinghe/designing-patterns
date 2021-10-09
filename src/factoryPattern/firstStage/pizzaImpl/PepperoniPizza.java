package factoryPattern.firstStage.pizzaImpl;

import factoryPattern.firstStage.Pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public String prepare() {
        System.out.println("Pepperoni pizza is prepared");
        return "Pepperoni pizza is prepared";
    }
}
