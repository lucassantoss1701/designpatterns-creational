package designpatterns.factorymethod;

import designpatterns.factorymethod.vehicles.Car;
import designpatterns.factorymethod.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
