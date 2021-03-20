package designpatterns;

import designpatterns.builder.builders.CarBuilder;
import designpatterns.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);
    }

}
