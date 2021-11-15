
/**
 * Write a description of class Sample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sample
{
    // instance variables - replace the example below with your own
    private int Sum;

    /**
     * Constructor for objects of class Sample
     */
    public Sample()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addSum(int a, int b)
    {
        // put your code here
        int index = 1;
        int sum = 0;
        while(index<=10){
            sum = sum+index;
            index++;
            
        }
        System.out.println("The sum of the numbers 1 to 10 is:" + sum);
    }
    
}
