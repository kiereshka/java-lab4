
import java.util.ArrayList;
import java.util.List;

class Road
{
    public List<TransportVehicle<?>> vehiclesOnTheRoad = new ArrayList<>();

    public int passengersCount()
    {
        int counter = 0;
        for (TransportVehicle<?> vehicle : vehiclesOnTheRoad)
        {
            counter += vehicle.getCurrentPassengers();
        }
        return counter;
    }

    public void addVehicle(TransportVehicle<?> vehicle)
    {
        vehiclesOnTheRoad.add(vehicle);
    }

}