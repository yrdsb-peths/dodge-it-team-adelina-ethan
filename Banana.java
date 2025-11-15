import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public Banana () {
        setImage ("images/bananas.png");
    }
    public void act()
    {
        move(-10);
        
        if(getX() <= 0){
            resetBanana();
        }
        
    }
    
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0 ){
            setLocation(600, 50);
        } else{
            setLocation(600, 350);
        }
    }
}
