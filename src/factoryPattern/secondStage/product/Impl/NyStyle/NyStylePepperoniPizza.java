package factoryPattern.secondStage.product.Impl.NyStyle;

import factoryPattern.secondStage.product.PizzaSS;

public class NyStylePepperoniPizza extends PizzaSS {

    public NyStylePepperoniPizza() {
        name = "NY style Pepperoni pizza";
        source = "Tomato Sauce";
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
