package Story.Chapters;
import java.util.Scanner;
import Character.Player;
public class Chapter1 {
    public static void flowCh_1(Player player){
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("                    ╔════════════════════════════════╗");
        System.out.println("                    ║            CHAPTER 1           ║");
        System.out.println("                    ║      THE THRESHOLD AWAITS      ║");
        System.out.println("                    ╚════════════════════════════════╝");
        System.out.println("You wake fully aware now, guided by a small, shadowy figure that appeared from the mist. Its eyes measure you in moments.");
        System.out.println("“Follow me,” it says. “The forest is not safe for strangers.”");
        System.out.println();
        System.out.println("Every step brings new tension. Shapes flit in the corner of your vision.");
        System.out.println("Sounds echo in unexpected ways. Your heart beats faster,");
        System.out.println("but a strange clarity settles in — the story has begun, and you are at its center.");
        System.out.print("\n[Press Enter to continue...]");
        sc.nextLine();
        System.out.println("              ╔═══════════════ PLAYER INFO ═══════════════╗");
        System.out.println("              ║ Name: " + player.getName() + "                               ║");
        System.out.println("              ║ Level: " + player.getLevel() + "                                  ║");
        System.out.println("              ║ Class: Mage                               ║");
        System.out.println("              ╠═══════════════════════════════════════════╣");
        System.out.println("              ║ STATS:                                    ║");
        System.out.println("              ║   HP:          120                        ║");
        System.out.println("              ║   Mana:        50                         ║");
        System.out.println("              ╠═════════════ WEAPON EQUIPPED ═════════════╣");
        System.out.println("              ║ Weapon: Wizard Stick                      ║");
        System.out.println("              ╚═══════════════════════════════════════════╝");

        System.out.println("The shadow stir in the distance... Are you ready to step forward, " + player.getName() +"?");
        System.out.print("[Press ENTER to continue your journey]");
        sc.nextLine();
    }
}
