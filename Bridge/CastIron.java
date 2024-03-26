package Bridge;

public class CastIron implements Material{
    @Override
    public void toMakeFrom() {
        System.out.println("Сделана из чугуна");
    }
}
