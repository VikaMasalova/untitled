public class CarDemo
{
    public static void main(String[] args)
    {
        Car[] cars = {
                new PassengerCar("Toyota Camry", 8.5, 90, 4),
                new Truck("Volvo FH16", 25.0, 70, 18.0),
                new ElectricCar("Tesla Model 3", 100, 75, 5)
        };

        for (Car car : cars)
        {
            car.printName();
            car.move(2.0);                          // 2 години
            System.out.println("Спожито: " + car.getFuelUsed(2.0) +
                    (car instanceof ElectricCar ? " кВт*год" : " л"));
            car.printCargoOrPassengers();
            System.out.println("Забруднення: " + car.getPollution());
            System.out.println("-----------------------------");
        }
    }
}
