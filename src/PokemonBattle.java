/***
 * Grading Comments:  16/25
 *  Well, it's obviously not finished.   I know you guys
 * were dealing with AP Bio tests and you are not alone in not finishing.
 *   I will regrade again Monday evening but for now I'll grade as-is.
 *  RUBRIC Unit 3 = 25 pts
 * 10 pts - Correct Output (must compile and run)   5/10
 * 5 pts - Proper Use of Scanner, and decent User Interface 4/5  You have an extra unused scanner in damage.
 * 3 pts - Proper Use of Return     2/3 - you need one for asked() to get back hp.
 * 3 pts - Proper User of Parameter   3/3
 * 2 pts - Pseudocode and comments    0/2
 * 2 pts - Consistent Layout and Style following Style Guidelines  2/2
 */
import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		String pokemon = battleStart();
		damage(pokemon);
		//tableStats();
	}
	
	public static String battleStart() {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println();
		System.out.println("Zebstrika appeared.");
		System.out.println();
		System.out.print("Which Pokemon do you choose? ");
		String pokemon = console.next();
		System.out.println();
		System.out.println("You chose " + pokemon + "!");
		System.out.println();
		System.out.println("It's a Pokemon battle between " + pokemon + " and Zebstrika! Go!");
		
		return pokemon;
	}
	
	public static void damage(String pokemon) {
		Scanner input = new Scanner(System.in);
		System.out.println();
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println();
		System.out.println("Trainer, what are your " + pokemon + "'s stats?");
		asked(pokemon);
		
		int damageParantheses = (2 * level + 10) / 250) + (attack / defense) * base + 2;
		int modifier = Random * STAB;
		
		int newDamage = damageParantheses * modifier;
	}
	
	//public static void tableStats() {
		
	//}
	
	public static void asked(String pokemon) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Level: ");
		int level = input.nextInt();
		
		System.out.print("Attack: ");
		int attack = input.nextInt();
		
		System.out.print("Defense: ");
		int defense = input.nextInt();
		
		System.out.print("Base: ");
		int base = input.nextInt();
		
		System.out.print("STAB: ");
		int STAB = input.nextInt();
		
		System.out.print("HP: ");
		int HP = input.nextInt();
		System.out.println();
		
		System.out.println(pokemon + " sustained 10 points damage.");
		System.out.println("HP, after damage, are now 70.");
	}
}
