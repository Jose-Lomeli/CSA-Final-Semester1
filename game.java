public class game
{
    private String plot;

    public game()
    {
        this.plot = plot;
    }//adn game

    public game(String newPlot)
    {
        plot = newPlot;
    }//end game

    public String getPlot()
    {
        return plot;
    }// end getplot

    public void setPlot(String newSetPlot)
    {
        plot = newSetPlot;
    }//end set plot

    public String toString()
    {
        String output = "";
        output += " " + plot;
        return output;
    }// end toString

}
