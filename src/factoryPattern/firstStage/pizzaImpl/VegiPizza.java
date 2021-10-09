package factoryPattern.firstStage.pizzaImpl;

import factoryPattern.firstStage.Pizza;

public class VegiPizza extends Pizza {
    @Override
    public String prepare() {
        System.out.println("Vegi pizza is prepared");
        return "Vegi pizza is prepared";
    }
}
