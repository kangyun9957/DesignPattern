package singleton;

import java.util.Set;

public class Settings1 {
    private static Settings1 instance;

    private Settings1(){

    }

    public static synchronized Settings1 getInstance(){
        if(instance == null){
            instance = new Settings1();
        }
        return instance;
    }
}
