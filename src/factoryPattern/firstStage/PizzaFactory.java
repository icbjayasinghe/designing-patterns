package factoryPattern.firstStage;

import factoryPattern.firstStage.pizzaImpl.CheesePizza;
import factoryPattern.firstStage.pizzaImpl.ClamPizza;
import factoryPattern.firstStage.pizzaImpl.PepperoniPizza;
import factoryPattern.firstStage.pizzaImpl.VegiPizza;

public class PizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("vegi")) {
            pizza = new VegiPizza();
        } else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if(type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
