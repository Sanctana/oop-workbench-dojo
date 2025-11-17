package Story;
import Character.PlayerCreator;
import Character.Player;
import java.util.Scanner;

public class Introduction {
    public static Player prologue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n<<< THE SHADOWED REALM >>>> ");
        System.out.println("\nDarkness and mist. Cold air presses against your skin.");
        System.out.println("Somewhere ahead, a faint path winds between towering trees.");
        System.out.println("You feel disoriented; your mind foggy.");
        System.out.println("\nPress Enter to continue...");
        sc.nextLine();

        System.out.println("A voice breaks the silence:");
        System.out.println("| \"Wait… before you step further, you must tell me who you are.\"");

        Player player = PlayerCreator.createPlayer();
        /* PlayerCreator class will run the createPlayer and will return a Player.
        You can directly use the tool inside */
        System.out.println("\nThe forest seems to pause, as if listening. When you speak your name aloud, it feels heavier, more important. " +
                "\nThis is no ordinary journey — every choice from here on will carry your mark.");
        System.out.println("\nPress Enter to continue...");
        sc.nextLine();

        return player;

    }
}
