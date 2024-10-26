package Decorador;

public class HouseBlend extends Beverage{
    public HouseBlend(){
        description = "House Blend Coffee";
    }
    public double cost() {
        return 0.89;
    }

    @Override
    public String toString() {
        return "HouseBlend{" +
                "description='" + description + '\'' +
                '}';
    }
}
