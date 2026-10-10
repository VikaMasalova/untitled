public abstract class Car
{
    protected String name;
    protected double fuelConsumption;
    protected double speed;

    public Car(String name, double fuelConsumption, double speed)
    {
        this.name = name;
        this.fuelConsumption = fuelConsumption;
        this.speed = speed;
    }

    // Поліморфні методи
    public abstract void move(double hours);
    public abstract double getFuelUsed(double hours);
    public abstract void printCargoOrPassengers();
    public abstract double getPollution();

    public void printName()
    {
        System.out.println("Автомобіль: " + name);
    }
}