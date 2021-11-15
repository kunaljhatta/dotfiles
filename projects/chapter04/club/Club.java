import java.util.ArrayList;
import java.util.Iterator;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;

    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();

    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public void join(Membership member)
    {
        members.add(member);
    }

    /**
     * Determine the number of members who joined in the given
     * month.
     * @param month The month we are interested in.
     * @return The number of members who joined in that month.
     */
    public int joinedInMonth(int month){
        int amountJoined = 0;
        if(month <= 12 && month > 0){
            for(Membership member: members)
                if (member.getMonth() == month){
                    amountJoined ++;
                }
        }
        else {
            System.out.println("Invalid month entered, must be within 1-12. ");
        }
        return amountJoined;
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */

    public int numberOfMembers()
    {
        return members.size();
    }
}
