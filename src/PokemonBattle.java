/****
 * Grading comments - No worries.
 *  Nailed it. Perfect.  25/25
 */

//Sorry for the problems! Turns out I submitted a really old early version
//so it's no wonder I was so confused how I could've done so terribly XD
//Theoretically this is the current one, hopefully it's better than the last!

/* 
 MAIN
 	set variable pokemon to battleStart
 	set variable HP to damage(pokemon)
 	call statsTable(variable 1, variable 2)
 	
 BATTLESTART
 	write the greetings
 	user input for pokemon name
 	lines with pokemon name used
 	return the pokemon name as a variable in main
 	
 DAMAGE
 	take pokemon parameter
 	ask user for stats
 	create separate method for damage calculation
 	return damage value to damage()
 	print out damage and HP values
 	return HP to main
 	
 STATSTABLE
 	list HP and pokemon name from the parameters
 	list the others as from the stats table
*/

import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		//calls three methods, not including actualDamage()
		String pokemon = battleStart();
		int HP = damage(pokemon);
		tableStats(pokemon, HP);
	}
	
	public static String battleStart() {
		Scanner console = new Scanner(System.in);
		
		//introduction
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println();
		System.out.println("Zebstrika appeared.");
		System.out.println();
		
		//user input to receive pokemon name
		System.out.print("Which Pokemon do you choose? ");
		String pokemon = console.next();
		System.out.println();
		
		System.out.println("You chose " + pokemon + "!");
		System.out.println();
		
		System.out.println("It's a Pokemon battle between " + pokemon + " and Zebstrika! Go!");
		
		//return pokemon name to main
		return pokemon;
	}
	
	public static int damage(String pokemon) {
		Scanner console = new Scanner(System.in);
		
		System.out.println();
		System.out.println();
		System.out.println("Zebstrika used Thunderbolt!");
		System.out.println();
		System.out.println("Trainer, what are your " + pokemon + "'s stats?");
		
		//user input
		System.out.print("Level: ");
		int level = console.nextInt();
		
		System.out.print("Attack: ");
		int attack = console.nextInt();
		
		System.out.print("Defense: ");
		int defense = console.nextInt();
		
		System.out.print("Base: ");
		int base = console.nextInt();
		
		System.out.print("STAB: ");
		int STAB = console.nextInt();
		
		System.out.print("HP: ");
		int HP = console.nextInt();
		System.out.println();
		
		int damageValue = actualDamage(level, attack, defense, base, STAB, HP);
		
		System.out.println(pokemon + " sustained 10 points damage.");
		System.out.println("HP, after damage, are now 70.");
		
		//assuming HP is the same as damage 
		int realHP = HP - damageValue;
		
		return realHP;
	}
	
	public static void tableStats(String pokemon, int HP) {
		//final statistics table with predetermined information
		
		System.out.println();
		System.out.println();
		
		System.out.println("Name    " + pokemon);
		System.out.println("Level   70");
		System.out.println();
		
		System.out.println("--------------------------------");
		System.out.println();
		System.out.println("HP        " + HP);
		System.out.println("Attack    76");
		System.out.println("Defense   51");
		System.out.println("SP. ATK   121");
		System.out.println("SP. DEF   81");
		System.out.println("Speed     107");
		System.out.println();
		System.out.println("--------------------------------");
		
	} 
	
	public static int actualDamage(int level, int attack, int defense, int base, int STAB, int HP) {
		//split it into several parts to make it more readable
		double damage1 = (2 * level + 10) / 250;
		double damage2 = (attack / defense) * base + 2;
		
		double modifier = 0.85 + (Math.random() * 0.25);
		
		double damageValue = (damage1 + damage2) * modifier;
		
		//returning to damage()
		return (int) damageValue;
	}
}

