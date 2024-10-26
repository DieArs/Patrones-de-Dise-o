package estrategia;

public class RedheadDuck extends Duck{
    public RedheadDuck() {
        fb = new FlyWithWings();
        sb = new Quack();
    }
    public void display(){
        System.out.println("I am a Redhead Duck");
    }
    @Override
    public String toString() {
        return "RedheadDuck{}";
    }
}
