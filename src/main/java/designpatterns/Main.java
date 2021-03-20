package designpatterns;

import designpatterns.abstractfactory.app.Application;
import designpatterns.abstractfactory.factories.ITransportFactory;
import designpatterns.abstractfactory.factories.NineNineTransport;
import designpatterns.abstractfactory.factories.UberTransport;

public class Main {
    public static Application configureApp(){
        ITransportFactory factory;

        String company = "uber";

        if("uber".equals(company)){
            factory = new UberTransport();
        }else{
            factory = new NineNineTransport();
        }

        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApp();
        app.startRoute();
    }

}
