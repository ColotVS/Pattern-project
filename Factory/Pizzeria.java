package Factory;


public class Pizzeria {
    private final SimplePizzaFactory pizzaFactory;

    public Pizzeria(SimplePizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type){
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.makingDough();
        pizza.putFilling();
        pizza.bakePizza();
        System.out.println("Ваша " + pizza.pizzaType(pizza) + " готова!");
        System.out.println();
        return pizza;
    }
}
