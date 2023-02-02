package test;

/*
Объявить в методе приватные 2 поля Int age, String name
Сделать конструктор
Сделать Getter и Setter
Создать метод main
Создать экзэмпляр класса и присвоить ему значения
 */
public class Test1 {

    //Объявить переменные:
    private int age;
    private String name;

    //Создать конструктор:
    public Test1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //Создать Getter и Setter:
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //создаём метод main:
    public static void main(String[] args) {
        //объявляем экзэмпляр класса и присваиваем ему значения:
        Test1 test1 = new Test1(2, "Katja");

        //добавить 4 таких же экзэмпляра:
        Test1 test2 = new Test1(4, "Petja");
        Test1 test3 = new Test1(6, "Ira");
        Test1 test4 = new Test1(8, "Olga");
        Test1 test5 = new Test1(10, "Oleg");
    }
}
