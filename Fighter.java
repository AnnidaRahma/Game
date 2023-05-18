package Polymorphism;

public class Fighter extends Hero {
    public Fighter(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is using her new Skateboards");
    }

    public void move(String direction) {
        System.out.println(name + " is moving swiftly towards " + direction + ".");
    }
}