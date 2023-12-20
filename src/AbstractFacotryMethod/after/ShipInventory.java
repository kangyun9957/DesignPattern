package AbstractFacotryMethod.after;


import factoryMethod.after.Ship;
import factoryMethod.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args){
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
