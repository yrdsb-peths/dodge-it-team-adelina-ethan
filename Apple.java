import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public Apple() {
        setImage ("images/apple2.png");
    }
    public void act()
    {
        move (-10);
        if(getX() <= 0){
            resetApple();
        }
        
    }
    public void resetApple() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0 ){
            setLocation(600, 150);
        } else{
            setLocation(600, 250);
        }
    }
}
