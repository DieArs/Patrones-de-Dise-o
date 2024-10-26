package Decorador;

public class Mocha extends Condiment {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ",with Mocha";
    }
    public double cost(){
        return 0.20 + beverage.cost();
    }
}
