package _3_decorator.beverage_decorator;

public class CondimentSoy extends CondimentDecorator{
    Beverage beverage;
    private String discription = "soy";
    public CondimentSoy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + " " +discription;
    }
}
