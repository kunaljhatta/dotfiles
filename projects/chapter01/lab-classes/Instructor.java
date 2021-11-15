
/**
 * Write a description of class Instructor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Instructor extends Person
{
    String course;

    /**
     * Create a new student with a given name and ID number.
     */
    public Instructor(String fullName, String id, String course)
    {
        super(fullName, id);
        this.course = course;
        if (id.length() < 3)
        {
            System.out.println("ID length too short. Minimum 3 characters. ");
        }
    }

    /**
     * Get the course the instructor is teaching
     */
    public String getCourse() {
        return course;
    }
    
    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        super.print();
        System.out.println(", couse: " + course);
    }
}