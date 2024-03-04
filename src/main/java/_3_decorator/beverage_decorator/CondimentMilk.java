package _3_decorator.beverage_decorator;

public class CondimentMilk extends CondimentDecorator{
    Beverage beverage;
    public CondimentMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 1;
    }



    @Override
    public String getDescription() {
        return beverage.getDescription() + "+ Milk";
    }
}

