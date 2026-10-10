public class AccessTest
{
    public static void main(String[] args)
    {
        Person p = new Person("Олег", 20);

        // public поле — доступне напряму
        System.out.println("Ім'я (public): " + p.name);
        p.name = "Іван";
        System.out.println("Нове ім'я: " + p.name);

        // private поле напряму не доступне (буде помилка компіляції)
        // System.out.println(p.age);

        // Доступ через геттер/сеттер
        System.out.println("Вік (через getter): " + p.getAge());
        p.setAge(25);
        System.out.println("Новий вік: " + p.getAge());
    }
}