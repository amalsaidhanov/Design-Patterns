package _3_decorator.beverage_decorator_cos;

public class Test {
    public static void main(String[] args) {

        Beverage americano = new CoffeAmericano();
        americano.setSize(Beverage.Size.GRANDE);
        americano = new CondimentMilk(americano);
        americano = new CondimentSugar(americano);
        System.out.println(americano.getDescription() + americano.cost());

    }
}

