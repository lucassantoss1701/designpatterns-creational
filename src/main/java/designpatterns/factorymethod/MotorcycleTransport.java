package designpatterns.factorymethod;

import designpatterns.factorymethod.vehicles.IVehicle;
import designpatterns.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
