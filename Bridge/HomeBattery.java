package Bridge;

public class HomeBattery extends Battery{

    public HomeBattery(Material material) {
        super(material);
    }

    @Override
    public void warmUp() {
        System.out.println("Домашняя батарея греет не сильно");
        material.toMakeFrom();
        System.out.println();
    }
}
