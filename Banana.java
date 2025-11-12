import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public Banana () {
        setImage ("images/bananas.png");
    }
    public void act()
    {
        move(-7);
        
        if(getX() <= 0){
            resetBanana();
        }
        
        if(isTouching(Hero.class)){
            SadFace sadFace = new SadFace();
            getWorld().addObject (sadFace, 300, 200);
            
            getWorld().removeObject(this);
        }
    }
    
    public void resetBanana() {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0 ){
            setLocation(600, 300);
        } else{
            setLocation(600, 300);
        }
    }
}
