package Bridge;

public class Aluminum implements Material{
    @Override
    public void toMakeFrom() {
        System.out.println("Сделана из алюминия");
    }
}
