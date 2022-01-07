package legendOfJava;

public class Dragon extends Monster {
	
	// Dragons are mithical creatures.
	// Stay away from dragons or your journey can me over in a blink.

	public Dragon(int lv) {
		setName("Dragon");
		setLevel(lv);
		setMinDamage(getLevel() * 100);
		setMaxDamage(getLevel() * 250);
		setHealth(1000 * lv);
		setExpGiven(100000 * lv);
	}
	
	public void attack(GameController Thing) {
		
	}


}
