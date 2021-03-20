package designpatterns.abstractfactory.app;

import designpatterns.abstractfactory.aircrafts.IAircraft;
import designpatterns.abstractfactory.factories.ITransportFactory;
import designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
       vehicle = factory.createTransportVehicle();
       aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
