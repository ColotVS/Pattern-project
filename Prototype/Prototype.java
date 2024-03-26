package Prototype;

public class Prototype { ////Creational patterns, Порождающий паттерн
    //Шаблон проектирования Прототип (Prototype) — это шаблон, который помогает создавать новые
    //объекты путем копирования существующего объекта.
    //Прототип особенно полезен при создании сложных или ресурсоемких объектов.

    //Чтобы лучше понять принцип работы этого шаблона, давайте рассмотрим его на примере овцефермы.

    //Сценарий овцефермы
    //Представьте, что у вас есть виртуальная овцеферма,
    //и вам нужно создать несколько овец со схожими характеристиками.
    //Вместо того чтобы создавать каждую овцу с нуля,
    //вы можете использовать шаблон Prototype для клонирования существующих овец.
    //Каждая клонированная овца сохранит общие атрибуты, но при этом она поддерживает индивидуальную настройку.

    //Применение шаблона Prototype
    //Вот как можно применить шаблон проектирования Прототип к нашему сценарию “Овцеферма”:

    //1. Определите интерфейс прототипа
    //Сначала мы определяем интерфейс Sheep, который служит прототипом для наших объектов-овец.
    //Этот интерфейс объявляет метод clone для создания копий овец.
    //public interface Sheep {
    //    Sheep clone();
    //    String getName();
    //    void setName(String name);
    //}

    //2. Реализация конкретных прототипов
    //Далее мы создаем конкретные классы овец, реализующие интерфейс Sheep. Эти конкретные классы представляют
    //определенные типы овец (sheep) и предоставляют свои собственные реализации clone.

    //а. Реализация Sheep в классе BlackSheep:
    //public class BlackSheep implements Sheep {
    //    private String name;
    //
    //    public BlackSheep(String name) {
    //        this.name = name;
    //    }
    //
    //    public Sheep clone() {
    //        return new BlackSheep(this.name);
    //    }
    //
    //    public String getName() {
    //        return name;
    //    }
    //
    //    public void setName(String name) {
    //        this.name = name;
    //    }
    //}

    //b. Реализация Sheep в классе WhiteSheep:
    //public class WhiteSheep implements Sheep {
    //    private String name;
    //
    //    public WhiteSheep(String name) {
    //        this.name = name;
    //    }
    //
    //    public Sheep clone() {
    //        return new WhiteSheep(this.name);
    //    }
    //
    //    public String getName() {
    //        return name;
    //    }
    //
    //    public void setName(String name) {
    //        this.name = name;
    //    }
    //}

    //3. Клиентский код: использование Прототипа
    //В нашем клиентском коде “Овцефермы” мы создаем прототипы овец,
    //клонируем их и настраиваем клонированных овец по мере необходимости.

    //public class SheepFarm {
    //    public static void main(String[] args) {
    //        // Создаем прототип овцы
    //        Sheep blackPrototype = new BlackSheep("Baa Baa");
    //        Sheep whitePrototype = new WhiteSheep("Fleecy");
    //
    //        // Клонируем овцу по мере необходимости
    //        Sheep clonedBlackSheep = blackPrototype.clone();
    //        Sheep clonedWhiteSheep = whitePrototype.clone();
    //
    //        // Настройка клонированной овцы
    //        clonedBlackSheep.setName("Midnight");
    //        clonedWhiteSheep.setName("Snowball");
    //
    //        // Ваша овцеферма процветает!
    //        System.out.println("Black sheep: " + clonedBlackSheep.getName());
    //        System.out.println("White sheep: " + clonedWhiteSheep.getName());
    //    }
    //}


    //Плюсы и минусы шаблона Прототип

    //Плюсы:
    //1 - Простое клонирование объектов:
    //шаблон позволяет создавать новые объекты путем копирования существующих,
    //что способствует повторному использованию кода.
    //Это очень полезно, если объекты имеют сложные или ресурсоемкие процессы инициализации.

    //2 - Сокращение накладных расходов на инициализацию.
    //Поскольку объекты клонируются, а не создаются с нуля,
    //это может значительно снизить накладные расходы, связанные с дорогостоящей инициализацией объектов.

    //3 - Индивидуальная настройка:
    //клонированные объекты можно легко настроить в соответствии с конкретными требованиями,
    //сохраняя при этом общие характеристики прототипа.
    //Это обеспечивает гибкость при создании объектов.

    //4 - Оптимизированное создание объектов:
    //шаблон обеспечивает структурированный и последовательный способ создания объектов,
    //что делает базу кода более организованной и простой в обслуживании.

    //5 - Минимизированная логика создания сложных объектов.
    //Шаблон Прототип абстрагирует логику создания сложных объектов от клиентского кода,
    //что приводит к более чистому и удобочитаемому коду.

    //Минусы:
    //1 - Поверхностное и глубокое копирование.
    //В сценариях, где объекты содержат ссылки на другие объекты (например, вложенные объекты),
    //клонирование по умолчанию может привести к созданию неглубоких копий.
    //Это означает, что изменения вложенных объектов в клонированном объекте могут повлиять
    //на исходный объект и наоборот.
    //Может потребоваться глубокое копирование, которое иногда сложно реализовать.

    //2 - Управление состоянием объекта.
    //Если объект имеет внутреннее состояние, которое не должно использоваться несколькими клонами,
    //необходимо тщательное управление состоянием объекта, чтобы гарантировать,
    //что каждый клон сохраняет свою целостность.

    //3 - Создание конкретных прототипов.
    //Реализация шаблона прототипа часто включает в себя создание конкретных классов-прототипов
    //и настройку их методов clone. Это может привести к появлению дополнительных классов и лишней сложности.

    //4 - Ограниченная применимость:
    //шаблон Прототип наиболее подходит, когда стоимость создания объектов с нуля высока.
    //В тех случаях, когда создание объекта является относительно простым и недорогим,
    //использование шаблона может привести к ненужной сложности.

    //5 - Совместимость с сериализацией.
    //Если вам нужно клонировать сериализуемые объекты, вы можете столкнуться с проблемами,
    //связанными с сериализацией и десериализацией объектов.

    //Заключение
    //Отметим, что шаблон проектирования Прототип — это ценный инструмент для улучшения возможности
    //повторного использования кода, упрощения создания объектов и структурированной настройки объектов.
    //Однако при принятии решения о реализации этого шаблона в проекте программного обеспечения важно
    //учитывать сложности клонирования,
    //управления состоянием объекта и его пригодность для вашего конкретного случая использования.
}