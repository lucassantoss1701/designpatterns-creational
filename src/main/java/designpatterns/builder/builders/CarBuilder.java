package designpatterns.builder.builders;

import designpatterns.builder.cars.Car;
import designpatterns.builder.components.CarType;
import designpatterns.builder.components.Engine;
import designpatterns.builder.components.Transmission;

public class CarBuilder implements IBuilder{

    private CarType cartype;
    private int seats;
    private Transmission transmission;
    private Engine engine;

    @Override
    public void setCarType(CarType carType) {
        this.cartype = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult(){
        return new Car(cartype, seats, engine, transmission);
    }
}
