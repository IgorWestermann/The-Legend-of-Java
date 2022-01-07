package legendOfJava;

public class Warrior extends Character {

	public Warrior() {
		this.setHealthStats(3);		// Health 
        this.setDex(2);				// Dexterity 
        this.setMagic(1); 			// Intelligence 
        this.setStr(5); 			// Strength 
        this.setHealth(this.getHealthStats() * 10); // HP 
	}
	
	public void lvUp() {}
	
	public void basicAttack(GameController Thing) {}
	
	public void specialAttack(GameController Thing) {}
	
	
	
}
