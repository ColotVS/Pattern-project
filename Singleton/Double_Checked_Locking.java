package Singleton;

public class Double_Checked_Locking {
    private static Double_Checked_Locking INSTANCE;

    private Double_Checked_Locking() {
    }

    public static Double_Checked_Locking getInstance() {
        if (INSTANCE == null) {
            synchronized (Double_Checked_Locking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Double_Checked_Locking();
                }
            }
        }
        return INSTANCE;
    }
    //Плюсы:
    //Ленивая инициализация.

    //Потокобезопасность

    //Высокая производительность в многопоточной среде

    //Минусы:
    //Не поддерживается на версиях Java ниже 1.5 (в версии 1.5 исправили работу ключевого слова volatile)

    //Отмечу, что для корректной работы данного варианта реализации обязательно одно из двух условий.
    //Переменная INSTANCE должна быть либо final, либо volatile.
}
