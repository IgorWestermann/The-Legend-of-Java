package legendOfJava;

public abstract class GameController {

	private String name;
	private int health; // Health
    private int dex; 	// Dexterity 
    private int str; 	// Strength 
    private int magic; 	// Magic = spellpower 
    private int level; 	// Level 
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	
    }

    
    private int exp; //experience given
    
    
    public int getHealth(){ 
        return health; 
    } 
    public void setHealth(int health) { 
        this.health = health; 
    } 
    
    
    // Dexterity getter and setter 
    public int getDex(){ 
        return dex; 
    } 
    public void setDex(int dex) { 
        this.dex = dex; 
    } 
    
    
    // Strength getter and setter
    public int getStr(){ 
        return str; 
    }       
    public void setStr(int str) { 
        this.str = str; 
    } 
    
    
    // Magic getter and setter
    public int getMagic(){ 
    	return magic; 
    }       
    public void setMagic(int magic) { 
    	this.magic = magic; 
    } 
    
    
    // Experince getter and setter   
    public int getExpGiven() { 
        return exp; 
    } 
    public void setExpGiven(int expGiven) { 
        this.exp = expGiven; 
    } 
    
    
    // Level getter and setter  
    public int getLevel() { 
        return level; 
    }   
    public void setLevel(int level) { 
        this.level = level; 
    } 
    
    
}
