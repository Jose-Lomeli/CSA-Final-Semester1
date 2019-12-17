import java.util.*;
public class gameDriver
{
    public static void main(String[]args)
    {
        //-----------------------------these are all of hte plot and stars
        Ending someEnding = new Ending(4,4 );
        Ending stars11 = new Ending(4, 4);
        Ending starsNeeded = new Ending(4, 4);
        Ending stars9 = new Ending(5, 4);

        game instructions = new game("INSTRUCTIONS: In this game you have to try to survive the night at your grandfathers barn\n" +
                " to do this you will need it make the correct choices, which you can choose by entering\n the numbers 1 or 2");
        game plot1 = new game("The Begining: You have arrived at your grandfathers old abandoned farm, you get out of your car,\n its dark and you hear noises coming from the corn field, and your dog КЦVЭK begins to bark in the direction of the corn field.\n" +
                " --- DO YOU: (1) GO INTO THE CORN FIELD TO INVESTIGATE THE SOUND. " +
                "(2) IGNORE THE NOISES AND HEAD INSIDE THE HOUSE\",\n");
        game plot2 = new game("You decide to go investigate the noise coming from the cornfield. As you enter the cornfield you hear more rustling around you. \nAs you turn to head back, you see a pair of glowing eyes staring back at you\n and you then you feeling a sharp pain in your back.");
        game plot3 = new game("You have entered the house and decide to go to bed…. n (2 hours later...) \n you are awakened by the sound of glass shattering you look out of you broken window and see a shadow running towards the barn out back. DO YOU: (1) TRY TO GO BACK TO SLEEP. (2) GET OUT OF BED");
        game plot4 = new game("YOU TRY TO GEO BACK TO SLEEP, AND AS YOU ARE DRIFTING OFF YOU HEAR RATTLING AT THE DOOR AND HEAR THE DOOR CREEK OPEN.  DO YOU: (1) GET THE SHOTGUN THATS ON THE NIGHTSTAND AND FACE THE INTRUDER (2) GET THE AXE THATS ON THE WALL AND HIDE IN THE CLOSET");
        game plot5 = new game("you get out of bed and decide to head to the barn but beforehand you take the shotgun that's on your nightstand and load it with the only shell you found in the room. As you arrive at the barn you see a shadow DO YOU: (1) shoot and hope to hit him (2) run back to the house.");
        game plot6 = new game("you run to the closet and leave the door a bit open so that you can see what is going on in your room. You wait for a few minutes and see a big man with a Goaltender mask he looks around the room for a few seconds, turns to the window in your room and stands there. DO YOU: (1) GET OUT OF THE CLOSET AND ATTACK HIM. (2) REMAIN HIDDEN");
        game plot7 = new game("you go to to the living room and see the man with a machete you aim at him and shoot *click* ‘the gun wasn't loaded’ the man charges at you and shoots you");
        game plot8 = new game("YOU CHARGE OUT OF THE CLOSET AND HIT HIM IN THE BACK WITH YOUR AXE, BUT HE TURNS AROUND AND STABS YOU IN THE HEART \n (YOU DIED)");
        game plot9 = new game("you stay in the closet and after a few minutes the man leaves your room. You then hear  rustling in the cornfield you take advantage of this moment grab your keys, grab КЦVЭK, run out of the house, get in your car and drive away never to go back to that house...(YOU SURVIVED) but you see your dog dead on the curb.");
        game plot10 = new game("You run back to the house and as you arrive you hear a gunshot. You were shot in the back. yo u fall to the floor and the last thing you see is КЦVЭK running over to you whimpering.");
        game plot11 = new game("You shoot and hit him. the person falls to hte floor. you look at him for a few seconds, run back to the house, get КЦVЭK and drive away");
        //-----------------------------these are all of hte plot and stars


        //prints out the instructions and creates a scanner for user input
        System.out.println(instructions.getPlot());
        System.out.print(plot1.getPlot());
        System.out.println(" ");

        Scanner returned = new Scanner(System.in);
        System.out.println("choose (1 OR 2): ");
        int got  = returned.nextInt();
        //end


        //-----------(logic)if, else, and if else statements that take care of the user inputs and the choices that they make ()
        if(got == 1)
        {
            System.out.println(plot2);
            //you died

            int x = 0;
            while (x <= 3)
            {
                System.out.println("*STAB*");
                x++;
            }// end while
            System.out.println("You were stabbed " + x + " times in the back by Jason Voorhees");
        }//end of if got ==1
        //you died
        else if(got == 2)
        {
            System.out.println(plot3);
            got = 0;
            got = returned.nextInt();

            if(got == 1 )
            {
                System.out.println(plot4);
                got = returned.nextInt();
                if(got == 1)
                {
                    System.out.println(plot7);
                    for(int i = 0; i < 2; i++)
                    {
                        int one = 1;
                        int num;
                        Random generator = new Random();
                        num = generator.nextInt(2) + 1;
                        boolean boolone;
                        boolean booltwo;

                        if(num == 1 && one == 1)
                        {
                            boolone = true;
                        }// end if
                        if(num == 1 && one == 1)
                        {
                            booltwo = true;
                        }//end if
                    }//end for loop

                    System.out.println("(YOU DIED)");

                    //you died
                }//end of if got ==1
                else if( got == 2)
                {
                    System.out.println(plot6);
                    got = returned.nextInt();

                    if(got == 1)
                    {
                        System.out.println(plot8);
                        //you died
                    }//end of if
                    else if (got == 2)
                    {
                        //////------------------------compares teh amount of moves you made to the least amount of moves needed to win
                        System.out.println(plot9);

                        Scanner results2 = new Scanner (System.in);
                        System.out.println("Do you want to see your results");
                        String user2 = null;
                        user2 = results2.nextLine();

                        if(user2.equals("yes") || user2.equals("Yes"))
                        {
                            if (stars9.compareTo(starsNeeded) == 1)
                            {
                                System.out.println("Try to beat the game in less moves");
                            } //end of if. compareTo
                            else
                                {
                                System.out.println("Cograts you beat the game in the least amount of moves");
                            }//end of else
                        }//end of compare to
                        //you survived
                        ///---------------(end)---compares teh amount of moves you made to the least amount of moves needed to win
                    }//enf of else if got == 2
                } // end of else if got ==2

            }// end of if got == 1
            else if(got == 2 )
            {
                System.out.println(plot5);
                got = returned.nextInt();

                if(got == 1)
                {
                    //-------------------------------------------compares teh amount of moves you made to the least amount of moves needed to win
                    System.out.println(plot11);
                    Scanner results = new Scanner (System.in);
                    String user = null;
                    user = results.nextLine();
                    System.out.println("Do you want to see your results");
                    if(user.equals("yes") || user.equals("Yes"))
                    {
                        if(stars11.compareTo(starsNeeded) == -1)
                        {
                            System.out.println("Cograts you beat the game in the least amount of moves");
                        }// end of if.compareto
                        else
                        {
                            System.out.println("Try to beat the game in less moves");
                        }// end of else
                    }//enf of if user.equals
                    //-----------------(end)------------------compares teh amount of moves you made to the least amount of moves needed to win
                else
                    {
                        System.out.println("Be a good sport Play again");
                    }//enf og else
                    //you survived
                }//end of if got == 1
                else if( got == 2)
                {
                    System.out.println(plot10);
                    //you died
                }//end of else if
            }//end of else if got == 2
        }//end of else if got == 2
        //-----------(logic end)
        else
        {
            System.out.println("You didnt enter 1 or 2, so you died. CONRGRATS");
        }//end of else


        //gameChoices------------------------------------------------------------------------------
    }
}
