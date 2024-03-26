package Prototype;

public class CatsCafe {
    public static void main(String[] args) {
        Cats dich = new BlackCat("Дичь");

        Cats demon = dich.clone();
        demon.setName("Демон");

        Cats sheri = new BrownCat("Шери");

        Cats sheriKid = sheri.clone();
        sheriKid.setName("Шери младший");

        Cats sneg = new WhiteCats("Снежок");

        Cats barsik = sneg.clone();
        barsik.setName("Барсик");

        System.out.print(dich.getName() + " ");
        dich.meow();

        System.out.print(demon.getName() + " ");
        demon.meow();

        System.out.print(sheri.getName() + " ");
        sheri.meow();

        System.out.print(sheriKid.getName() + " ");
        sheriKid.meow();

        System.out.print(sneg.getName() + " ");
        sneg.meow();

        System.out.print(barsik.getName() + " ");
        barsik.meow();
    }
}
