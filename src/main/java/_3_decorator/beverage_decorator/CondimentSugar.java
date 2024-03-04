package _3_decorator.beverage_decorator;

public class CondimentSugar extends CondimentDecorator{
    Beverage beverage;
    public CondimentSugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ Sugar";
    }
}
