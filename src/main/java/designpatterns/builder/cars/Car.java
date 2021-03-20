package designpatterns.builder.cars;

import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class Car {

    private final CarType cartype;
    private final int seats;
    private final Transmission transmission;
    private final Engine engine;


    public Car(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission){
        this.cartype = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public CarType getCartype(){
        return cartype;
    }

    public int getSeats() {
        return seats;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Engine getEngine() {
        return engine;
    }
}
