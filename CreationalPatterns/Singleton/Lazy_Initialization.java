package CreationalPatterns.Singleton;

public class Lazy_Initialization {
    private static Lazy_Initialization INSTANCE;

    private Lazy_Initialization() {}

    public static Lazy_Initialization getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Lazy_Initialization();
        }
        return INSTANCE;
    }

    //Плюсы:
    //Ленивая инициализация.

    //Минусы:
    //Не потокобезопасно

    //Реализация интересна. Мы можем инициализироваться лениво, но утратили потокобезопасность.
    //Не беда: в реализации номер три мы все синхронизируем.
}
