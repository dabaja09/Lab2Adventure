import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Middle-Earth!");
		System.out.println();
		System.out.println("Note that you will need to hit enter to proceed through conversations.");
		System.out.println("Hit Enter to Begin Your Adventure!");
		String gameMove = scan.nextLine();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("You are walking through the Mirkwood Forest when suddenly you are approached by an old man.");
		System.out.println();
		System.out.println("Old Man: Greetings Traveler! I have not seen you before. What is your name?");
		String name = scan.nextLine();
		System.out.println("Old man: " + name +", eh? That name is not familiar in these parts. What brings you to Mirkwood?");
		System.out.println(name +": I am here by mistake. You see, I am very lost. How do I...");
		System.out.println("A: get home");
		System.out.println("B: find the cave in search for treasure.");
		
		String purposeChoice = scan.nextLine();
		if (purposeChoice.equalsIgnoreCase("a")) {
			System.out.println(name + ": I am on my way home. Which way back to the Shire?");
			gameMove = scan.nextLine();
			System.out.println("Old Man: Turn left at the second oak and follow the trail through the Lone Lands, through Bree, and back to the Shire.");
			gameMove = scan.nextLine();
			System.out.println("You make it back to the Shire safely. Your journey is over");
		} else if (purposeChoice.equalsIgnoreCase("b")) {
			System.out.println(name + ": I am in search for the ancient Elf Caves.");
			gameMove = scan.nextLine();
			System.out.println("Old Man: Hmmmmmm... I don't think this is a good idea. The caves are filled with goblins who are quite dangerous. Are you sure?");
			System.out.println("(y/n)");
			purposeChoice = scan.nextLine();
			if (purposeChoice.equalsIgnoreCase("n")) {
				System.out.println(name + ": I am not prepared for that sort of danger. I will head home.");
				gameMove = scan.nextLine();
				System.out.println("Old Man: Safe travels, " + name);
				gameMove = scan.nextLine();
				System.out.println("You head back to your home in the Shire. Upon returning home your wife leaves you for returning home empty handed.");
				System.out.println("You have failed!");
			} else if (purposeChoice.equalsIgnoreCase("y")) {
				System.out.println(name + " I am sure. I will not return until I find the treasure!");
				gameMove = scan.nextLine();
				System.out.println("Old Man: Very well. It's three marks to the East and two marks to the North.");
				gameMove = scan.nextLine();
				System.out.println(name + ": Thank you. I bid you farewell Old Man.");
				gameMove = scan.nextLine();
				System.out.println("Upon reaching the cave you are confronted by 3 goblins.");
				gameMove = scan.nextLine();
				System.out.println("Goblin Leader: Lookey 'ere mates. Looks like dinna 'as come to us.");
				gameMove= scan.nextLine();
				System.out.println("What will you do?");
				System.out.println("A: Bargain with the goblins in exchange for the treasure.");
				System.out.println("B: Fight the goblins.");
				System.out.println("C: Run away!");
				purposeChoice = scan.nextLine();
					if (purposeChoice.equalsIgnoreCase("A")) {
						System.out.println(name +": Let's make a deal, noble goblin. In exchange for the treasure that's inside the cave, I will bring you the greatest feast of your lives.");
						gameMove = scan.nextLine();
						System.out.println("Goblin Leader: Ya know. I ain't neva did trust no 'alflings");
						gameMove = scan.nextLine();
						System.out.println("The goblins move towards you and eat you.");
						System.out.println("You have died.");
					} else if (purposeChoice.equalsIgnoreCase("C")) {
						System.out.println("You run away at lightning speed. You keep running until you make it back to the shire. Upon returning, your wife leaves you for coming home empty handed.");
						System.out.println("You lose!");
					} else if (purposeChoice.equalsIgnoreCase("b")) {
						System.out.println("Choose your weapon:");
						System.out.println("A: Hunting knife");
						System.out.println("B: Bow and Arrow");
						System.out.println("C: Spear");
						purposeChoice = scan.nextLine();
							if (purposeChoice.equalsIgnoreCase("C")) {
								System.out.println("You pull out your spear and lunge forward towards the Goblin Leader. You stab him in the chest. The other two goblins begin their attack on you.");
								System.out.println("You died.");
							} else if(purposeChoice.equalsIgnoreCase("A")) {
								System.out.println("You pull out your hunting knife. What will you do?");
								System.out.println("A: Throw it");
								System.out.println("B: Stab");
								purposeChoice = scan.nextLine();
									if (purposeChoice.equalsIgnoreCase("a")) {
										System.out.println("You throw your knife at the Goblin Leader and kill him.");
										System.out.println("The other two goblins are looking at you in fear. What do you do?");
										System.out.println("A: Follow up attack with your spear.");
										System.out.println("B: Follow up attack with your bow and arrow");
										purposeChoice = scan.nextLine();
										if (purposeChoice.equalsIgnoreCase("a")) {
											System.out.println("You pull out your spear and charge towards the remaining goblins. They flee in terror.");
											System.out.println("You proceed into the cave and great the treasure and return home with it.");
											System.out.println("You win!");
										} else if (purposeChoice.equalsIgnoreCase("b")) {
											System.out.println("You pull out your bow and arrow. As you turn to look forward you see the goblins have already reached you. The goblins jump on you and eat you.");
											System.out.println("You lose!");
										}
									} else if (purposeChoice.equalsIgnoreCase("b")) {
											System.out.println("You rush in to stab the Goblin Leader. He sidesteps your attack and you fall to the floor. The goblins seize this opportunity and kill you.");
											System.out.println("You lose!");
									}
							} else if (purposeChoice.equalsIgnoreCase("b")) {
								System.out.println("You draw your bow and shoot towards the leader. Your arrow misses and hits his the goblin to his left. You pull out another arrow for a follow up shot.");
								System.out.println("You miss your shot and next thing you know the Goblin Leader is attacking at melee range.");
								System.out.println("You are unable to pull your knife out in time to defend yourself, the goblin Leader seizes the opportunity and kills you.");
								System.out.println("You lose!");
							}
					}
			}
			
		
		
		
		}

		
	scan.close();	
	}

}