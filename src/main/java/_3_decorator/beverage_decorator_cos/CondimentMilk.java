package _3_decorator.beverage_decorator_cos;

public class CondimentMilk extends CondimentDecorator {
    Beverage beverage;

    public CondimentMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mill";
    }

    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case GRANDE:
                cost += 0.10;
                break;
            case VENTI:
                cost += 0.15;
                break;
            case TALL: // Предположим, что TALL имеет базовую стоимость и не требует дополнительной платы за размер
            default:
                break; // Не требуется дополнительная оплата за размер
        }
        return cost;
    }
}
