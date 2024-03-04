package _3_decorator.beverage_decorator;

public abstract class Beverage {

    String description = "Bevarage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
