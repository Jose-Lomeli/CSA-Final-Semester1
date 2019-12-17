import java.util.*;
public class Ending implements Comparable<Ending>
{
    private int stars = 0;
    private int starsNeeded = 4;

    public Ending() {
        this.stars = stars;
        this.starsNeeded = starsNeeded;

    }//end public ending

    public Ending(int newStars, int newStarsNeeded)
    {
        stars = newStars;
        starsNeeded = newStarsNeeded;
    }// end public ending

    public int getStars()
    {
        return stars;
    }// end get stars

    public String toString()
    {
        String output = "";
        output += "you made: " + stars + "moves";
        output += "you needed" + starsNeeded + "moves to beat the game the quickest";
        return output;
    }// end toString

    @Override
    public int compareTo(Ending stars)
    {
        if(this.stars == starsNeeded)
        {
            return -1;
        }//end if
        else
        {
            return  1;
        }//end else
    }// end compare to
}//end public class endding
