import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class EndWorld extends World
{
    public EndWorld()
    {    
        super(600, 400, 1); 
        
        SadFace sadFace = new SadFace();
        addObject (sadFace, 300, 200);
    }
}
