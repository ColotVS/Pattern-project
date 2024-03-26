package Factory;

public class TestOrder {
    public static void main(String[] args) {
        Pizzeria pizzeria = new Pizzeria(new SimplePizzaFactory());
        Pizza pepperoni = pizzeria.orderPizza(PizzaType.PEPPERONI);
        Pizza margarita = pizzeria.orderPizza(PizzaType.MARGARITA);
        Pizza hawaiian = pizzeria.orderPizza(PizzaType.HAWAIIAN);
        Pizza fourCheeses = pizzeria.orderPizza(PizzaType.FOUR_CHEESES);
        pepperoni.eatPizza();
        margarita.eatPizza();
        hawaiian.eatPizza();
        fourCheeses.eatPizza();
    }
}
