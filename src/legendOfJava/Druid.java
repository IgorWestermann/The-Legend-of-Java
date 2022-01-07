package legendOfJava;

public class Druid extends Character {

	public Druid() {
		this.setHealthStats(6);		// Health 
        this.setDex(2);				// Dexterity 
        this.setMagic(2); 			// Intelligence 
        this.setStr(2); 			// Strength 
        this.setHealth(this.getHealthStats() * 10); // HP 
	}
	
	public void lvUp() {}
	
	public void basicAttack(GameController Thing) {}
	
	public void specialAttack(GameController Thing) {}
	
	
	

}
