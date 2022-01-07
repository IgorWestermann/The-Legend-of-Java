package legendOfJava;

public class Goblin extends Monster {
	
	// Goblins are small and weak creatures. 
	// Easy to kill 

	public Goblin(int lv) {
		setName("Goblin");
		setLevel(lv);
		setMinDamage(getLevel());
		setMaxDamage(getLevel() * 2);
		setHealth(10 * lv);
		setExpGiven(100 * lv);
	}
	
	public void attack(GameController Thing) {
		
	}

}
