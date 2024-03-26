package Prototype;

public class BrownCat implements Cats{
    private String name;

    public BrownCat(String name) {
        this.name = name;
    }

    @Override
    public Cats clone() {
        return new BrownCat(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println("Мрр");
    }
}
