package AbstractFacotryMethod.before;

import factoryMethod.after.Ship;
import factoryMethod.after.ShipFactory;
import factoryMethod.after.WhiteShip;

public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
