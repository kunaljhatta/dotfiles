
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    // the persons full name
    private String name;
    // the persons ID
    private String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
        if (this.name.length() < 4)
        {
            System.out.println("Name length too short. Minimum 4 characters ");
        }
    }

    /**
     * Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * Return the student ID of this student.
     */
    public String getID()
    {
        return id;
    }

    /**
     * Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        String name1 = "";
        String id1 = "";
        if (name.length() >= 4)
        {
            name1 = name.substring(0,4);
        }
        else 
        {
            name1 = name.substring(0,name.length());
        }
        if (id.length() >= 3)
        {
            id1 = id.substring(0,3);
        }
        else
        {
            id1 = id.substring(0,id.length());
        }

        return name1 + id1;
    }

    /**
     * Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.print(name + ", ID: " + id);
    }
}