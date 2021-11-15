import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;

/**
 * Monitor counts of different types of animal.
 * Sightings are recorded by spotters.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29 (imperative)
 */
public class AnimalMonitor 
{
    // Records of all the sightings of animals.
    private ArrayList<Sighting> sightings;

    /**
     * Create an AnimalMonitor.
     */
    public AnimalMonitor()
    {
        this.sightings = new ArrayList<>();
    }

    /**
     * Add the sightings recorded in the given filename to the current list.
     * @param filename A CSV file of Sighting records.
     */
    public void addSightings(String filename)
    {
        SightingReader reader = new SightingReader();
        sightings.addAll(reader.getSightings(filename));
     }
    
    public int animalCount(String animal)
     {
        return sightings.stream()
                                .filter(s -> animal.equals(s.getAnimal()))
                                .map(s -> s.getCount())
                                .max(Integer :: compare).get();
                               
      }
    
    public Optional<Sighting> resulted( int spotterID, String animal){
        return sightings.stream()
                         .filter(s -> animal.equals(s.getAnimal()))
                         .filter(s -> s.getSpotter() == spotterID)
                         .findFirst();
    
    }
    
    /**
     * Print details of all the sightings.
     */
    public void printList()
    {
        for(Sighting record : sightings) {
            System.out.println(record.getDetails());
        }
    }
    //alternative way
    public void printList3()
    {
        sightings.forEach(
            (Sighting record) -> 
            {
                System.out.println(record.getDetails());
            }
        );
    }

    //anternative way
    public void newPrintList(){
        //sightings.forEach( record -> System.out.println(record.getDetails()));
        sightings.forEach( x -> System.out.println(x.getDetails()));
    }

    /**
     * Print the details of all the sightings of the given animal.
     * @param animal The type of animal.
     */
    public void printSightingsOf(String animal)
    {
        sightings.stream()
        .filter(s -> animal.equals(s.getAnimal()))
        .forEach(k -> System.out.println(k.getDetails()));

    }
  
    
    public void printSightingsOnParticularDay(int dayID, String animal){
        sightings.stream()
        .filter(s -> animal.equals(s.getAnimal()))
        .filter(s -> dayID == s.getPeriod())
        .forEach(s -> System.out.println(s.getDetails()));

    }
    public void ParticularDay(int dayID){
        sightings.stream()
        .filter(s -> dayID == s.getPeriod())
        .forEach(s -> System.out.println(s.getDetails()));

    }
    
    
    
    public void printSightingsOfNotNeeded(String animal)
    {

        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                System.out.println(record.getDetails());
            }
        }
    }

    public void printAllCounts(String animal){
        sightings.stream()
        .filter( k -> animal.equals(k.getAnimal()))
        .map(sighting -> sighting.getCount())
        .forEach(s -> System.out.println(s));

    }
    
    public void printCounts(String animal)
    {
        sightings.stream()
                         .filter(s -> animal.equals(s.getAnimal()))
                         .map(k -> k.getCount())
                         .forEach(m -> System.out.println(m));
    
    }
    
    /**
     * Print all the sightings by the given spotter.
     * @param spotter The ID of the spotter.
     */
    public void printSightingsBy(int spotter)
    {
        sightings.stream()
        .filter(s -> s.getSpotter() == spotter)
        .map(sighting -> sighting.getDetails())
        .forEach( s -> System.out.println(s));
        //for(Sighting record : sightings) {
        //if(record.getSpotter() == spotter) {
        //System.out.println(record.getDetails()); }

    }
    /**
     * Print a list of the types of animal considered to be endangered.
     * @param animalNames A list of animals names.
     * @param dangerThreshold Counts less-than or equal-to to this level
     *                        are considered to be dangerous.
     */
    public void printEndangered(int dangerThreshold)
    {
        sightings.stream()
        .filter(s -> dangerThreshold >= s.getCount())
        .map(s -> s.getAnimal())
        .forEach(s -> System.out.println(s));

    }

    /**
     * Return a count of the number of sightings of the given animal.
     * @param animal The type of animal.
     * @return The count of sightings of the given animal.
     */
    public int getCount(String animal)
    {
        return sightings.stream()
        .filter(s -> animal.equals(s.getAnimal()))
        .map( s -> s.getCount())
        .reduce( 0, (total, count) -> total + count);

    }
    
    public void removeSpotttters( int spotterID)
    {
        sightings.removeIf( s -> s.getSpotter() == spotterID );
    }
    
    /**
     * Remove from the sightings list all of those records with
     * a count of zero.
     */
    public void removeZeroCounts()
    {
        sightings.removeIf(sighting -> sighting.getCount() == 0);

    }

    public int particularDaySighting(String animal, int spotterID, int dayID){
        return sightings.stream()
        .filter(s -> animal.equals(s.getAnimal()))
        .filter(s -> spotterID == s.getSpotter())
        .filter(s -> dayID == s.getPeriod())
        .map(s -> s.getCount())
        .reduce(0, (total,count) -> total + count);

    }

    public void removeSpotter(int spotterID){
        sightings.removeIf(sighting -> spotterID == sighting.getSpotter());

    }
    
    
    /**
     * Return a list of all sightings of the given type of animal
     * in a particular area.
     * @param animal The type of animal.
     * @param area The ID of the area.
     * @return A list of sightings.
     */
    public ArrayList<Sighting> getSightingsInArea(String animal, int area)
    {
        ArrayList<Sighting> records = new ArrayList<>();
        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                if(record.getArea() == area) {
                    records.add(record);
                }
            }
        }
        return records;
    }

    public long spotter(int spotterID){
        return sightings.stream()
        .filter( s -> spotterID == s.getSpotter())
        .count();

    }

    public int max( String animal){

        return sightings.stream()
        .filter(s-> animal.equals(s.getAnimal()))
        .map(s-> s.getCount())
        .max(Integer :: compare)
        .get();

    }

    public Optional<Sighting> first(String animal, int spotterID){
        return sightings.stream()
        .filter(s-> animal.equals(s.getAnimal()))
        .filter(s -> spotterID == s.getSpotter())
        .findFirst();

    }

/**
     * Return a list of all the sightings of the given animal.
     * @param animal The type of animal.
     * @return A list of all sightings of the given animal.
     */
    public ArrayList<Sighting> getSightingsOf(String animal)
    {
        ArrayList<Sighting> filtered = new ArrayList<>();
        for(Sighting record : sightings) {
            if(animal.equals(record.getAnimal())) {
                filtered.add(record);
            }
        }
        return filtered;
    }

}
