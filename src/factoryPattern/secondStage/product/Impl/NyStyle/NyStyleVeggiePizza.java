package factoryPattern.secondStage.product.Impl.NyStyle;

import factoryPattern.secondStage.product.PizzaSS;

public class NyStyleVeggiePizza extends PizzaSS {

    public NyStyleVeggiePizza() {
        name = "NY style Veggie pizza";
        source = "Marinara Sauce";
    }

    @Override
    public void bake() {
        System.out.println("Bake for 25min at 340' ");
    }
}
