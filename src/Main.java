
public class Main {
    public static void main(String[] args)
    {
        Road road = new Road();

        PoliceCar<PoliceOfficer> policeCar = new PoliceCar<>(2);
        Taxi<Passenger> taxi = new Taxi<>(4);
        Bus<Passenger> bus = new Bus<>(60);
        FireTruck<Firefighter> fireEngine = new FireTruck<>(6);

        try
        {
            System.out.println("Спробуємо переповнити поліцейську машину.");
            policeCar.board(new PoliceOfficer());
            policeCar.board(new PoliceOfficer());
            policeCar.board(new PoliceOfficer());
        }
        catch (Exception e)
        {
            System.out.println("Shit happens.. " + e.getMessage());
        }
        try
        {
            System.out.println("Спробуємо висадити пасажира з пустого автобусу.");
            bus.disembarkFunction(new Passenger());
        }
        catch (Exception e)
        {
            System.out.println("Shit happens.. " + e.getMessage());
        }

        road.addVehicle(policeCar);
        road.addVehicle(taxi);
        road.addVehicle(bus);
        road.addVehicle(fireEngine);

        System.out.println("Загальна кількість пасажирів: " + road.passengersCount());
    }
}



