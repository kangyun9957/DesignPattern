package factoryMethod.after;

import AbstractFacotryMethod.after.Anchor;
import AbstractFacotryMethod.after.Wheel;
import AbstractFacotryMethod.before.WhiteAnchor;

public class Ship {

    private String name;

    private String color;

    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }

    public Anchor getAnchor(){
        return anchor;
    }

    public Wheel getWheel(){
        return wheel;
    }

    public void setAnchor(Anchor anchor){
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel){
        this.wheel = wheel;
    }
}