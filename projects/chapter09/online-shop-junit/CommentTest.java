

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
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

    @Test
    public void testCommentCreation()
    {
        Comment comment1 = new Comment("Max", "you are awesome", 5);
        assertEquals(true, comment1.getFullDetails());
    }


    @Test
    public void testVote()
    {
        Comment comment1 = new Comment("Bharat", " cool stuff", 3);
        comment1.upvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(true, comment1.getVoteCount());
        assertEquals(3, comment1.getVoteCount());
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(3, comment1.getRating());
    }

    @Test
    public void testDownVote()
    {
        Comment comment1 = new Comment("rahul", "good good", 1);
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        assertEquals(-6, comment1.getVoteCount());
    }

    @Test
    public void ratings()
    {
        Comment comment1 = new Comment("kunal", "hi", 1);
        comment1.downvote();
        comment1.downvote();
        comment1.downvote();
        comment1.upvote();
        comment1.upvote();
        assertEquals(1, comment1.getRating());
    }
}







