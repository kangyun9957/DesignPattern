package structural_patterns.bridge.after;

import structural_patterns.bridge.before.Champion;

public class DefaultChampion implements Champion {

    private Skin skin;
    private String name;

    DefaultChampion(Skin skin,String name){
        this.skin = skin;
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println(skin.getName() + name);
    }

    @Override
    public void skillQ() {
        System.out.println(skin.getName() + name+" Q");
    }

    @Override
    public void skillW() {
        System.out.println(skin.getName() + name + " W");
    }

    @Override
    public void skillE() {
        System.out.println(skin.getName() + name+ " E");
    }

    @Override
    public void skillR() {
        System.out.println(skin.getName() + name + " R");
    }

    @Override
    public String getName() {
        return name;
    }
}
