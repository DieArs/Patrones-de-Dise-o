package Decorador;

public class Whip extends  Condiment{
    Beverage beverage;

    public Whip (Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription() {
        return beverage.getDescription() + ",with Whip";
    }
    public double cost(){
        return 0.10 + beverage.cost();
    }
}
