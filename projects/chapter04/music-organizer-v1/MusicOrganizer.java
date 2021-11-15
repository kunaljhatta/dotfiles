import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    public void listFilesss(String searchWord)
    {
        boolean x = true;
        for(String file : files)
        {
            if(file.contains(searchWord))
            {
                System.out.println(file);
                x = false;
            }

        }
        
         if(x)
        {
            System.out.println( "the matches is not found " + searchWord);
         }

    }
   
    public void checkIndex(int index){
        if( index >= 0 && files.size()-1 >= index ){
        }
        else{
            System.out.println("The values of index must be within: " + (files.size()-1) + ".");
        }

    }

    public boolean validIndex(int index){
        if(index >= 0 && files.size()-1 >= index )
        {
            return true;
        }
        else
        {
            return false;   
        }

    }
    
    public void listfile(int index){
        for(String file : files){
         if(validIndex(index)){
             files.get(index);
            }
        }
         
         
         
        // if(validIndex(index)){
           // String filename = files.get(index);
           // System.out.println(filename);
            
            // }
    
    
    
    }
    
    public void removeIndex(int index){

           if(validIndex(index))
           {
               files.remove(index);
            }
        
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    public void listAllFiles(){
        int position = 0;
        for(String filename : files)
        {
            System.out.println(position + ":" + filename);
            position++;
        }
    }

    public void listMatching(String searchString){ 
        boolean notMatched = true;
        for(String filename: files)
        {
            if(filename.contains(searchString)){
                System.out.println(filename);
                notMatched =  false;
            }
            if(notMatched) {
                System.out.println("No files matched: " +
                    searchString);
            }
        }

    }

    public void playSamplesBy(String artist)
    {
        int position = 0;

        for(String filename : files) {
            if(filename.contains(artist)) {
                System.out.println(position);
            }
            position++;
        }
    }
}

