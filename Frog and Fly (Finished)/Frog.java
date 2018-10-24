import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 10 marks
 */
public class Frog extends Creature
{
    // The Frog's speed ...
    private int speed;
    
    public Frog()
    {        
        // set the Frog's speed to a random number between 4 and 8
        speed = Greenfoot.getRandomNumber(5) + 4;
    }
    
    public void act() 
    {
        // make the Frog move at its speed, in the direction it is facing
        move(speed);
        /*
         * Make the frog turn off course 35% of the time.
         * It will turn left or right 15 degrees equally as often. 
         */ 
        randomTurn();
        
        /*
         * If the frog is near an edge of the world, make it turn
         * 7 degrees to the right. 
         * 
         * Hint: use the atEdgeOfWorld method in the Creature class.
         */
        atEdge();
        
        
        /*
         * If the frog encounters the fly, the game ends, so
         * stop the scenario 
         */ 
        catchFly();
        
        
    }    
    /**
     * 35% of the time the frog will turn.
     * 50% of the time it will turn right.
     * 50% of the time it will turn left.
     * 
     * @return None
     * @param None There are no parameters.
     */
    private void randomTurn()
    {
        if (Greenfoot.getRandomNumber(101) < 35) {
            if (Greenfoot.getRandomNumber(2) == 0) {
                turn(15);
            }
            else {
                turn(-15);
            }
        }
    }
    /**
     * If the frog is at the edge it turns.
     * 
     * @return None.
     * @param None There are no parameters.
     */
    private void atEdge()
    {
        if (atEdgeOfWorld() == true) {
            turn(7);
        }
    }
    /**
     * If the frog catches the fly the game stops.
     * 
     * @return None
     * @param None There are no parameters.
     */
    private void catchFly()
    {
        if (isTouching(Fly.class) == true)
        {
            Greenfoot.stop();
        }
    }
}
