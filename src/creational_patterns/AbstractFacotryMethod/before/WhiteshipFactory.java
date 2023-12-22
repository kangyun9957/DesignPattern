package creational_patterns.AbstractFacotryMethod.before;

import creational_patterns.factoryMethod.after.Ship;
import creational_patterns.factoryMethod.after.ShipFactory;
import creational_patterns.factoryMethod.after.WhiteShip;

public class WhiteshipFactory implements ShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
