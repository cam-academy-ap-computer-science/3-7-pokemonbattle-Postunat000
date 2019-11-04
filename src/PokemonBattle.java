import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		battleStart();
		damage();
		tableStats();
	}
	
	public static String battleStart() {
		Scanner console = new Scanner(System.in);
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		System.out.print("Which Pokemon do you choose? ");
		String arcanine = console.next();
		System.out.println("You chose " + arcanine + "!");
		System.out.println("It's a Pokemon battle between " + arcanine + " and Zebstrika! Go!");
		
		return arcanine;
	}
	
	public static void damage() {
		
	}
	
	public static void tableStats() {
		
	}
}
