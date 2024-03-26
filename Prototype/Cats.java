package Prototype;

public interface Cats extends Meow
{
    public Cats clone();
    String getName();
    void setName(String name);
}
