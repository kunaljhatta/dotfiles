/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean schooltext)
    {
        author= bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = schooltext;
    }

    public void setRefNumber(String ref){
        if (refNumber.length() >= 3){
            refNumber = ref;
        }
        else{
            System.out.println("Must enter a reference number of three characters");
        }
    }

    public String getrefNumber(){
        return(refNumber);
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public void printdetails(){
        System.out.println("The author of the book is:" + author);
        System.out.println("The title of the book is:" + title);
        System.out.println("The number of pages in this book is:" + pages);
        System.out.println("The number of times the book borrowed is: " + borrowed);
        if (refNumber.length() > 0 ){
            System.out.println("The reference is: " + refNumber );
        }
        else{
            System.out.println("ZZZ" );

        }
    }

    public int getPages(){
        return(pages);
    }

    public void printAuthor(){
        System.out.println(author);
    }

    public void printTitle(){
        System.out.println(title);
    }
    
    public void borrow(){
     borrowed++;
     
    }
    
    public int getBorrowed(){
        return borrowed;
    }
    
    public boolean getCourseText(){
        return courseText;
    
    }
}   
