package designpatterns.builder.cars;

import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class Truck {

    private final CarType cartype;
    private final int seats;
    private final Transmission transmission;
    private final Engine engine;

    public Truck(CarType cartype,
                 int seats,
                 Engine engine,
                 Transmission transmission) {
        this.cartype = cartype;
        this.seats = seats;
        this.transmission = transmission;
        this.engine = engine;
    }

    public String result(){
        String truck = "Truck with motor: " +engine.getPower()+ "\n";
        truck += "Transimission" +transmission;

        return truck;
    }
}
