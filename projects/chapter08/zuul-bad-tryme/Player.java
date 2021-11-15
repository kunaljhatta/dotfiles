
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    // instance variables - replace the example below with your own
    private Room currentRoom;
    private String name;
    private int maxWeight;

    /**
     * Constructor for objects of class Player
     */
    public Player(Room currentRoom, String name)
    {
        // initialise instance variables
        this.currentRoom = currentRoom;
        this.name = name;
        maxWeight = 50;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Room moveRoom(Room newRoom)
    {
        // put your code here
        currentRoom = newRoom;
        return currentRoom;
    }
}
