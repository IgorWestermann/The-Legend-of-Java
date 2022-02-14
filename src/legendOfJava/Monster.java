package legendOfJava;

public abstract class Monster extends GameMaster {

	private int maxDamage;
	private int minDamage; 	
	
	public abstract void attack(GameMaster Thing);
	

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
