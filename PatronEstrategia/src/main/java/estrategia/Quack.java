package estrategia;

public class Quack implements SoundBehavior {

    public Quack() {
    }
    public void makeSound  () {
        System.out.println("I am quack");
    }
    @Override
    public String toString() {
        return "Quack{}";
    }
}
