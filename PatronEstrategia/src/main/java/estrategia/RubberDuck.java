package estrategia;

public class RubberDuck extends Duck {

    public RubberDuck(){
        fb = new FlyNoWay();
        sb = new MuteSound();
    }
    @Override
    public void display() {
        System.out.println("I am a Rubber Duck");
    }
    @Override
    public String toString() {
        return "RubberDuck{}";
    }
}
