package legendOfJava;

public class Mage extends Character {

	public Mage() {
		this.setHealthStats(3);		// Health 
        this.setDex(1);				// Dexterity 
        this.setMagic(5); 			// Intelligence 
        this.setStr(2); 			// Strength 
        this.setHealth(this.getHealthStats() * 10); // HP 
	}
	
	public void lvUp() {}
	
	public void basicAttack(GameController Thing) {}
	
	public void specialAttack(GameController Thing) {}
	
	
	

}
