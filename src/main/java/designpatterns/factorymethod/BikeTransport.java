package designpatterns.factorymethod;

import designpatterns.factorymethod.vehicles.Bike;
import designpatterns.factorymethod.vehicles.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
