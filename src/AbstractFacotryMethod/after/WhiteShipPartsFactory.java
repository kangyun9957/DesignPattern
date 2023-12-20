package AbstractFacotryMethod.after;

import AbstractFacotryMethod.before.WhiteAnchor;
import AbstractFacotryMethod.before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhileWheelPro();
    }
}
