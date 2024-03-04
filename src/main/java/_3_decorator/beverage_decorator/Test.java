package _3_decorator.beverage_decorator;

public class Test {
    public static void main(String[] args) {
//        Beverage americano = new CondimentSoy(new CoffeAmericano());
//        System.out.println(americano.getDescription() + americano.cost());

        Beverage espresso = new CoffeEspresso();
        System.out.println(espresso.getDescription() + espresso.cost());


        //////
        Beverage americano = new CoffeAmericano();
        americano = new CondimentSoy(americano);
        americano = new CondimentMilk(americano);
        americano = new CondimentSugar(americano);
        americano = new CondimentSugar(americano);
        System.out.println(americano.getDescription() + americano.cost());

        Beverage americano1 = new CondimentSugar(new CondimentSugar(new CondimentMilk(new CondimentSoy(new CoffeAmericano()))));
        System.out.println(americano1.getDescription() + americano1.cost());
        ///////

    }
}
