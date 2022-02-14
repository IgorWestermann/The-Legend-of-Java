package legendOfJava;

public class Bow extends Weapon {
	
private int dex_Min;
	
	public Bow(String name, int minDamage, int maxDamage, int inteMin) {
		this.setName(name);
		this.setWeaponMinDamage(minDamage);
		this.setWeaponMaxDamage(maxDamage);
		this.setDex_Min(inteMin);
	}
	
	public void equip(Character person) {
		if(person.getDex() < dex_Min) {
			int requiredDex = this.getDex_Min() - person.getDex();
			System.out.println("Voc� precisa de mais " + requiredDex + " pontos de destreza para equipar esse arco.");
		} else {
			person.setEquippedWeapon(this);
			System.out.println("Voc� equipou '" + this.getName() + "'.");
		}
	}

	public int getDex_Min() {
		return dex_Min;
	}

	public void setDex_Min(int dex_Min) {
		this.dex_Min = dex_Min;
	}

}
