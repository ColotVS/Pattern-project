package Singleton;

public class Class_Holder_Singleton {
    private Class_Holder_Singleton() {
    }

    private static class SingletonHolder {
        public static final Class_Holder_Singleton HOLDER_INSTANCE = new Class_Holder_Singleton();
    }

    public static Class_Holder_Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
    //Плюсы:
    //Ленивая инициализация.

    //Потокобезопасность.

    //Высокая производительность в многопоточной среде.

    //Минусы:
    //Для корректной работы необходима гарантия, что объект класса Singleton.Singleton.Singleton.Singleton инициализируется без ошибок.
    //Иначе первый вызов метода getInstance закончится ошибкой ExceptionInInitializerError,
    //а все последующие NoClassDefFoundError.

    //Реализация практически идеальная. И ленивая, и потокобезопасная, и быстрая.
    //Но есть нюанс, описанный в минусе.
}
