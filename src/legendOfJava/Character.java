package legendOfJava;

public abstract class Character extends GameController {

	private int healthStats; 	// Points of health in the attributes
    private int exp = 0; 
    private int expPoints = 0;
    
    
    public abstract void lvUp( ); // Method witch will be used when the character level's up 
    
    public abstract void basicAttack( GameController Thing ); // Method to define the basic attacks from our classes
    
    public abstract void specialAttack( GameController Thing); // Method to define the special attacks from our classes
    
    
    //Getters and setters  
  
    public int getExp() { 
        return exp; 
    } 
  
    public void setExp(int exp) { 
        this.exp = exp; 
    } 
      
    public int getExpPoints() { 
        return expPoints; 
    } 
    
    public void setExpPoints(int expPoints) { 
        this.expPoints = expPoints; 
    } 

    public int getHealthStats() { 
        return healthStats; 
    } 
  
    public void setHealthStats(int healthStats) { 
        this.healthStats = healthStats; 
    } 
}
