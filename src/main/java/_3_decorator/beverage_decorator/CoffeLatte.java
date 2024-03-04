package _3_decorator.beverage_decorator;

public class CoffeLatte extends Beverage{
    public CoffeLatte() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 12;
    }
}
