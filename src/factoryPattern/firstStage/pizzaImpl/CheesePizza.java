package factoryPattern.firstStage.pizzaImpl;

import factoryPattern.firstStage.Pizza;

public class CheesePizza extends Pizza {
    @Override
    public String prepare() {
        System.out.println("Cheese pizza is prepared");
        return "Cheese pizza is prepared";
    }
}
