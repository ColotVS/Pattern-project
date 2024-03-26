package Adapter;

public class Camel implements Animal{
    @Override
    public void move() {
        System.out.println("Верблюд идёт по песку пустыни.");
    }
}
