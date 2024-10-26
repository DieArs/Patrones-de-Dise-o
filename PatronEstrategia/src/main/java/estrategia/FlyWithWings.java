package estrategia;

public class FlyWithWings implements FlyBehavior {

    public FlyWithWings() {
    }
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }
    @Override
    public String toString() {
        return "FlyWithWings{}";
    }
}
