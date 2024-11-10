/*
 * LOST ARK CHARACTER CREATION : Creates characters for the hit game Lost Ark
 * 
 * @author Corbin Riemenschenider cgriemenschneider@gmail.com
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {

        //TEST
        System.out.println(new Assassin());

        //System.out.println(new Warrior());

        Character Deathblade = new Assassin("Corbin", 1640, 10);
        System.out.println(Deathblade);
        Deathblade.warCry();
        Deathblade.catchPhrase();
        Deathblade.featuredAbility();
        //implement user input, and helper array for class selection as an inner class.

        //Character Destroyer = new Warrior("Chris", 1640, 100000);
        //System.out.println(Destroyer);
        //Destroyer.warCry();
        //Destroyer.catchPhrase();
        //Destroyer.featuredAbility();

        System.out.println();
        Character Shadowhunter = new Assassin();
        System.out.println(Shadowhunter);



    }
}
