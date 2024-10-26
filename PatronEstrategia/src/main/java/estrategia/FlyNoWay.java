package estrategia;

public class FlyNoWay implements FlyBehavior {

    public FlyNoWay() {
    }
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
    @Override
    public String toString() {
        return "FlyNoWay{}";
    }
}
