package factoryPattern.secondStage.product;

public abstract class PizzaSS {
    public String name;
    public String source;
    public void prepare() {
        System.out.println("Preparing : "+ name);
        System.out.println("Adding " +source +" sauce...");
        System.out.println("Adding toppings...");
    };
    public void bake() {
        System.out.println("Bake for 25min at 350' ");
    }
    public void cut() {
        System.out.println("Pizza cut to 6 slices");
    }
    public void box() {
        System.out.println("Pizza pack to store box");
    }

    public String getName() {
        return name;
    }
}
