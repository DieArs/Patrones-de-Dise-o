package estrategia;

public class MallardDuck extends Duck{

    public MallardDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
    }
    @Override
    public void display(){
        System.out.println("I am a Mallard Duck");
    }
    @Override
    public String toString() {
        return "MallardDuck{}";
    }

}
