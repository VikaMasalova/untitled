public class PassengerCar extends Car
{
    private int passengers;

    public PassengerCar(String name, double fuelConsumption, double speed, int passengers)
    {
        super(name, fuelConsumption, speed);
        this.passengers = passengers;
    }

    @Override
    public void move(double hours)
    {
        System.out.println(name + " проїхав " + (speed * hours) + " км за " + hours + " год.");
    }

    @Override
    public double getFuelUsed(double hours)
    {
        return (fuelConsumption / 100) * speed * hours;
    }

    @Override
    public void printCargoOrPassengers()
    {
        System.out.println("Перевезено пасажирів: " + passengers);
    }

    @Override
    public double getPollution()
    {
        return getFuelUsed(1) * 2.3;
    }
}
