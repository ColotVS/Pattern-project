package Prototype;

public class WhiteCats implements Cats{
    private String name;

    public WhiteCats(String name) {
        this.name = name;
    }

    @Override
    public Cats clone() {
        return new WhiteCats(this.name);
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
        System.out.println("Мяю-мяю");
    }
}
