package AbstractFacotryMethod.after;

import AbstractFacotryMethod.before.WhiteshipFactory;
import factoryMethod.after.Ship;
import factoryMethod.after.ShipFactory;
import factoryMethod.after.WhiteShip;

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
