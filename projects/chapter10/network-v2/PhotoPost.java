import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed.
 * The main part of the post consists of a photo and a caption.
 * Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class PhotoPost extends Post
{
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }
    
    public void printShortSummary()
    {
        System.out.println( " Photo Post from " + getName());
        
   
    }
    
    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }
    
     public void display()
    {
        System.out.println(caption);
        // //System.out.print(timeString(timestamp));
        
        // if(likes > 0) {
            // System.out.println("  -  " + likes + " people like this.");
        // }
        // else {
            // System.out.println();
        // }
        
        // if(comments.isEmpty()) {
            // System.out.println("   No comments.");
        // }
        // else {
            // System.out.println("   " + comments.size() + " comment(s). Click here to view.");
        // }
    }
   
    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
    }
}
