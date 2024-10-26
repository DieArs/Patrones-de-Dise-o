package estrategia;

public class Squeak implements SoundBehavior {

    public Squeak() {
    }
    @Override
    public void makeSound  () {
        System.out.println("I am squeak");
    }
    @Override
    public String toString() {
        return "Squeak{}";
    }
}
