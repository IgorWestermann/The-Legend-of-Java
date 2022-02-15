package legendOfJava;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*; 
import java.util.Random;

public class Game {
	
	private static Scanner input;
	Random random = new Random();
	
	int user;
	String userText;
	
	JFrame window ;
	Container con;
	JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
	JLabel titleNameLabel, hpLabel, hpLabelNumber, nameLabel, nameLabelName;
	JButton startButton, choice1, choice2, choice3, choice4;
	Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Times New Roman", Font.PLAIN, 20);
	JTextArea mainTextArea;
	JTextField txtInput = new JTextField("");
	
	Character character = null;
	
	int playerHp;
	String name, position;
	String playerName;
	int playerClass;
	
	Dungeon room = new Dungeon(5);
	
	int firstRoom;
	
	int premonition;
	
	
	ScreenHandler tsHandler = new ScreenHandler();
	ChoiceHandler choiceHandler = new ChoiceHandler();

	public static void main(String[] args) throws IOException {
		
		new Game();
		
	}
	
	public Game() {
	
		input = new Scanner(System.in);
		
		window = new JFrame();
		window.setSize(800, 600);									
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);									
		window.setResizable(false);								
		window.setTitle("The Legend of Java"); 					
		con = window.getContentPane();
	
		titleNamePanel = new JPanel();
		titleNamePanel.setBounds(100, 100, 600, 150);
		titleNamePanel.setBackground(Color.black);
		
		titleNameLabel = new JLabel("The Legend pf Java");
		titleNameLabel.setForeground(Color.white);
		titleNameLabel.setFont(titleFont);
		
		startButtonPanel = new JPanel();
		startButtonPanel.setBounds(300, 400, 200, 100);
		startButtonPanel.setBackground(Color.black);
		
		startButton = new JButton("START");
		startButton.setBackground(Color.black);
		startButton.setForeground(Color.white);
		startButton.setFont(normalFont);
		startButton.addActionListener(tsHandler);
		startButton.setFocusPainted(false);

		titleNamePanel.add(titleNameLabel);
		startButtonPanel.add(startButton);
		
		con.add(titleNamePanel);
		con.add(startButtonPanel);
		
		System.out.println(
				  "Após a 4ª grande guerra, vários reinos foram subjulgados pelo reino de Drafall graças ao seu poderio militar e criaturas místicas sob seu controle. "
				+ "\nE assim, instaurando uma ditadura onde o medo era algo que assolava toda sua população."
				+ "\nOs habitantes vivam sob regras muito restritas onde quase não existia livre arbitrio."
				+ "\nSuas casas passaram a ser do rei soberano, seus desejos não poderiam existir a menos que beneficiasse o rei."
				+ "\nPorém algumas pessoas espalhadas pelo reino não aceitavam essa situação."
				+ "\n\nUm grupo de guerreiros auto intitulados como 'Java' resaolve agir contra o sistema e você é um dos membros!\n\n");

		System.out.println("Escolha sua classe.");
		System.out.println("Digite (1) Guerreiro - (2) Mago - (3) Arqueiro");
		
		user = input.nextInt();
		System.out.println("Insira seu nome");
		userText = input.nextLine();
		
		switch (user) {
			case 1:
				userText = input.nextLine();
				System.out.println("Muito bem, " + userText + "! Para ajudar na sua jornada, aqui está um presente!");
				character = new Warrior();
				character.setName(userText);
				Sword basicSword = new Sword("Espada básica", 1, 4, 10);
				basicSword.equip(character);
				
				break;
				
			case 2:
				userText = input.nextLine();
				System.out.println("Muito bem, " + userText + "! Para ajudar na sua jornada, aqui está um presente!");
				character = new Mage();
				character.setName(userText);
				Staff basicStaff = new Staff("Cetro básico", 1, 4, 10);
				basicStaff.equip(character);
				
				break;
				
			case 3:
		
				userText = input.nextLine();
				System.out.println("Muito bem, " + userText + "! Para ajudar na sua jornada, aqui está um presente!");
				character = new Archer();
				character.setName(userText);
				Bow basicBow = new Bow("Arco básico", 1, 4, 10);
				basicBow.equip(character);
				
				break;			
		}
		
		System.out.println("\n\nVocê encontra seus companheiros na taverna de Lorbas para dar inicio a uma reunião referente a próxima missão.");
		System.out.println("Após discutir todos os planos, é visto que você é o melhor para realizar uma missão de reconhecimento."
				+ "Então você, dada a urgencia da missão, parte sozinho para as terras de Malac.");
		System.out.println("Chegando em Malac, você avista a masmorra que foi dita durante a reunião. "
				+ "Você decide entrar mesmo sabendo que seu futuro é totalmente incerto.");
		

			int aux = 0;
			
			 Dungeon room = new Dungeon(5);
		
			 
			 room.enterTheDungeon();
			 
			 for(int i = 0; i < room.enemys.size(); i++) {
				 room.enemys.get(i);
			 }
			 
			 int firstRoom = room.enemys.size();
			 System.out.println("\nO que você deseja fazer?");
			 System.out.println("(1) Entrar");
			 user = input.nextInt();
			 
			 int premonition = random.nextInt(4);
			 			 
			 System.out.println("Você entra na masmorra e logo sente algo.");
			 while(aux <= firstRoom) {
				 switch(user) {
				 	case 1:
				 					 		
				 		if(premonition == 0) {
				 			System.out.println("Uma sensação de segurança toma o seu corpo.");
				 			System.out.println("O que você deseja fazer?");
				 			System.out.println("(1) Avançar");
				 			user = input.nextInt();
				 			System.out.println("Você encontra um Goblin");
				 			System.out.println("Você possui " + character.getHealth() + " pontos de vida");
				 			System.out.println(room.enemys.get(2).getName() + " possui " + room.enemys.get(2).getHealth() + " pontos de vida.");				 			
				 			room.enemys.get(2).attack(character);
				 			character.battle(room.enemys.get(2));
				 			room.enemys.remove(2);
				 			aux++;
				 			
				 		}
				 		if(premonition == 1) {
							System.out.println("Uma sensação de perigo toma o seu corpo.");
							System.out.println("O que você deseja fazer?");
							System.out.println("(1) Avançar");
							user = input.nextInt();
							System.out.println("Você encontra um Orc");
							System.out.println("Você possui " + character.getHealth() + " pontos de vida");
							System.out.println(room.enemys.get(3).getName() + " possui " + room.enemys.get(3).getHealth() + " pontos de vida.");
				 			room.enemys.get(3).attack(character);
				 			character.battle(room.enemys.get(3));
				 			room.enemys.remove(3);
				 			aux++;
						 }
						 if(premonition == 2) {
							System.out.println("Uma sensação de medo toma o seu corpo.");
							System.out.println("O que você deseja fazer?");
							System.out.println("(1) Avançar");
							user = input.nextInt();
							System.out.println("Você encontra um Troll");
							System.out.println("Você possui " + character.getHealth() + " pontos de vida");
							System.out.println(room.enemys.get(8).getName() + " possui " + room.enemys.get(8).getHealth() + " pontos de vida.");
				 			room.enemys.get(8).attack(character);
				 			character.battle(room.enemys.get(8));
				 			room.enemys.remove(8);
				 			aux++;
						 }
						 if(premonition == 3) {
							System.out.println("Uma sensação de terror toma o seu corpo.");
							System.out.println("O que você deseja fazer?");
							System.out.println("(1) Avançar");
							user = input.nextInt();
							System.out.println("Você encontra um Dragon");
							System.out.println("Você possui " + character.getHealth() + " pontos de vida");
							System.out.println(room.enemys.get(0).getName() + " possui " + room.enemys.get(0).getHealth() + " pontos de vida.");
				 			room.enemys.get(0).attack(character);
				 			character.battle(room.enemys.get(0));
				 			room.enemys.remove(0);
				 			aux++;
						 }
				 		break;
				 		
				 }
					 
					 
			 }
			 			 
			
			 
//		}
		
		
	}
	
	public void createGameScreen() {
		
		titleNamePanel.setVisible(false);
		startButtonPanel.setVisible(false);
		
		mainTextPanel = new JPanel();
		mainTextPanel.setBounds(65, 50, 650, 450);
		mainTextPanel.setBackground(Color.black);
		con.add(mainTextPanel);
		
		mainTextArea = new JTextArea();
		mainTextArea.setBounds(100, 50, 650, 450);
		mainTextArea.setBackground(Color.black);
		mainTextArea.setForeground(Color.white);
		mainTextPanel.add(mainTextArea);
		mainTextArea.setFont(normalFont);
		mainTextArea.setLineWrap(true);
		
		choiceButtonPanel = new JPanel();
		choiceButtonPanel.setBounds(250, 450, 300, 80);
		choiceButtonPanel.setBackground(Color.black);
		con.add(choiceButtonPanel);
		
		choice1 = new JButton("Choice 1");
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		choice1.setFont(normalFont);
		choice1.setFocusPainted(false);
		choice1.addActionListener(choiceHandler); 
		choice1.setActionCommand("b1"); 
		choiceButtonPanel.add(choice1);;
		
		choice2 = new JButton("Choice 2");
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		choice2.setFont(normalFont);
		choice2.setFocusPainted(false);
		choice2.addActionListener(choiceHandler);
		choice2.setActionCommand("b2");
		choiceButtonPanel.add(choice2);
		
		choice3 = new JButton("Choice 3");
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		choice3.setFont(normalFont);
		choice3.setFocusPainted(false);
		choice3.addActionListener(choiceHandler);
		choice3.setActionCommand("b3");
		choiceButtonPanel.add(choice3);
		
		playerPanel = new JPanel();	
		playerPanel.setBounds(100, 15, 600, 20);
		playerPanel.setBackground(Color.black);
		playerPanel.setLayout(new GridLayout(1, 4));
		con.add(playerPanel);
		
		nameLabel = new JLabel("Nome: ");
		nameLabel.setFont(normalFont);
		nameLabel.setForeground(Color.white);
		playerPanel.add(nameLabel);
		
		nameLabelName = new JLabel();
		nameLabelName.setFont(normalFont);
		nameLabelName.setForeground(Color.white);
		playerPanel.add(nameLabelName);
		
		hpLabel = new JLabel("HP: ");	
		hpLabel.setFont(normalFont);
		hpLabel.setForeground(Color.white);
		playerPanel.add(hpLabel);
		
		hpLabelNumber = new JLabel();
		hpLabelNumber.setFont(normalFont);
		hpLabelNumber.setForeground(Color.white);
		playerPanel.add(hpLabelNumber);
		
		

		townGate();
		
	}
	

	public void playerSetup(String name) {
		try {
			playerHp = character.getHealth();
			this.name = character.equippedWeapon.getName();
			
		} catch (Exception e) {
			System.out.println("Character is null");
		}
		hpLabelNumber.setText("" + playerHp);
		nameLabelName.setText(name);
		
//		townGate();
		
	}
	
	public void townGate() {
		position = "townGate";
		mainTextArea.setText(
				  "Após a 4ª grande guerra, vários reinos foram subjulgados pelo reino de Drafall\ngraças ao seu poderio militar e criaturas místicas sob seu controle.\n"
				+ "E assim, instaurando uma ditadura onde o medo era algo que assolava toda sua\npopulação.\n"
				+ "Os habitantes vivam sob regras muito restritas onde quase não existia livre\narbitrio."
				+ " Suas casas passaram a ser do rei soberano, seus desejos não poderiam\nexistir a menos que beneficiasse o rei."
				+ " Porém algumas pessoas espalhadas pelo\nreino não aceitavam essa situação.\n\n"
				+ "Um grupo de guerreiros auto intitulados como 'Java' resaolve agir contra o sistema e você é um dos membros!");


		choice1.setText("     >     ");
		choice2.setText("     >     ");
		choice3.setText("     >     ");

	}
	
	public void startingCharacter() {
		position = "startingCharacter";
		mainTextArea.setText("Escolha sua classe e seu nome.\n"
				+ "Digite (1) Guerreiro - (2) Mago - (3) Arqueiro");
		choice1.setText("Guerreiro");
		choice2.setText("Mago");
		choice3.setText("Arqueiro");
		playerName = JOptionPane.showInputDialog("Insira seu nome");
//		playerSetup(playerName);
	}

		
	
	public void enterTheDungeon() {
		position = "enterTheDungeon";
		playerSetup(playerName);
		mainTextArea.setText("\n\nVocê encontra seus companheiros na taverna de Lorbas para dar inicio a uma reunião referente a próxima missão.\n"
				+ "Após discutir todos os planos, é visto que você é o melhor para realizar uma missão de reconhecimento.\n"
				+ "Então você, dada a urgencia da missão, parte sozinho para as terras de Malac.\n"
				+ "Chegando em Malac, você avista a masmorra que foi dita durante a reunião.\n"
				+ "Você decide entrar mesmo sabendo que seu futuro é totalmente incerto.");
				 
		room.enterTheDungeon();
		 
		for(int i = 0; i < room.enemys.size(); i++) {
			 room.enemys.get(i);
		}	
		
		choice1.setText("     >     ");
		choice2.setText("     >     ");
		choice3.setText("     >     ");
		
	}
	
	public void prepareToBattle(int premonition) {
		position = "prepareToBattle";

//		premonition = random.nextInt(4);
						 		
 		if(premonition == 0) {
 			mainTextArea.setText("Uma sensação de segurança toma o seu corpo.\n"
 					+ "Você anda mais um pouco ve algo pequeno se mexendo nas sombras\n\n"
 					+ "Você encontra um Goblin!\n\n"
 					+ room.enemys.get(2).getName() + " possui " + room.enemys.get(2).getHealth() + " pontos de vida.");
 			choice1.setText("Ataque Básico");
 			choice2.setText("Ataque Especial");
 			choice3.setText("Fugir");
// 			room.enemys.get(2).attack(character);
// 			character.battle(room.enemys.get(2));
// 			room.enemys.remove(2);
 			
 		}
 		if(premonition == 1) {
 			mainTextArea.setText("Uma sensação de perigo toma o seu corpo.\n"
 					+ "Você anda mais um pouco ve algo batendo em tudo pelo caminho\n\n"
 					+ "Você encontra um Orc!\n\n"
 					+ room.enemys.get(3).getName() + " possui " + room.enemys.get(3).getHealth() + " pontos de vida.");	
 			choice1.setText("Ataque Básico");
 			choice2.setText("Ataque Especial");
 			choice3.setText("Fugir");
// 			room.enemys.get(3).attack(character);
// 			character.battle(room.enemys.get(3));
// 			room.enemys.remove(3);
		 }
		 if(premonition == 2) {
			 mainTextArea.setText("Uma sensação de medo toma o seu corpo.\n"
	 					+ "Você anda mais um pouco ve algo se correndo atras de você\n\n"
	 					+ "Você encontra um Troll!\n\n"
	 					+ room.enemys.get(8).getName() + " possui " + room.enemys.get(8).getHealth() + " pontos de vida.");
			 choice1.setText("Ataque Básico");
 			choice2.setText("Ataque Especial");
 			choice3.setText("Fugir");
// 			room.enemys.get(8).attack(character);
// 			character.battle(room.enemys.get(8));
// 			room.enemys.remove(8);
		 }
		 if(premonition == 3) {
			 mainTextArea.setText("Uma sensação de terror toma o seu corpo.\n"
	 					+ "Você anda mais um pouco ve e se depara com uma criatura mitológica.\n\n"
	 					+ "Você encontra um Dragão!\n\n"
	 					+ room.enemys.get(0).getName() + " possui " + room.enemys.get(0).getHealth() + " pontos de vida.");
			 choice1.setText("Ataque Básico");
 			choice2.setText("Ataque Especial");
 			choice3.setText("Fugir");
// 			room.enemys.get(0).attack(character);
// 			character.battle(room.enemys.get(0));
// 			room.enemys.remove(0);
		 }
	 		
	 
	}
	
	

	public class ScreenHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			createGameScreen();
			
		}
	}
	
	public class ChoiceHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String yourChoice = e.getActionCommand();
			
			switch(position) {
				
				case "townGate":
					switch (yourChoice) {
						case "b1": startingCharacter(); break;
						case "b2": startingCharacter(); break;
						case "b3": startingCharacter(); break;
					}
					break;
					
				case "startingCharacter":
					switch (yourChoice) {
						case "b1": 
							mainTextArea.setText("Muito bem, " + playerName + " Para ajudar na sua jornada, aqui está um presente!\n\n"
									+ "Você equipou uma 'Espada básica'");
							character = new Warrior();
							character.setName(playerName);
							Sword basicSword = new Sword("Espada básica", 1, 4, 10);
							basicSword.equip(character);
							enterTheDungeon();
							break;
						case "b2": 
							mainTextArea.setText("Muito bem, " + playerName + " Para ajudar na sua jornada, aqui está um presente!\n\n"
									+ "Você equipou uma 'Cetro básico'");
							character = new Mage();
							character.setName(userText);
							Staff basicStaff = new Staff("Cetro básico", 1, 4, 10);
							basicStaff.equip(character);
							break;
						case "b3": 
							mainTextArea.setText("Muito bem, " + playerName + " Para ajudar na sua jornada, aqui está um presente!\n\n"
									+ "Você equipou uma 'Arco básico'");
							character = new Archer();
							character.setName(userText);
							Bow basicBow = new Bow("Arco básico", 1, 4, 10);
							basicBow.equip(character);
							break;
					}
					break;
										
					
				case "enterTheDungeon":
					switch (yourChoice) {
						case "b1": prepareToBattle(random.nextInt(4)); break;
						case "b2": prepareToBattle(random.nextInt(4)); break;
						case "b3": prepareToBattle(random.nextInt(4)); break;
				}
				break;
					
			}
			
		}
		
	}
	
	public class txtInputListener implements ActionListener {
	    public void actionPerformed(ActionEvent event) {
	        userText = txtInput.getText();  
	        System.out.println(userText);
	    }
	}
	
}
 
//
// DATA DE ENTREGA 14/02
// Condigo fonte
// build
// documentação
// 