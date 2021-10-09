package factoryPattern.secondStage.product.Impl.ChicagoStyle;

import factoryPattern.secondStage.product.PizzaSS;

public class ChicagoStylePepperoniPizza extends PizzaSS {

    public ChicagoStylePepperoniPizza() {
        name = "Chicago style Pepperoni pizza";
        source = "ChicagoTomato Sauce";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
