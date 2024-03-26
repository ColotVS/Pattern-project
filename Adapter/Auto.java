package Adapter;

public class Auto implements Transport{

    @Override
    public void drive() {
        System.out.println("Машина едет по дороге.");
    }
}
