package legendOfJava;

public class Troll extends Monster {
	
	// Trolls are big, strong and evil creatures. 
	// They can hit realy hard. Be careful

	public Troll(int lv) {
		setName("Troll");
		setLevel(lv);
		setMinDamage(getLevel() * 14);
		setMaxDamage(getLevel() * 26);
		setHealth(200 * lv);
		setExpGiven(2000 * lv);
	}
	
	public void attack(GameController Thing) {
		
	}


}
