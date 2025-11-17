package Character;
import java.util.Scanner;
import java.util.*;

public class PlayerCreator {
    /* this class is not a Player, helper class rani, "1 booth/ tool";
    A place where you put methods that help create a Player */
    public static Player createPlayer(){
        // a method inside the playerCreator that builds a Player
        //static bcs PlayerCreator has no data, use the method without creating an object
        // creates player obj, asks the name, sets the level, hp
        Scanner sc = new Scanner(System.in);
        String name = ""; // needed for while loop, has an initial value


        while(name.length() != 5) { // n
            System.out.print("Enter your in-game name (exactly 5 characters): ");
            name = sc.nextLine();
                if(name.length() != 5){ // still valid
                    System.out.println("\nInvalid! Your name must be exactly 5 characters.");
                }
        }
        Player player = new Player(name, 120, 1, 50);
        return player;
    };

}
