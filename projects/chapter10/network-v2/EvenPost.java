
/**
 * Write a description of class EvenPost here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenPost extends Post
{
    // instance variables - replace the example below with your own
    private String event;

    /**
     * Constructor for objects of class EvenPost
     */
    public EvenPost(String user, String event )
    {
        // initialise instance variables
        super(user);
        this.event = event;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
   public void display()
   {
    super.display();
    System.out.println("The Event is: " + event );
   }
}
