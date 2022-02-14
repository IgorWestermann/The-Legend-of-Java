package legendOfJava;

import java.util.Random;

public class Troll extends Monster {
	
	// Trolls are big, strong and evil creatures. 
	// They can hit realy hard. Be careful

	Random rand = new Random(); 
	
	public Troll(int lv) {
		setName("Troll");
		setLevel(lv);
		setMinDamage(getLevel() * 12);
		setMaxDamage(getLevel() * 24);
		setHealth(200 * lv);
		setMonsterExp(2000 * lv);
	}
	
	public int damage() {
		return (this.getMinDamage() + rand.nextInt(this.getMaxDamage()));		
	}
	
	public void attack(GameMaster Character) {
		int damage = this.damage();
		
		Character.setHealth(Character.getHealth() - damage);
		
		System.out.println(getName() + " te atacou e causou " + damage + " de dano.");
		
		if (Character.getHealth() <= 0) {
			System.out.println("Seus pontos de vida chegaram a zero. Você morreu pro troll.");
			System.exit(0);
		} else {
			System.out.println("Você possui " + Character.getHealth() + " pontos de vida.");
		}
		
	}

}
