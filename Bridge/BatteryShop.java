package Bridge;

public class BatteryShop {
    public static void main(String[] args) {
        HomeBattery homeBatteryCastIron = new HomeBattery(new CastIron());
        HomeBattery homeBatteryAluminium = new HomeBattery(new Aluminum());
        IndustrialBattery industrialBatterySteel = new IndustrialBattery(new Steel());
        homeBatteryCastIron.warmUp();
        homeBatteryAluminium.warmUp();
        industrialBatterySteel.warmUp();
    }
}
