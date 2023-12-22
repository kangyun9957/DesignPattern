package creational_patterns.singleton;

public class Settings2 {
    private static final Settings2 Instance = new Settings2();

    private Settings2(){

    }

    public static Settings2 getInstance(){
        return Instance;
    }
}
