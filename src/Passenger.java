
class Passenger {}

class Firefighter extends Passenger {}

class PoliceOfficer extends Passenger {}

class TransportVehicle<T extends Passenger>
{
    private int seatsCapacity;
    private int currentPassengers;

    public TransportVehicle(int seatsCapacity)
    {
        this.seatsCapacity = seatsCapacity;
        this.currentPassengers = 0;
    }

    public int getCurrentPassengers()
    {
        return currentPassengers;
    }

    public void board(T passenger) throws Exception
    {
        if (currentPassengers < seatsCapacity)
        {
            currentPassengers++;
        }
        else
        {
            throw new Exception("Всі місця зайняті.");
        }
    }

    public void disembarkFunction(T passenger) throws Exception
    {
        if (currentPassengers > 0)
        {
            currentPassengers--;
        }
        else
        {
            throw new Exception("Нікого висаджувати.");
        }
    }
}

class Automobile<T extends Passenger> extends TransportVehicle<T>
{
    public Automobile(int seatsCapacity) {
        super(seatsCapacity);
    }
}

class PoliceCar<T extends PoliceOfficer> extends Automobile<T>
{
    public PoliceCar(int seatsCapacity) {
        super(seatsCapacity);
    }
}

class Taxi<T extends Passenger> extends Automobile<T>
{
    public Taxi(int seatsCapacity) {
        super(seatsCapacity);
    }
}

class Bus<T extends Passenger> extends TransportVehicle<T>
{
    public Bus(int seatsCapacity) {
        super(seatsCapacity);
    }
}

class FireTruck<T extends Firefighter> extends Automobile<T>
{
    public FireTruck(int seatsCapacity) {
        super(seatsCapacity);
    }
}
