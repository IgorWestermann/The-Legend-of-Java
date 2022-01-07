package legendOfJava;

public abstract class Monster extends GameController {

	private int maxDamage;  // The maximum to hit in an attack
	private int minDamage; 	// The minimum to hit in an attack
	
	public abstract void attack(GameController Thing);
	
	//GETTERS AND SETTERS
	public int getMinDamage() 
	{
		return minDamage;
	}
	public void setMinDamage(int minDamage) 
	{
		this.minDamage = minDamage;
	}
	public int getMaxDamage() 
	{
		return maxDamage;
	}
	public void setMaxDamage(int maxDamage) 
	{
		this.maxDamage = maxDamage;
	}
}
