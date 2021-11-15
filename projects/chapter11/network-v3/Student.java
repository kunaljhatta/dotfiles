import java.util.ArrayList;
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private java.util.ArrayList<Student> myList;

    /**
     * Constructor for objects of class Student
     */
    public Student(String name)
    {
        
        this.name = name;
        myList = new ArrayList<Student>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString()
    {
        return  name;
    }
    
    public void list()
    {
        var m = new ArrayList<String>();
        m.add("Kunal");
        m.add("Saira");
        m.add("Kala");
        System.out.println(m);
        
    }
    
   
}
