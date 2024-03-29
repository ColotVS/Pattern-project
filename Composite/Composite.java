package Composite;

public class Composite {    //structural pattern, Структурный паттерн
    //Паттерн проектирования «Компоновщик» / «Composite»


    //Проблема
    //Предоставить клиенту единообразный доступ к листовым и составным элементам древовидной структуры.

    //Структура
    //Составной шаблон предназначен для того, чтобы позволять обрабатывать отдельные объекты и композиции объектов,
    //или “композиты”, одинаковым образом.

    //Его можно рассматривать как древовидную структуру, состоящую из типов, наследующих базовый тип,
    //и он может представлять отдельную часть или целую иерархию объектов.

    //Мы можем разбить этот шаблон на:

    //component – это базовый интерфейс для всех объектов в композиции. Это должен быть либо интерфейс,
    //либо абстрактный класс с общими методами для управления дочерними композитами.

    //leaf – реализует поведение базового компонента по умолчанию. Он не содержит ссылок на другие объекты.

    //сomposite – содержит конечные элементы.
    //Он реализует методы базового компонента и определяет операции, связанные с дочерними компонентами.

    //client – имеет доступ к элементам композиции с помощью базового объекта component.


    //Практический пример
    //Теперь давайте углубимся в реализацию.
    //Предположим, мы хотим построить иерархическую структуру отделов в компании.

    //3.1. Базовый компонент
    //В качестве объекта component мы определим простой интерфейс отдела:

    //public interface Department {
    //    void printDepartmentName();
    //}


    //3.2. Leafs
    //Для конечных компонентов давайте определим классы для финансовых отделов и отделов продаж:

    //public class FinancialDepartment implements Department {
    //
    //    private Integer id;
    //    private String name;
    //
    //    public void printDepartmentName() {
    //        System.out.println(getClass().getSimpleName());
    //    }
    //
    //    // standard constructor, getters, setters
    //}

    //Второй конечный класс, SalesDepartment, похож:

    //public class SalesDepartment implements Department {
    //
    //    private Integer id;
    //    private String name;
    //
    //    public void printDepartmentName() {
    //        System.out.println(getClass().getSimpleName());
    //    }
    //
    //    // standard constructor, getters, setters
    //}

    //Оба класса реализуют метод printDepartmentName() из базового компонента, где они печатают имена классов для каждого из них.
    //Кроме того, поскольку они являются конечными классами, они не содержат других объектов Department.
    //Далее давайте также рассмотрим составной класс.


    //3.3. Составной элемент
    //В качестве составного класса давайте создадим класс HeadDepartment:

    //public class HeadDepartment implements Department {
    //    private Integer id;
    //    private String name;
    //
    //    private List<Department> childDepartments;
    //
    //    public HeadDepartment(Integer id, String name) {
    //        this.id = id;
    //        this.name = name;
    //        this.childDepartments = new ArrayList<>();
    //    }
    //
    //    public void printDepartmentName() {
    //        childDepartments.forEach(Department::printDepartmentName);
    //    }
    //
    //    public void addDepartment(Department department) {
    //        childDepartments.add(department);
    //    }
    //
    //    public void removeDepartment(Department department) {
    //        childDepartments.remove(department);
    //    }
    //}
    //Копировать
    //Это составной класс, поскольку он содержит коллекцию компонентов отдела,
    //а также методы для добавления и удаления элементов из списка.

    //Составной метод printDepartmentName() реализуется путем перебора списка конечных элементов и
    //вызова соответствующего метода для каждого из них.

    //4. Тестирование
    //В целях тестирования давайте взглянем на класс CompositeDemo:
    //public class CompositeDemo {
    //    public static void main(String args[]) {
    //        Department salesDepartment = new SalesDepartment(
    //          1, "Sales department");
    //        Department financialDepartment = new FinancialDepartment(
    //          2, "Financial department");
    //
    //        HeadDepartment headDepartment = new HeadDepartment(
    //          3, "Head department");
    //
    //        headDepartment.addDepartment(salesDepartment);
    //        headDepartment.addDepartment(financialDepartment);
    //
    //        headDepartment.printDepartmentName();
    //    }
    //}
    //Копировать
    //Сначала мы создаем два экземпляра для финансового отдела и отдела продаж.
    //После этого мы создаем экземпляр головного отдела и добавляем к нему ранее созданные экземпляры.

    //Наконец, мы можем протестировать метод композиции printDepartmentName().
    //Как мы и ожидали, выходные данные содержат имена классов каждого конечного компонента:
    //SalesDepartment
    //FinancialDepartment
}
