package Bridge;

public class IndustrialBattery extends Battery{
    public IndustrialBattery(Material material) {
        super(material);
    }

    @Override
    public void warmUp() {
        System.out.println("Промышленная батарея греет сильно");
        material.toMakeFrom();
        System.out.println();
    }
}
