public class Person
{
    public String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Геттер для private поля
    public int getAge()
    {
        return age;
    }

    // Сеттер для private поля
    public void setAge(int age)
    {
        if (age > 0)
        {
            this.age = age;
        }
    }
}