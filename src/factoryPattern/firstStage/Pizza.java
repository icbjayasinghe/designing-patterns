package factoryPattern.firstStage;

public abstract class Pizza {
    public abstract String prepare();
    public String bake() {
        System.out.println("Pizza is baked");
        return "Pizza is baked";
    }
    public String cut() {
        System.out.println("Pizza is cut");
        return "Pizza is cut";
    }
    public String box() {
        System.out.println("Pizza is packed");
        return "Pizza is packed";
    }
}
