package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Hero h1_kimmy = new Hero("<HERO> Kimmy");
        Enemy e1_lord = new Enemy("<ENEMY> Lord");

        h1_kimmy.move();
        h1_kimmy.move("West");

        e1_lord.move();
        e1_lord.move(10);
    }
}
