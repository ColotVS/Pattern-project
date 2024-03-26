package Bridge;

public class Steel implements Material{
    @Override
    public void toMakeFrom() {
        System.out.println("Сделана из стали");
    }
}
