import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scoreboard extends Actor
{
    private int points; // The amount of points.
    private Font myFont = new Font("Comic Sans MS",true,false,24); // The font.
    
    public Scoreboard()
    {
        points = 0; // Sets the points to 0.
        GreenfootImage img = new GreenfootImage(150,30); // Creates a new picture and draws the score.
        img.setFont( myFont );
        img.drawString("Score: " + points,5,25);
        setImage(img);
    }
    public void addToScore()
    {
        points++; // Changes the score by one.
        GreenfootImage img = getImage(); // Gets the image.
        img.clear(); // Clears it.
        if(points < 10) { // If points is less than ten...
            img.drawString("Score: " + points,5,25); // Draw the amount of food eaten.
        } else { // Else...
            img.drawString("You won!!!",5,25); // Draw "You won!!!"
            Greenfoot.stop(); // Stop the game.
        }
    }
}
