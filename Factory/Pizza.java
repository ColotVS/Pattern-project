package Factory;

public class Pizza {
    private static int pizzaEat = 0;
    public void makingDough(){
        //Делаем тесто
        System.out.println("Раскатываем тесто");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Тесто раскатано");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void putFilling(){
        System.out.println("Выкладываем начинку");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Начинку выложили");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void bakePizza(){
        System.out.println("Отправляем пиццу в печь");
        for (int i = 10; i > 0; i--) {
            System.out.println("Осталось " + i + " секунд");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public String pizzaType(Pizza pizza){
        if (pizza instanceof Pepperoni)
        {
            return "пицца \"Пепперони\"";
        }
        else if (pizza instanceof Hawaiian)
        {
            return "\"Гавайская\" пицца";
        }
        else if (pizza instanceof Margarita)
        {
            return "пицца \"Маргарита\"";
        }
        else if (pizza instanceof FourCheeses)
        {
            return "пицца \"Четыре сыра\"";
        }
        return null;
    }

    public void eatPizza(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (pizzaEat == 0) {
            System.out.println("Съел первую пиццу: Вкусно");
            pizzaEat++;
        }
        else if (pizzaEat == 1){
            System.out.println("Съел вторую пиццу: Кажется я наелся");
            pizzaEat++;
        }
        else if (pizzaEat == 2){
            System.out.println("Съел третью пиццу: Кажется я объелся");
            pizzaEat++;
        }
        else if (pizzaEat == 3){
            System.out.println("Съел четвертую пиццу: Я больше не могу есть пиццу");
            pizzaEat++;
        }
    }
}
