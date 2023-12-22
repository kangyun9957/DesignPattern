package creational_patterns.AbstractFacotryMethod.after;

import creational_patterns.factoryMethod.after.Ship;
import creational_patterns.factoryMethod.after.ShipFactory;
import creational_patterns.factoryMethod.after.WhiteShip;

public class WhiteShipFactory implements ShipFactory {

    ShipPartsFactory shipPartsFactory;

    WhiteShipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
