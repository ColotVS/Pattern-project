package Adapter;

public class CamelToTransportAdapter implements Transport{
    private Camel camel;

    public CamelToTransportAdapter(Camel camel) {
        this.camel = camel;
    }

    @Override
    public void drive() {
        this.camel.move();
    }
}
