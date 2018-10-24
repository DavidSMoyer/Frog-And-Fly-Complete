import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * Have the fly count how many Food object it eats (2 marks)
 * Every time the fly eats all 10 Food objects, add 10 more Food
 * objects to the world and continue playing. (3 marks)
 * 
 */
public class Fly extends Creature
{
    public Fly()
    {
        /*
         * modify this code to make the fly face any random 
         * initial direction
         */
        setRotation( Greenfoot.getRandomNumber(361) );
    }
    
    public void act() 
    {
        // make the fly move 4 steps in the direction it is facing
        /*
         * Make the fly turn left or right 5 degrees when
         * the left or right arrow key is pressed. 
         */
        checkKeys();
        
        
        /*
         * If the fly touches a Food object, remove the Food object
         * from the world. 
         */
        eatFood();
        
    }    
    /**
      * Checks if the arrow keys were pressed.
      * If the UP arrow is pressed it moves forward.
      * If the LEFT arrow is pressed it turns left.
      * If the RIGHT arrow is pressed it turns right.
      * 
      * @return None
      * @param None There are no parameters.
      */
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("up") == true) {
            move(4);
        }
        if (Greenfoot.isKeyDown("left") == true) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right") == true) {
            turn(5);
        }
    }
    /**
     * If the fly is touching food it eats it.
     * 
     * @param None There are no parameters.
     * @return None
     */
    private void eatFood()
    {
        if (isTouching(Food.class) == true) {
            removeTouching(Food.class);
            ((Beach)getWorld()).update();
        }
    }
}
