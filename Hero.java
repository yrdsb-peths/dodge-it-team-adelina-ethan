import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Hero extends Actor
{
    int position = 0;
    
    public Hero () {
        setImage ("images/ppl1.png");
    }
    
    public void act()
    {
        if (Greenfoot.mouseClicked(null)) {
            position ++;
            position = position%4;
        }
        
        if (position == 0) {
            setLocation (100, 100);
        } else if (position == 1) {
            setLocation (100, 150);
        } else if (position == 2) {
            setLocation (100, 250);
        } else {
            setLocation (100, 300);
        }
    }
}
