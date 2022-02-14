package legendOfJava;

import java.util.Random;

public class Orc extends Monster {
	
	// Orcs are big, strong but dumb creatures. 
	// They can be confused e miss their attacks or they can be enraged and do a lot of damage.
	// Be careful

	Random random = new Random(); 
	
	public Orc(int lv) {
		setName("Orc");
		setLevel(lv);
		setMinDamage(getLevel() * 0);
		setMaxDamage(getLevel() * 12);
		setHealth(50 * lv);
		setMonsterExp(500 * lv);
	}
	
	public int damage() {
		return (this.getMinDamage() + random.nextInt(this.getMaxDamage()));		
	}
	
	public void attack(GameMaster Character) {
		int damage = this.damage();
		
		Character.setHealth(Character.getHealth() - damage);
		
		System.out.println(getName() + " te atacou e causou " + damage + " de dano.");
		
		if (Character.getHealth() <= 0) {
			System.out.println("Seus pontos de vida chegaram a zero. Você morreu pro orc.");
			System.exit(0);
		} else {
			System.out.println("Você possui " + Character.getHealth() + " pontos de vida.");
		}
		
	}

}
