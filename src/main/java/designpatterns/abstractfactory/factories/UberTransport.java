package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.aircrafts.Airplane;
import designpatterns.abstractfactory.aircrafts.IAircraft;
import designpatterns.abstractfactory.landvehicles.Car;
import designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
