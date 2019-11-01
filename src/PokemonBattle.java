import java.util.*;
public class PokemonBattle {

	public static void main(String[] args) {
		String pokemonInput = tableStats();
		
		battleStart();
		//damage();
		tableStats();

	}
	public static String battleStart() {
		Scanner pokemon = new Scanner(System.in);
		
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Zebstrika appeared.");
		
		System.out.print("Which pokemon do you choose?" + pokemon);
		System.out.println();
		System.out.print("You chose " + pokemon + "!");
		System.out.println();
		
		System.out.print("It's a pokemon battle between " + pokemon + " and Zebstrika! Go!");
		return pokemon;
	}
	
	//public static void damage() {
		
	//}
	public static String tableStats(String pokemonInput) {
		System.out.println("Name	" + pokemonInput);
	}
}
