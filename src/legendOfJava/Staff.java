package legendOfJava;

public class Staff extends Weapon {

private int inteMin;
	
	public Staff(String name, int minDamage, int maxDamage, int inteMin) {
		this.setName(name);
		this.setWeaponMinDamage(minDamage);
		this.setWeaponMaxDamage(maxDamage);
		this.setInteMin(inteMin);
	}
	
	public void equip(Character person) {
		if(person.getInte() < inteMin) {
			int requiredInt = this.getInteMin() - person.getInte();
			System.out.println("Voc� precisa de mais " + requiredInt + " pontos de inteligencia para equipar esse cajado.");
		} else {
			person.setEquippedWeapon(this);
			System.out.println("Voc� equipou '" + this.getName() + "'.");
		}
	}

	public int getInteMin() {
		return inteMin;
	}

	public void setInteMin(int inteMin) {
		this.inteMin = inteMin;
	}

}
