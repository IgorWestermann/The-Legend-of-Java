package legendOfJava;

public class Ranger extends Character {

	public Ranger() {
		this.setHealthStats(3);		// Health 
        this.setDex(5);				// Dexterity 
        this.setMagic(1); 			// Intelligence 
        this.setStr(2); 			// Strength 
        this.setHealth(this.getHealthStats() * 10); // HP 
	}
	
	public void lvUp() {}
	
	public void basicAttack(GameController Thing) {}
	
	public void specialAttack(GameController Thing) {}
	
	
	

}
