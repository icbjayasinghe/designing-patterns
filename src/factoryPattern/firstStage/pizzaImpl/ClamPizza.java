package factoryPattern.firstStage.pizzaImpl;

import factoryPattern.firstStage.Pizza;

public class ClamPizza extends Pizza {
    @Override
    public String prepare() {
        System.out.println("Clam pizza is prepared");
        return "Clam pizza is prepared";
    }
}
