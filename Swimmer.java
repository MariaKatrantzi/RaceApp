import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *  Mini-Lab : Class Implementation & ArrayList Loops<br>
 *  To create instance variables, constructor, and various "getter" methods.
 *
 *  A more detailed description goes here, if necessary.
 *  <br> <br>
 *  Created: <br>
 *     20 April 2018, Maria Katrantzi<br>
 *     With assistance from: TA, Professor Cutter<br>
 *  Modifications: <br>
 *
 *  @author Maria Katrantzi [with assistance from TA, Professor Cutter]
 *  @version 20 April 2018
 */
public class Swimmer
{
    // State: instance variables
    private int id;
    private String name;
    private String category;
    private int numericComparator;

    // Constructors
    /**
     * Constructs a new object of this class.
     * 
     *      @param   racenumber     the race number of the swimmer 
     *      @param   athletename    the name of the swimmer 
     *      @param   team           the team of the swimmer 
     *      @param   finishtime     the finish time of the swimmer 
     *
     */
    public Swimmer(int racenumber,String athletename,String team, int finishtime)
    {
        // initialise instance variables
        this.id = racenumber;
        this.name = athletename;
        this.category = team;
        this.numericComparator = finishtime;

    }

    // Methods
    /**
     * Returns the race number of the swimmer.
     * 
     *      @return race number of the swimmer
     */
    public int getRaceNumber()
    {
        return this.id;
    }

    /**
     * Returns the name of the swimmer.
     * 
     *      @return the name of the swimmer
     */
    public String getAthleteName()
    {
        return this.name;
    }

    /**
     * Returns the name of the team that the swimmer is member of.
     * 
     *      @return the team of the swimmer
     */
    public String getTeam()
    {
        return this.category;
    }

    /**
     * Returns the time that the swimmer needed to finish the race.
     * 
     *      @return the finish time of the swimmer
     */
    public int getFinishTime()
    {
        return this.numericComparator;
    }

    /**
     * Returns the race number, name, team, and finish time of the swimmer.
     * 
     *      @return the race number, name, team, and finish time of the swimmer
     */
    public String toString()
    {
        return "(" + this.id + ": " + this.name + ", " + this.category + ", " + 
        this.numericComparator + ")";
    }

}
