package factoryPattern.secondStage.creator.Impl;

import factoryPattern.secondStage.creator.PizzaStoreSS;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStyleCheesePizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStyleClamPizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStylePepperoniPizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStyleVeggiePizza;
import factoryPattern.secondStage.product.PizzaSS;

public class NyPizzaStore extends PizzaStoreSS {
    @Override
    protected PizzaSS createPizza(String type) {
        if (type.equals("cheese")) {
            return new NyStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NyStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NyStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NyStylePepperoniPizza();
        } else return null;
    }
}
