package estrategia;

public class MuteSound implements SoundBehavior {

    public MuteSound() {
    }
    @Override
    public void makeSound() {
        System.out.println("I cannot making sound");
    }
    @Override
    public String toString() {
        return "MuteSound{}";
    }
}

