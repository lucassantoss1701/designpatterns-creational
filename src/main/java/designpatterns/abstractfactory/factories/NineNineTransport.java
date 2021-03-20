package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.aircrafts.Helicopter;
import designpatterns.abstractfactory.aircrafts.IAircraft;
import designpatterns.abstractfactory.landvehicles.ILandVehicle;
import designpatterns.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
