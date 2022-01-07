package legendOfJava;

public class Orc extends Monster {
	
	// Orcs are big, strong but dumb creatures. 
	// They can be confused e miss their attacks or they can be enraged and do a lot of damage.
	// Be careful

	public Orc(int lv) {
		setName("Orc");
		setLevel(lv);
		setMinDamage(getLevel() * 0);
		setMaxDamage(getLevel() * 12);
		setHealth(50 * lv);
		setExpGiven(500 * lv);
	}
	
	public void attack(GameController Thing) {
		
	}


}
