package creational_patterns.singleton;

public class Settings4 {
    private static class SettingsHolder {
        private static final Settings4 SETTINGS = new Settings4();
    }

    public static Settings4 getInstance(){
        return SettingsHolder.SETTINGS;
    }
}
