package creational_patterns.factoryMethod.after;

public class WhiteShipFactory implements ShipFactory{


    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}
