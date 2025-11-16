package Character;
import java.util.Scanner;
import java.util.*;

public class PlayerCreator {
    public static Player createPlayer(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your in-game name: ");
        String name = sc.nextLine();

        Player player = new Player(name, 100, 1);
        System.out.println("Welcome " + name + "!" +" Your adventure begins now.\n");
        System.out.println("[ YOUR STARTING PLAYER CARD ]");
        System.out.println("------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Level: 1");
        System.out.println("Health: 100");
        System.out.println("------------------------------------");
        return player;
    };

}
