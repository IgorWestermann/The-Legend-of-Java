package legendOfJava;

import java.util.Random; 

public class Goblin extends Monster {
	
	// Goblins are small and weak creatures. 
	// Easy to kill 
	
	Random rand = new Random(); 

	public Goblin(int lv) {
		setName("Goblin");
		setLevel(lv);
		setMinDamage(getLevel());
		setMaxDamage(getLevel() * 2);
		setHealth(10 * lv);
		setMonsterExp(100 * lv);
	}
	
	public int damage() {
		return (this.getMinDamage() + rand.nextInt(this.getMaxDamage()));		
	}
	
	public void attack(GameMaster Character) {
		int damage = this.damage();
		
		Character.setHealth(Character.getHealth() - damage);
		
		System.out.println(getName() + " te atacou e causou " + damage + " de dano.");
		
		if (Character.getHealth() <= 0) {
			System.out.println("Seus pontos de vida chegaram a zero. Você morreu pro goblin.");
		} else {
			System.out.println("Você possui " + Character.getHealth() + " pontos de vida.");
		}
		
	}
	
}
