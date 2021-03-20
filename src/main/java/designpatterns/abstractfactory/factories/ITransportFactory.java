package designpatterns.abstractfactory.factories;

import designpatterns.abstractfactory.aircrafts.IAircraft;
import designpatterns.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
