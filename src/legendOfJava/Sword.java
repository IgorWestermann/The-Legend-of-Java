package legendOfJava;

public class Sword extends Weapon {

	private int str_Min;
	
	public Sword(String name, int minDamage, int maxDamage, int strMin) {
		this.setName(name);
		this.setWeaponMinDamage(minDamage);
		this.setWeaponMaxDamage(maxDamage);
		this.setStrMin(strMin);
	}
	
	public void equip(Character person) {
		if(person.getStr() < str_Min) {
			int requiredStr = this.getStrMin() - person.getStr();
			System.out.println("Você precisa de mais " + requiredStr + " pontos de força para equipar essa espada.");
		} else {
			person.setEquippedWeapon(this);
			System.out.println("Você equipou uma " + this.getName() + ".");
		}
	}

	public int getStrMin() {
		return str_Min;
	}

	public void setStrMin(int str_Min) {
		this.str_Min = str_Min;
	}

}
