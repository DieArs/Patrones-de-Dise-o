package Decorador;

public class DarkRoast extends Beverage{
    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }

    public double cost(){
        return 0.99;
    }
    @Override
    public String toString() {
        return "DarkRoast{" +
                "description='" + description + '\'' +
                '}';
    }
}
