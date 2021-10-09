package factoryPattern.secondStage.creator;

import factoryPattern.secondStage.product.PizzaSS;

public abstract class PizzaStoreSS {
    public PizzaSS orderPizza(String type) {
        PizzaSS pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract PizzaSS createPizza(String type);
}
