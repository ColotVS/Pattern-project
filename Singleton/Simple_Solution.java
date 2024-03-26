package Singleton;

public class Simple_Solution {
    private static final Simple_Solution INSTANCE = new Simple_Solution();

    private Simple_Solution() {
    }

    public static Simple_Solution getInstance() {
        return INSTANCE;
    }

    //Самая простая реализация.

    //Плюсы:
    //Простота и прозрачность кода

    //Потокобезопасность

    //Высокая производительность в многопоточной среде

    //Минусы:

    //Не ленивая инициализация.

    //В попытке исправить последний недостаток, мы получаем реализацию номер два:
}

