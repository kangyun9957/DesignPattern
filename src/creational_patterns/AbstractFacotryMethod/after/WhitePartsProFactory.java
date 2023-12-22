package creational_patterns.AbstractFacotryMethod.after;

import creational_patterns.AbstractFacotryMethod.before.WhiteWheel;

public class WhitePartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
