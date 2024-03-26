package Prototype;

public class BlackCat implements Cats{
    private String name;

    public BlackCat(String name) {
        this.name = name;
    }

    @Override
    public Cats clone() {
        return new BlackCat(this.name);
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
    public void meow(){
        System.out.println("Мяю");
    }
}
