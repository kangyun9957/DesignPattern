package structural_patterns.bridge.after;

import structural_patterns.bridge.before.Champion;
import structural_patterns.bridge.before.KDA아리;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new PoolParty());
        kda아리.move();
        kda아리.skillE();
    }
}
