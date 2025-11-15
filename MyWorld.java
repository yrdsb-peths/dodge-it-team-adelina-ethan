import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Hero hero = new Hero();
        addObject (hero, 100, 50);
        
        Banana banana = new Banana();
        addObject (banana, 600, 350);
        
        Apple apple = new Apple();
        addObject (apple, 600, 150);
        
    }
}
