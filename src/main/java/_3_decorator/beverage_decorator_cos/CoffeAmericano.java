package _3_decorator.beverage_decorator_cos;

public class CoffeAmericano extends Beverage {
    public CoffeAmericano() {
        description = "Americano";
    }

    @Override
    public double cost() {
        return 10;
    }
}
