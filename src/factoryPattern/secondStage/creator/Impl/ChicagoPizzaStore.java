package factoryPattern.secondStage.creator.Impl;

import factoryPattern.secondStage.creator.PizzaStoreSS;
import factoryPattern.secondStage.product.Impl.ChicagoStyle.ChicagoStyleCheesePizza;
import factoryPattern.secondStage.product.Impl.ChicagoStyle.ChicagoStyleClamPizza;
import factoryPattern.secondStage.product.Impl.ChicagoStyle.ChicagoStylePepperoniPizza;
import factoryPattern.secondStage.product.Impl.ChicagoStyle.ChicagoStyleVeggiePizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStyleCheesePizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStyleClamPizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStylePepperoniPizza;
import factoryPattern.secondStage.product.Impl.NyStyle.NyStyleVeggiePizza;
import factoryPattern.secondStage.product.PizzaSS;

public class ChicagoPizzaStore extends PizzaStoreSS {
    @Override
    protected PizzaSS createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
