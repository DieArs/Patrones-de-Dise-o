package Decorador;
import lombok.Getter;
@Getter
public abstract class Beverage {
    String description = "Unknown Beverage";

    public abstract double cost();
}
