package Bridge;

public abstract class Battery {
    protected Material material;

    public Battery(Material material){
        this.material = material;
    }

    public abstract void warmUp();
}
