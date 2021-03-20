package designpatterns;

import designpatterns.factorymethod.BikeTransport;
import designpatterns.factorymethod.CarTransport;
import designpatterns.factorymethod.MotorcycleTransport;
import designpatterns.factorymethod.Transport;
import designpatterns.factorymethod.vehicles.Bike;

public class Main {
    private static Transport transport;

    public static void main(String[] args) {
        configure(args[0]);
        if(transport != null){
            runTransport();
        }
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type){
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "bike":
                transport = new BikeTransport();
                break;
            default:
                System.out.println("Escolha um tipo de serviço.");
        }
    }
}
