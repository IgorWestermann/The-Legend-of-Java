package legendOfJava;

import java.util.Random;
import java.util.Scanner;

public class Mage extends Character {

	Random rand = new Random(); 
    Scanner input = new Scanner(System.in);
    int scanUserInt;

	public Mage() {
		this.setHealthStats(6);		
        this.setDex(4);				
        this.setInte(11); 			 
        this.setStr(1); 			
        this.setHealth(this.getHealthStats() * 10);  
	}
	
	public int damage() {
		return (equippedWeapon.getWeaponMinDamage() + rand.nextInt(equippedWeapon.getWeaponMaxDamage() + 1 ) + this.getStr());
	}
	
	public void lvUp() {
		this.setExpPoints(5);
		this.setLevel(this.getLevel() + 1);
		System.out.println("Parab�ns, voc� subiu de nivel! Seu nivel atual � " + this.getLevel());
		System.out.println("Voc� ganhou mais 5 pontos para distribuir! Total de pontos: " + this.getExpPoints());
		System.out.println("Deseja distribuir seus pontos agora? (1) Sim | (2) N�o");
		scanUserInt = input.nextInt();
		if(scanUserInt == 1) {
			chooseAtributes();
		} else {
			System.out.println("Como desejar.");
		}
		
	}
	
	public void basicAttack(GameMaster Enemy) {
		int damage;
		
		if(equippedWeapon == null) {
			Enemy.setHealth(Enemy.getHealth() - this.getInte());
			damage = this.getInte();
		} else {
			damage = this.damage();
			Enemy.setHealth(Enemy.getHealth() - damage);
		}
		
		if(Enemy.getHealth() <= 0) {
			System.out.println("Voc� causou " + damage + " de dano.");
			System.out.println("Voc� derrotou " + Enemy.getName() + ".");
			System.out.println("Voc� ganhou " + Enemy.getMonsterExp() + " pontos de experi�ncia.");
			
			if(this.getLevel() * this.getLevel() * 100 > this.getExp() + Enemy.getMonsterExp()) {
				this.setExp(this.getExp() + this.getMonsterExp());
			} else {
				this.setExp(this.getExp() + Enemy.getMonsterExp() - this.getLevel() * this.getLevel() * 100);
				lvUp();
			}
			return;
		}
		System.out.println("Voc� causou " + damage + " de dano.");
		System.out.println("Vida restante do " + Enemy.getName() + ": " + Enemy.getHealth() + ".");
	}
	
	public void specialAttack(GameMaster Enemy) {
		int damage = (equippedWeapon.getWeaponMinDamage() + rand.nextInt(equippedWeapon.getWeaponMaxDamage() + 1) + this.getInte()) + (this.getInte()*2);
		
		String[] specialAttacks = {"Nevasca", "Rel�mpago", "Bola de Fogo"};
		
		int action = rand.nextInt(3);
		
		Enemy.setHealth(Enemy.getHealth() - damage);
		
		if(Enemy.getHealth() <= 0) {
			System.out.println("Voc� usou " + specialAttacks[action] + "! Voc� causou " + damage);
			System.out.println(Enemy.getName() + "est� morto.");
			System.out.println("Voc� ganhou " + Enemy.getMonsterExp() + " pontos de experi�ncia.");
			
			if(this.getLevel() * this.getLevel() * 100 > this.getExp() + Enemy.getMonsterExp()) {
				this.setExp(this.getExp() + this.getMonsterExp());
			} else {
				this.setExp(this.getExp() + Enemy.getMonsterExp() - this.getLevel() * this.getLevel() * 100);
				lvUp();
			}
			return;
		}
		System.out.println("Voc� causou " + damage + " de dano.");
		System.out.println("Vida restante do " + Enemy.getName() + ": " + Enemy.getHealth() + ".");
	}

	@Override
	public void battle(Monster enemy) {
		double moves = this.getInte()/2;
		moves = Math.floor(moves);
		
		while(enemy.getHealth() > 0) {		
			System.out.println("O que Voc� deseja fazer?");
	    	System.out.println("(1) Ataque B�sico");
	    	System.out.println("(2) Ataque Especial");
	    	System.out.println("(3) Fugir");
	    	scanUserInt =  input.nextInt(); 
	    	
	    	switch( scanUserInt ) {
	    		case 1:
	    			this.basicAttack(enemy);
	    			break;
	    			
	    		case 2:
	    			if(moves!=0) {
	    				this.specialAttack(enemy);
	    				moves--;
	    			}
	    			else
	    				System.out.println( "Voc� j� gastou todos seus pontos de Ataque Especial." );
	    			break;
	    			
	    		case 3:
	    			System.out.println( "Voc� tenta fugir mas o " + enemy.getName() + " n�o permite.");
	    			break;
	    	}
	    	
	    	if(enemy.getHealth() > 0) {
	    		enemy.attack(this);
	    	}
		}
	}

}
