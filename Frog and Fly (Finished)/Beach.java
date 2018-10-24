/**
 * Name: David Scott Moyer
 * Class: Software Development 10S
 * Teacher: Scott Hardman
 * Date Last Modified: 10/22/2018
 */


import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 5 marks
 */
public class Beach extends World
{
    private Scoreboard score; // Initialize the Scoreboard.
    public Beach()
    {    
       super(800, 600, 1); 
       // add 10 Food objects to the world (NOTE: YOU SHOULD BE CALLING A METHOD FROM THIS CLASS TO 
       // DO THIS!)
       addFood(10);

       // add a Fly object at a random position somewhere in the world
       addObject(new Fly(),Greenfoot.getRandomNumber(getWidth()),Greenfoot.getRandomNumber(getHeight()));
       
       // add a Frog object at the center of the world 
       addObject(new Frog(),getWidth()/2,getHeight()/2);
       
       score = new Scoreboard(); // Create the scoreboard object in the top left corner.
       addObject(score,75,15);
    }
    
    /**
     * Adds n Food objects to the world
     * 
     * @return None
     * @param Int The amount of food to add.
     */
    public void addFood(int n)
    {
        for(int f=0; f<n; f++) {
            int x = Greenfoot.getRandomNumber( getWidth() );
            int y = Greenfoot.getRandomNumber( getHeight() );
            addObject(new Food(),x,y);
        }
    }
    /**
     * Updates the score.
     * 
     * @return None
     * @param None There are no parameters.
     */
    public void update()
    {
        score.addToScore();
    }
}
