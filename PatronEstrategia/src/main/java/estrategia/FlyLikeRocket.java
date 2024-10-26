package estrategia;

public class FlyLikeRocket implements FlyBehavior {

    public FlyLikeRocket() {
    }
    @Override
    public void fly() {
        System.out.println("Fly to infinity");
    }
    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }
}
