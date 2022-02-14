package legendOfJava;

public abstract class Weapon {

	private int weaponMinDamage;
	private int weaponMaxDamage;
	private String name;
	
	
	public int getWeaponMinDamage() {
		return weaponMinDamage;
	}
	public void setWeaponMinDamage(int weaponMinDamage) {
		this.weaponMinDamage = weaponMinDamage;
	}
	
	
	public int getWeaponMaxDamage() {
		return weaponMaxDamage;
	}
	public void setWeaponMaxDamage(int weaponMaxDamage) {
		this.weaponMaxDamage = weaponMaxDamage;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
