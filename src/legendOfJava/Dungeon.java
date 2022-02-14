package legendOfJava;

import java.util.ArrayList;
import java.util.Random;

public class Dungeon {
	
	Random random = new Random(4);
	private int dungeonLevel;
	int aux = random.nextInt(10);
	private int dungeonLength;
	
	String[] feeling = {"confiança", "perigo", "medo", "terror"};
	String[] monsters = {"Goblin", "Orc", "Troll", "Dragon"};
	
	ArrayList<Monster> enemys = new ArrayList<Monster>();
	
	public Dungeon(int level) {
		setLevel(level);
		setDungeonLength(level * 2);
		
	}
		
	public void enterTheDungeon() {
		int count = 0;
		
		while(getDungeonLength() > 0) {
			switch(monsters[random.nextInt(4)]) {
				case "Goblin": 
					setDungeonLength( dungeonLength - 1 );
					Goblin goblin = new Goblin(random.nextInt(1) + 1);
					enemys.add(count, goblin);
					count++;
					
					break;
				
				case "Orc":
						setDungeonLength( dungeonLength - 1 );
						Orc orc = new Orc(random.nextInt(1) + 1);
						enemys.add(count, orc);
						count++;
						
						break;
					
				case "Troll": 
						setDungeonLength( dungeonLength - 1 );
						Troll troll = new Troll(random.nextInt(1) + 1);
						enemys.add(count, troll);
						count++;
						
						break;
					
					
				case "Dragon":
						setDungeonLength( dungeonLength - 1 );
						Dragon dragon = new Dragon(random.nextInt(1) + 1);
						enemys.add(count, dragon);
						count++;
						
						break;
						
					
			}
		}
	}

	public int getLevel() {
		return dungeonLevel;
		
	}
	public void setLevel(int level) {
		this.dungeonLevel = level;
	}

	public int getDungeonLevel() {
		return dungeonLevel;
	}

	public void setDungeonLevel(int dungeonLevel) {
		this.dungeonLevel = dungeonLevel;
	}

	public int getDungeonLength() {
		return dungeonLength;
	}

	public void setDungeonLength(int dungeonLength) {
		this.dungeonLength = dungeonLength;
	}

}
