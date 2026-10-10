public class Truck extends Car
{
    private double cargoWeight;   // тонни

    public Truck(String name, double fuelConsumption, double speed, double cargoWeight)
    {
        super(name, fuelConsumption, speed);
        this.cargoWeight = cargoWeight;
    }

    @Override
    public void move(double hours)
    {
        System.out.println(name + " проїхала " + (speed * hours) + " км за " + hours + " год.");
    }

    @Override
    public double getFuelUsed(double hours)
    {
        return (fuelConsumption / 100) * speed * hours * (1 + cargoWeight * 0.05);
    }

    @Override
    public void printCargoOrPassengers()
    {
        System.out.println("Перевезено вантажу: " + cargoWeight + " т");
    }

    @Override
    public double getPollution()
    {
        return getFuelUsed(1) * 3.5;
    }
}
