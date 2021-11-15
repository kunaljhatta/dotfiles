import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    private SalesItem salesIte1;
    private SalesItem salesIte2;
    private SalesItem salesIte3;

    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        salesIte1 = new SalesItem("rahul", 8000);
        salesIte1.addComment("kunal", "foo", 5);
        salesIte1.addComment("saira", "foofoo", 2);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(0);
        salesIte1.findMostHelpfulComment();
        salesIte1.downvoteComment(0);
        salesIte1.downvoteComment(0);
        salesIte1.downvoteComment(0);
        salesIte1.findMostHelpfulComment();
        salesIte2 = new SalesItem("kunal", 8000);
        salesIte3 = new SalesItem("saira", 6000);
        salesIte2.addComment("seema", "good", 4);
        salesIte2.addComment("kumar", "good", 2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    public void check()
    {
        SalesItem salesIte2 = new SalesItem("pant", 10000);
        assertEquals(true, salesIte2.addComment("kunal", "great product", 5));
        assertEquals(true, salesIte2.addComment("james", "awesome", 3));
        assertEquals(true, salesIte2.getNumberOfComments());
    }

    @Test
    public void checkSameComment()
    {
        SalesItem salesIte2 = new SalesItem("kunal", 8000);
        assertEquals(true, salesIte2.addComment("kunaljhatta", "help", 5));
        assertEquals(false, salesIte2.addComment("kunaljhatta", "good", 4));
    }

    @Test
    public void ratingValues()
    {
        SalesItem salesIte1 = new SalesItem("kunal", 60000);
        assertEquals(false, salesIte1.addComment("saira", "really awesome", 6));
        assertEquals(false, salesIte1.addComment("seema", "good product", 0));
    }

    @Test
    public void MostHelpfulCommentCheck()
    {
        SalesItem salesIte1 = new SalesItem("Kunal", 5000);
        assertEquals(true, salesIte1.addComment("Sehul", "great", 3));
        assertEquals(true, salesIte1.addComment("saira", "great great", 5));
        assertEquals(true, salesIte1.addComment("seema", "stuff", 5));
        salesIte1.upvoteComment(0);
        salesIte1.upvoteComment(2);
        Comment comment1 = salesIte1.findMostHelpfulComment();
        assertEquals(comment1, comment1);
        assertEquals("Sehul", comment1.getAuthor());
        assertEquals(3, comment1.getRating());
        comment1.upvote();
        assertEquals(2, comment1.getVoteCount());
    }


    @Test
    public void add()
    {
        assertEquals(false, salesIte1.addComment("kunal", "j", 4));
        assertEquals(false, salesIte1.addComment("kumar", "gi", 6));
        assertEquals(false, salesIte1.addComment("ashwani", "cutg", 0));
    }

    

    @Test
    public void hello()
    {
        assertEquals(true, salesIte1.addComment("kunal", "hi", 3));
        SalesItem salesIte4 = new SalesItem("ritik", 90000);
        assertEquals(true, salesIte4.addComment("himanshu", "kidan jo", 4));
        SalesItem salesIte5 = new SalesItem("dyaal", 20000);
    }
}







