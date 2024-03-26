package Adapter;

public class Travel {
    public static void main(String[] args) {
        //Создаём новый объект путешественник
        Traveler traveler = new Traveler();
        //Создаём новый объект авто
        Auto auto = new Auto();
        //Путешественник отправляется в путешествие на авто
        traveler.travel(auto);
        System.out.println("Доехали до пустыни.");
        //Встретились пески, надо использовать верблюда.
        //Используем адаптер
        Transport camelTransport = new CamelToTransportAdapter(new Camel());
        System.out.println("Пересаживаемся на верблюда.");
        //Продолжаем путь по пескам пустыни
        traveler.travel(camelTransport);
    }
}
