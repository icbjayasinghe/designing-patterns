package factoryPattern.secondStage.product.Impl.ChicagoStyle;

import factoryPattern.secondStage.product.PizzaSS;

public class ChicagoStyleVeggiePizza extends PizzaSS {

    public ChicagoStyleVeggiePizza() {
        name = "Chicago style Veggie pizza";
        source = "Chicago Marinara Sauce";
    }

    @Override
    public void bake() {
        System.out.println("Bake for 25min at 340' ");
    }
}
