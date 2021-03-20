package designpatterns.builder.director;

import designpatterns.builder.builders.IBuilder;
import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class Director {
    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }
}
