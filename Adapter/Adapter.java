package Adapter;

public class Adapter {  //structural pattern, Структурный паттерн
    //Адаптер (Adapter) — это паттерн, который предназначен для преобразования интерфейса
    //одного класса в интерфейс другого.
    //Благодаря реализации данного паттерна можно использовать вместе классы с несовместимыми интерфейсами.

    //Когда надо использовать адаптер:
    //Когда необходимо использовать имеющийся класс, но его интерфейс не соответствует потребностям.

    //Когда надо использовать уже существующий класс совместно с другими классами,
    //интерфейсы которых не совместимы.

    //Название у него говорящее, и ты не раз встречался с адаптерами в реальной жизни.
    //Один из самых распространенных адаптеров — кардридеры, которыми снабжены множество
    //компьютеров и ноутбуков.

    //Представь, что у нас есть какая-то карта памяти. В чем состоит проблема?
    //В том, что она не умеет взаимодействовать с компьютером. У них нет общего интерфейса.
    //У компьютера есть разъем USB, но карту памяти в него не вставить.
    //Карту невозможно вставить в компьютер, из-за чего мы не сможем сохранить наши фотографии,
    //видео и другие данные.

    //Кардридер является адаптером, решающим данную проблему.
    //Ведь у него есть USB-кабель! В отличие от самой карты, кардридер можно вставить в компьютер.
    //У них с компьютером есть общий интерфейс — USB.

    //Давай посмотрим, как это будет выглядеть на примере:

    //Это наш интерфейс USB с единственным методом — вставить USB-кабель:
    //public interface USB {
    //
    //   void connectWithUsbCable();
    //}

    //Это наш класс, реализующий карту памяти.
    //В нем уже есть 2 нужных нам метода, но вот беда: интерфейс USB он не реализует.
    //Карту нельзя вставить в USB-разъем:
    //public class MemoryCard {
    //
    //   public void insert() {
    //       System.out.println("Карта памяти успешно вставлена!");
    //   }
    //
    //   public void copyData() {
    //       System.out.println("Данные скопированы на компьютер!");
    //   }
    //}

    //А вот и наш адаптер:
    //public class CardReader implements USB {
    //
    //   private MemoryCard memoryCard;
    //
    //   public CardReader(MemoryCard memoryCard) {
    //       this.memoryCard = memoryCard;
    //   }
    //
    //   @Override
    //   public void connectWithUsbCable() {
    //       this.memoryCard.insert();
    //       this.memoryCard.copyData();
    //   }
    //}

    //Что же делает класс CardReader и почему, собственно, он является адаптером?

    //Все просто. Адаптируемый класс (карта памяти) становится одним из полей адаптера.
    //Это логично, ведь в реальной жизни мы тоже вставляем карту внутрь кардридера,
    //и она тоже становится его частью.

    //В отличие от карты памяти, у адаптера есть общий интерфейс с компьютером.
    //У него есть USB-кабель, то есть он может соединяться с другими устройствами по USB.

    //Поэтому в программе наш класс CardReader реализует интерфейс USB.
    //Но что же происходит внутри этого метода?

    //А там происходит ровно то, что нам нужно!
    //Адаптер делегирует выполнение работы нашей карте памяти.
    //Ведь сам-то адаптер ничего не делает, какого-то самостоятельного функционала у кардридера нет.
    //Его задача — только связать компьютер и карту памяти,
    //чтобы карта могла сделать свою работу и скопировать файлы!

    //Наш адаптер позволяет ей сделать это, предоставив свой интерфейс
    //(метод connectWithUsbCable()) для «нужд» карты памяти.

    //Давай создадим какую-то программу-клиент, которая будет имитировать человека,
    //желающего скопировать данные с карты памяти:
    //public class Main {
    //
    //   public static void main(String[] args) {
    //
    //       USB cardReader = new CardReader(new MemoryCard());
    //       cardReader.connectWithUsbCable();
    //
    //   }
    //}

    //Вывод в консоль:
    //Карта памяти успешно вставлена!
    //Данные скопированы на компьютер!

}
