package Builder;

public class Builder {
    //Паттерн проектирования Builder в Java

    //Зачем нам нужен паттерн проектирования Builder?

    //Паттерн Builder предназначен для создания объектов с использованием вложенного
    //общедоступного статического класса,
    //который имеет те же поля данных, что и внешний класс.

    //Паттерн Builder создали для решения проблем, которые имелись в паттернах проектирования
    //Factory и Abstract Factory, когда объект класса содержит много значений полей и/или данных.

    //Прежде чем мы перейдем к паттерну Builder, давайте посмотрим, какие именно проблемы возникают
    //с паттернами Factory и Abstract Factory для сценариев, где объект имеет много значений полей:

    //Наличие слишком многих аргументов для передачи из клиентской программы в класс
    //Factory может приводить к возникновению ошибок,
    //поскольку в большинстве случаев тип аргументов здесь один и тот же,
    //а со стороны клиента трудно поддерживать порядок аргументов.

    //Некоторые параметры могут быть необязательными,
    //но в паттерне Factory мы вынуждены отправлять все параметры,
    //а необязательные параметры необходимо отправлять как файлы NULL.

    //Если объект “тяжелый” и со сложной разработкой, то все эти трудности станут частью классов Factory,
    //что часто приводит к путанице.

    //Вышеупомянутые проблемы можно решить, когда объект имеет большое количество параметров.
    //Для этого нужно просто предоставить конструктору необходимые параметры,
    //а затем различные setter-методы для установки необязательных параметров.

    //Учтите, что проблема с этим способом заключается в том,
    //что состояние объекта останется непоследовательным (inconsistent),
    //если все атрибуты четко не установлены.

    //Что такое паттерн проектирования Builder?
    //Паттерн Builder решает проблему с большим количеством необязательных параметров
    //и непоследовательных состояний, предоставляя способ пошагового создания объекта.
    //Для этого используется метод, который фактически возвращает окончательный объект.

    //Как реализовать паттерн проектирования Builder в Java?
    //Если мы выполним указанные ниже шаги, то получим поэтапный процесс создания объекта и его получения:
    //Создайте статический вложенный класс (static nested class) как класс Builder,
    //а затем скопируйте все поля из внешнего класса в класс Builder.
    //Мы должны следовать соглашению об именах, поэтому если имя класса Person,
    //то класс Builder должен называться как PersonBuilder.

    //Класс Builder должен иметь общедоступный конструктор со всеми необходимыми полями в качестве параметров.

    //Класс Builder должен иметь методы для установки необязательных параметров,
    //и он должен возвращать тот же объект Builder после установки необязательного поля.
    //
    //Последним шагом является предоставление метода build() в классе Builder,
    //который будет возвращать объект, необходимый клиентской программе.
    //Для этого нам нужно иметь частный конструктор в основном классе с классом Builder в качестве аргумента.

}
