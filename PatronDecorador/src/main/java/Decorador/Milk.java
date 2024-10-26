package Decorador;

public class Milk extends Condiment {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ",with Steamed Milk";
    }
    public double cost(){
        return 0.10 + beverage.cost();
    }
}
