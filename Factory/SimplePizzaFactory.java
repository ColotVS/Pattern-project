package Factory;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case PEPPERONI -> pizza = new Pepperoni();
            case HAWAIIAN -> pizza = new Hawaiian();
            case FOUR_CHEESES -> pizza = new FourCheeses();
            case MARGARITA -> pizza = new Margarita();
        }
        return pizza;
    }
}
