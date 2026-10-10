public class Student
{
    private String name;
    private int course;
    private double averageMark;

    // 1. Конструктор за замовчуванням
    public Student()
    {
        this.name = "Невідомий";
        this.course = 1;
        this.averageMark = 0.0;
    }

    // 2. Конструктор з параметрами
    public Student(String name, int course, double averageMark)
    {
        this.name = name;
        this.course = course;
        this.averageMark = averageMark;
    }

    // 3. Конструктор копіювання
    public Student(Student other)
    {
        this.name = other.name;
        this.course = other.course;
        this.averageMark = other.averageMark;
    }

    public void printInfo()
    {
        System.out.println("Студент: " + name +
                ", курс: " + course +
                ", середній бал: " + averageMark);
    }

    public static void main(String[] args)
    {
        Student s1 = new Student();                          // за замовчуванням
        Student s2 = new Student("Марія", 3, 4.7);          // з параметрами
        Student s3 = new Student(s2);                       // копія

        s1.printInfo();
        s2.printInfo();
        s3.printInfo();
    }
}
