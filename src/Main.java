import Character.PlayerCreator;
import Story.Chapters.Chapter1;
import Story.Chapters.Chapter2;
import Story.Introduction;
import Character.Player;
public class Main {
    public static void main(String[] args) {
        Player player = Introduction.prologue();
        Chapter1.flowCh_1(player);  // testing
        Chapter2.flowCh_2(); // testing
    }
}
