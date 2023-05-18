package Polymorphism;

public class Enemy extends Character {
    public Enemy(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " is moving");
    }

    public void move(int step) {
        System.out.println(name + " is moving" + step + "steps");
    }
}
