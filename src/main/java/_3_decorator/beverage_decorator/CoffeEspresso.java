package _3_decorator.beverage_decorator;

public class CoffeEspresso extends Beverage{
    public CoffeEspresso() {
        description = "Espresso";

    }

    @Override
    public double cost() {
        return 11;
    }
}