import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *  Mini-Lab: Class Implementation & ArrayList Loops<br>
 *  To create instance variables, constructor, and various "getter" methods.
 *
 *  A more detailed description goes here, if necessary.
 *  <br> <br>
 *  Created: <br>
 *     23 April 2018, Maria Katrantzi<br>
 *     With assistance from: TA, Professor Cutter<br>
 *  Modifications: <br>
 *      25 April 2018, Maria Katrantzi, to add a method<br>
 *
 *  @author Maria Katrantzi [with assistance from TA]
 *  @version 25 April 2018
 */
public class Olympics
{
    // State: instance variables
    private ArrayList<Swimmer> mylist;         

    // Constructors
    /**
     * Constructs a new object of this class.
     * 
     */
    public Olympics()
    {
        // initialise instance variables
        this.mylist = new ArrayList<Swimmer>();
    }

    // Methods
    /**
     * Adds an object from the Swimmmer Class to list.
     * 
     *      @param object of class Swimmer
     */
    public void add(Swimmer sw)
    {
        this.mylist.add(sw);
    }

    /**
     * Prints all Swimmer items.
     *      
     */
    public void printAll()
    {
        for(Swimmer sw: mylist)
        {
            System.out.println(sw);    
        }
    }

    /**
     * Returns the average Finish Time of all Swimmers.
     *
     *      @return average Finish Time of all Swimmers
     */
    public double getAvgFinishTime()
    {
        double sum=0.0;
        double avg=0.0;

        for(Swimmer sw: mylist)
        {
            sum += sw.getFinishTime();
        }
        avg = sum/mylist.size();
        return avg;
    }

    /**
     * Returns the team of a given Swimmer or a string 
     * if the Swimmer item is not identified.
     * 
     *      @return the team of a given Swimmer or a string 
     *      if the Swimmer item is not identified
     */
    public String getSwimmerTeam(String swimmername)
    {
        for(Swimmer sw: mylist)
        {
            if(sw.getAthleteName().equals(swimmername))
                return sw.getTeam();
        }
        return "cannot be found";
    }

    /**
     *  Returns a list with the full record of the Swimmers with
     *  the same finish time.
     * 
     *      @return a list with the full record of the Swimmers with
     *      the same finish time
     */
    public ArrayList<String> swimmersWithTheSameFinishTime(int finishtime)
    {
        ArrayList<String> sametime = new ArrayList<String>();

        for ( Swimmer sw : mylist )
        {
            if ( sw.getFinishTime() == finishtime)
                sametime.add(sw.toString());
        }
        return sametime;
    }

    /**
     * Returns the smallest finish time among the Swimmer items.
     * 
     *      @return the smallest finish time among the Swimmer items
     */
    public int getSmallestFinishTime()
    {
        if ( mylist.isEmpty() )
            return 0;

        int smallestFinishTime = mylist.get(0).getFinishTime();

        for ( Swimmer sw : mylist )
        {
            if ( sw.getFinishTime() < smallestFinishTime )
                smallestFinishTime = sw.getFinishTime();
        }  return smallestFinishTime;
    }
}