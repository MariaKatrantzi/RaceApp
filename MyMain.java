import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *  Mini-Lab: Class Implementation & ArrayList Loops<br>
 *  The RaceApp class provides a main method
 *  for a program that constructs objects
 *  from various classes. 
 *
 *  A more detailed description goes here, if necessary.
 *  <br> <br>
 *  Created: <br>
 *    20 April 2018, Maria Katrantzi<br>
 *    With assistance from: TA, Professor Cutter<br>
 *  Modifications: <br>
 *     23 April 2018, Maria Katrantzi, to create objects
 *     and print out specific statements<br>
 *     25 April 2018, Maria Katrantzi, to create objects
 *     and print out specific statements<br>
 *     
 *  @author Maria Katrantzi [with assistance from TA, Professor Cutter]
 *  @version 25 April 2018
 */
public class MyMain
{
    /**
     *  The main function initiates execution of this program.
     *    @param    String[] args not used in this program
     **/
    public static void main(String[] args)
    {
        System.out.println ("Welcome to Programming Project RaceApp.");

        //Construct four instances from the Swimmer class.
        Swimmer athlete1= new Swimmer(121314,"John","PAOK",3);
        Swimmer athlete2= new Swimmer(151617,"Lydia","HPA",4);
        Swimmer athlete3= new Swimmer(181920,"Kate","ARHS",3);
        Swimmer athlete4= new Swimmer(212223,"Vanessa","OLYMPIAKOS",2);

        //Print out values of the Swimmer items.
        System.out.println ();
        System.out.println (athlete1);
        System.out.println (athlete2);
        System.out.println (athlete3);
        System.out.println (athlete4);
        System.out.println ();

        //Construct an object of Olympics Class and add Swimmer
        //items to the collection.
        Olympics ol=new Olympics();
        ol.add(athlete1);
        ol.add(athlete2);
        ol.add(athlete3);
        ol.add(athlete4);

        //Call method to print all Swimmer items.
        ol.printAll();
        System.out.println ();

        //Call method find the average finish time for the
        //Swimmers.
        double averagetime=ol.getAvgFinishTime();
        System.out.println(averagetime);
        System.out.println ();

        //Call method to find the team of a Swimmer.
        String theteam=ol.getSwimmerTeam("Lydia");
        System.out.println(theteam);
        System.out.println ();

        //Call method to find the Swimmers that completed the
        //race within three minutes.
        ArrayList<String> athletesametime= ol.swimmersWithTheSameFinishTime(3);
        System.out.println(athletesametime);
        System.out.println ();

        //Call method to find the smallest
        //finish time among Swimmer items.
        int minfinishtime=ol.getSmallestFinishTime();
        System.out.println(minfinishtime);
        System.out.println ();       

        System.out.println ("Program done.");

    }//end main

}//end class
