package designpatterns.factorymethod.vehicles;

public class Bike implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Rota gerada!");
    }

    @Override
    public void getCargo() {
        System.out.println("Carga coletada!");
    }
}
