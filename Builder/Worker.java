package Builder;

public class Worker {
    private final String name;
    private final String company;
    private final int age;
    private final String sex;
    private final boolean hasCar;     //не обязательное для заполнения
    private final boolean married;    //не обязательное для заполнения

    private Worker (WorkerBuilder workerBuilder){   //Конструктор класса Worker
        name = workerBuilder.name;
        company = workerBuilder.company;
        age = workerBuilder.age;
        sex = workerBuilder.sex;
        hasCar = workerBuilder.hasCar;
        married = workerBuilder.married;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getAge() {
        return age;
    }

    public String getSex(){
        return sex;
    }
    public boolean isHasCar() {
        return hasCar;
    }
    public boolean isMarried() {
        return married;
    }
    public void work(){
        System.out.println(this.name + " работает в компании " + this.company);
        if(this.sex.equals("men")){
            System.out.println("Ему " + this.age + " лет.");
        }
        else System.out.println("Ей " + this.age + " лет.");
        if (this.hasCar){
            System.out.println("Есть машина");
        }
        if (this.married && this.sex.equals("men")){
            System.out.println("Женат");
        }
        else if (this.married && this.sex.equals("women")){
            System.out.println("Замужем");
        }
    }

    public static class WorkerBuilder{
        private final String name;
        private final String company;
        private final int age;
        private final String sex;
        private boolean hasCar;     //не обязательное для заполнения
        private boolean married;    //не обязательное для заполнения

        public WorkerBuilder(String name, String company, int age, String sex) {    //Создаём конструктор для обязательных параметров
            this.name = name;
            this.company = company;
            this.age = age;
            this.sex = sex;
        }

        public WorkerBuilder setHasCar(boolean hasCar) {    //Создаём сеттеры необязательных полей
            this.hasCar = hasCar;
            return this;
        }

        public WorkerBuilder setMarried(boolean married) {  //Создаём сеттеры необязательных полей
            this.married = married;
            return this;
        }

        public Worker build(){
            return new Worker(this);
        }
    }
}

class TestWorker{
    public static void main(String[] args) {
        Worker worker1 = new Worker.WorkerBuilder("Владислав","Google",25, "men").setHasCar(true).setMarried(true).build();
        Worker worker2 = new Worker.WorkerBuilder("Мария","Yandex",31, "women").setMarried(true).build();
        worker1.work();
        System.out.println();
        worker2.work();
        System.out.println();
        System.out.println(worker1.getName()+worker1.getAge()+worker1.getSex()+worker1.getCompany()+worker1.isHasCar()+worker1.isMarried());



    }
}

