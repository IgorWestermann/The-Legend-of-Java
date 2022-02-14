package legendOfJava;

public abstract class GameMaster {

	private String name;
	
	private int health; 
    private int dex; 	 
    private int str; 	 
    private int level; 	 
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }

    
    private int exp; 
    
    
    public int getHealth() { 
        return health; 
    } 
    public void setHealth(int health) { 
        this.health = health; 
    } 
    
    
    public int getDex() { 
        return dex; 
    } 
    public void setDex(int dex) { 
        this.dex = dex; 
    } 
    
    
    public int getStr() { 
        return str; 
    }       
    public void setStr(int str) { 
        this.str = str; 
    } 
      
    
    public int getMonsterExp() { 
        return exp; 
    } 
    public void setMonsterExp(int expGiven) { 
        this.exp = expGiven; 
    } 
    
  
    public int getLevel() { 
        return level; 
    }   
    public void setLevel(int level) { 
        this.level = level; 
    } 
    
    
}
