package Decorador;

public class Espresso extends Beverage{

    public Espresso(){
        description = "Espresso";
    }
    public double cost(){
        return 1.99;
    }
    @Override
    public String toString() {
        return "Espresso{" +
                "description='" + description + '\'' +
                '}';
    }
}
