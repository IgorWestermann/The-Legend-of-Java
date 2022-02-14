package legendOfJava;

import java.util.Random;

public class Dragon extends Monster {
	
	// Dragons are mithical creatures.
	// Stay away from dragons or your journey can me over in a blink.
	Random rand = new Random(); 
	
	public Dragon(int lv) {
		setName("Dragão");
		setLevel(lv);
		setMinDamage(getLevel() * 42);
		setMaxDamage(getLevel() * 64);
		setHealth(1000 * lv);
		setMonsterExp(10000 * lv);
	}
	
	public int damage() {
		return (this.getMinDamage() + rand.nextInt(this.getMaxDamage()));		
	}
	
	public void attack(GameMaster Character) {
		int damage = this.damage();
		
		Character.setHealth(Character.getHealth() - damage);
		
		System.out.println(getName() + " te atacou e causou " + damage + " de dano.");
		
		if (Character.getHealth() <= 0) {
			System.out.println("Seus pontos de vida chegaram a zero. Você morreu pro o Dragão.");
			System.exit(0);
		} else {
			System.out.println("Você possui " + Character.getHealth() + " pontos de vida.");
		}
		
	}

	

}
