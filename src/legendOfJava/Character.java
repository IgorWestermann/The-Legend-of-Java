package legendOfJava;

import java.util.Scanner;

public abstract class Character extends GameMaster {
 
    Scanner input = new Scanner(System.in); 
    int userInput; 
	
	private int healthStats; 	
	private int inte;
    private int exp = 0; 
    private int expPoints = 0;
    
    Weapon equippedWeapon;
    
    public abstract void battle(Monster enemy);
    
    public Character() { 
        this.setLevel(1); 
    }
    
    public abstract void lvUp();
    
    public abstract void basicAttack( GameMaster Thing );
    
    public abstract void specialAttack( GameMaster Thing); 
    
    
    public void chooseAtributes() {
    	
    	while(true) {
	        System.out.println("Vida: "); 
	        userInput = input.nextInt();
	        
	        if (userInput > this.getExpPoints() || userInput < 0 )
	        	if(userInput > 0)
	        		System.out.println("Você só tem"+ this.getExpPoints() + " pontos!");	
	        	else
	        		System.out.println("Não é permitido némeros negativos");
	        else {
	        	this.setHealthStats(this.getHealthStats() + userInput);
		        this.setHealth( this.getHealthStats() * 10 );
		        this.setExpPoints( this.getExpPoints() - userInput );
	        	break;
	        } 
        }
        
        while(true) {
	        System.out.println("Destreza: "); 
	        userInput = input.nextInt();
	        
	        if( userInput > this.getExpPoints() || userInput < 0 )
	        	if(userInput > 0)
	        		System.out.println("Você só tem"+ this.getExpPoints() + " pontos!");	
	        	else
	        		System.out.println("Não é permitido némeros negativos");	
	        else {
	        	this.setDex(this.getDex() + userInput);
		        this.setExpPoints( this.getExpPoints() - userInput );
	        	break;
	        } 
        }
        
        while(true) {
	        System.out.println("Força: "); 
	        userInput = input.nextInt();
	       
	        if( userInput > this.getExpPoints() || userInput < 0 )
	        	if(userInput > 0)
	        		System.out.println("Você só tem"+ this.getExpPoints() + " pontos!");	
	        	else
	        		System.out.println("Não é permitido némeros negativos");
	        else {
	        	this.setStr( this.getStr() + userInput );
		        this.setExpPoints( this.getExpPoints() - userInput );
	        	break;
	        } 
        }
       
        while(true) {
	        System.out.println("Inteligência: " ); 
	        userInput = input.nextInt();
	        
	        if(userInput > this.getExpPoints() || userInput < 0 )
	        	if(userInput > 0)
	        		System.out.println("Você só tem "+ this.getExpPoints() + " pontos!");	
	        	else
	        		System.out.println("Não só permitido némeros negativos");
	        else
	        {
	        	this.setInte( this.getInte() + userInput );
		        this.setExpPoints( this.getExpPoints() - userInput );
	        	break;
	        }
        }
    }
    
	public int getInte() {
		return inte;
	}

	public void setInte(int inte) {
		this.inte = inte;
	} 
    
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
    
    public Weapon getEquippedWeapon() {
    	return equippedWeapon;
    }
    
    public void setEquippedWeapon(Weapon equippedWeapon) {
    	this.equippedWeapon = equippedWeapon;
    }


}
