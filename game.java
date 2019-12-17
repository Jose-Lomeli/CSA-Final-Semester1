public class game {
    private String plot;

    public game() {
        this.plot = plot;

    }

    public game(String newPlot) {
        plot = newPlot;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String newSetPlot) {
        plot = newSetPlot;
    }


    public String toString()
    {
        String output = "";
        output += " " + plot;


        return output;
    }// end toString

}
