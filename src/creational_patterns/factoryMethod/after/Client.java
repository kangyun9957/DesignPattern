package creational_patterns.factoryMethod.after;


public class Client {

    public static void main(String[] args) {
        Ship whiteship = new WhiteShipFactory().ordership("whiteShip","naver.com");
        System.out.println(whiteship);

        Ship blackship = new BlackShipFactory().ordership("blackShip","naver.com");
        System.out.println(blackship);
    }

}
