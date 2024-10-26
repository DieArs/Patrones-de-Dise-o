package estrategia;

import lombok.Setter;
@Setter
public abstract class Duck {
    public Duck() {
    }
    protected FlyBehavior fb;
    protected SoundBehavior sb;

    public void swim(){
        System.out.println("The duck is swimming");
    }
    public void performFly(){
        fb.fly();
    }
    public void performQuack(){
        sb.makeSound();
    }
    public abstract void display();
    @Override
    public String toString() {
        return "Duck{}";
    }
}
