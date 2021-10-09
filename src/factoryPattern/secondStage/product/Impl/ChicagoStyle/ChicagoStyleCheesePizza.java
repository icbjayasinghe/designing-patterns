package factoryPattern.secondStage.product.Impl.ChicagoStyle;

import factoryPattern.secondStage.product.PizzaSS;

public class ChicagoStyleCheesePizza extends PizzaSS {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style Cheese pizza";
        source = "Chicago Tomato source";
    }

    @Override
    public void bake() {
        System.out.println("Bake for 30min at 380' ");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
