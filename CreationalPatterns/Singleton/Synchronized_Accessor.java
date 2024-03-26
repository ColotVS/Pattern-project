package CreationalPatterns.Singleton;

public class Synchronized_Accessor {
    private static Synchronized_Accessor INSTANCE;

    private Synchronized_Accessor() {
    }

    public static synchronized Synchronized_Accessor getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Synchronized_Accessor();
        }
        return INSTANCE;
    }
    //Плюсы:
    //Ленивая инициализация.

    //Потокобезопасность

    //Минусы:
    //Низкая производительность в многопоточной среде

    //Отлично! В реализации номер три мы вернули потокобезопасность!
    //Правда, медленную… Теперь метод getInstance синхронизирован, и входить в него можно только по одному.

    //На самом деле нам нужно синхронизировать не весь метод, а лишь ту его часть,
    //в которой мы инициализируем новый объект класса.
    //Но мы не можем просто обернуть в synchronized блок часть,
    //отвечающую за создание нового объекта: это не обеспечит потокобезопасность. Все немного сложнее.

    //Правильный способ синхронизации представлен дальше
}
