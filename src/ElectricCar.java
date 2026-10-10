public class ElectricCar extends Car
{
    private double batteryCapacity;   // кВт*год
    private int passengers;

    public ElectricCar(String name, double speed, double batteryCapacity, int passengers)
    {
        super(name, 0, speed);   // fuelConsumption = 0
        this.batteryCapacity = batteryCapacity;
        this.passengers = passengers;
    }

    @Override
    public void move(double hours)
    {
        System.out.println(name + " (електро) проїхав " + (speed * hours) + " км за " + hours + " год.");
    }

    @Override
    public double getFuelUsed(double hours)
    {
        // споживає електроенергію (кВт·год)
        return (15.0 / 100) * speed * hours;   // ~15 кВт*год на 100 км
    }

    @Override
    public void printCargoOrPassengers()
    {
        System.out.println("Перевезено пасажирів: " + passengers);
    }

    @Override
    public double getPollution()
    {
        return 0.1;   // майже нуль (умовн)
    }
}
