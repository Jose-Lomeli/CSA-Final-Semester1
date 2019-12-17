import java.util.*;
public class Ending implements Comparable<Ending> {
    //either set the stars to 4 or 5 her or set them in the end

    private int stars = 0;
    private int starsNeeded = 4;

    public Ending() {
        this.stars = stars;
        this.starsNeeded = starsNeeded;

    }

    public Ending(int newStars, int newStarsNeeded) {
        stars = newStars;
        starsNeeded = newStarsNeeded;
    }

    public int getStars() {
        return stars;
        //return starsNeeded;
    }

    public String toString() {
        String output = "";
        output += "you made: " + stars + "moves";
        output += "you needed" + starsNeeded + "moves to beat the game the quickest";
        return output;
    }// end toString

//    public void setStars(int newSetStars) {
//        stars = newSetStars;
//    }
//}

    @Override
    public int compareTo(Ending stars)
    {
        if(this.stars == starsNeeded)
        {
            return -1;
        }
        else
        {
            return  1;
        }
    }
///public class NewKeywordExample
//{
//    String name = "GeeksForGeeks";
//    public static void main(String[] args)
//    {
//        // Here we are creating Object of
//        // NewKeywordExample using new keyword
//        NewKeywordExample obj = new NewKeywordExample();
//        System.out.println(obj.name);
//    }
//}
}
