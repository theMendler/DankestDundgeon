import java.util.Scanner;
public class Main 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("THEY CAME FROM BELOW!");
		System.out.println("A text adventure by William Hall, Lee Villacreses, and Billy Tsakalios" + "\n Press enter to start.");
		System.out.println("_________________________________");
		//Declare and initialize monsters and set their descriptions.
		Monster Demon = new Monster("Demon", 50, 7);
		Monster Summoner = new Monster("Corrupted Summoner", 40, 8);
		Monster Voidling = new Monster("Voidling", 30, 5);
		Boss boss = new Boss("Boratheon", 70, 12, 15);
		
		Demon.setDescription("a servant of the Lord of the Underworld.");
		Demon.setAttackDescription("The foul creature lunges at you with its long claws.");
		
		Summoner.setDescription("a mage corrupted by the dark promises of Boratheon, the Lord of the Underworld.");
		Summoner.setAttackDescription("The summoner whacks you with his staff.");
		
		Voidling.setDescription("n underling to various nefarious creatures that do any task from tying their dark lord's shoes to \n"
				+ "attacking player characters like yourself.");
		Voidling.setAttackDescription("The voidling charges at you, nimbly climbing on your body and scratching you before running \n"
				+ "away.");
		
		//Declare and initialize armors, and set their descriptions.
		Armor Shield = new Armor("Iron Banded Shield", 5,0);
		Armor Leather = new Armor("Leather Tunic", 2,0);
		Armor Helmet = new Armor("Boratheon's Maw", 7,0); //Final Reward
		
		Shield.setDescription("A sturdy shield bearing the crest of the town armorsmith.");
		
		Leather.setDescription("A respectable tunic made of leather. Provides meager protetion.");
		
		Helmet.setDescription("The hollowed skull of Boratheon. It hums with a low energy, which may give migranes.");
		
		//Declare and initialize items, and set their descriptions.
		Item HPPot = new Item("Health Potion", 10);
		Item Food = new Item("Coffee", 5);
		
		HPPot.setDescription("A potion glowing with energy. It looks like it might do some good.");
		Food.setDescription("A hot cup of coffee. Just what you needed right now!");
		
		//Declare and initialize rooms, their descriptions, and their exits.
		Room one = new Room("Entrance Way", null,null, false);
		Room two = new Room("Living Room", Voidling,null,true);
		Room three = new Room("Kitchen",null,HPPot, false);
		Room four = new Room("Dining Room", Demon, Food, true);
		Room five = new Room("Stairs Up", null, null,false);
		Room six = new Room("Stairs Down", null, null,false);
		Room seven = new Room("Child's Room", Voidling, Food,true);
		Room eight = new Room("Parent's Room", Demon, HPPot,true );
		Room nine = new Room("Closet", null, Shield, false);
		Room ten = new Room("Washroom", Voidling, null, true);
		Room eleven = new Room("Basement Entrance", Demon, HPPot, true );
		Room twelve = new Room("Main Basement", Summoner, HPPot, true);
		Room thirteen = new Room("Main Basement 2", boss, null, true);
		Room fourteen = new Room("Upstairs Hallway", null, null, false);
		
		one.setDescription("As you enter the house, a sense of dread overwhelms you. There are stairs in front of you leading \n"
				+ " up and down, and to your sides are what look like a living room and a kitchen.");
		two.setDescription("The living room is a mess. Chairs strewn about messily, the floorboards covered in a mix of blood \n"
				+ " and some black liquid. As you enter, you hear quiet talking, and suddenly two voidlings jump out at you.");
		three.setDescription("The kitchen is practicaly unrecognizable. All the food is eaten whole, with only bones \n"
				+ " remaining of the meat. Claw marks cover the cabinets and walls. In your searching, you manage to find \n"
				+ " a health potion hidden in the rubble");
		four.setDescription("As you enter the dining room, you hear a loud banging and a language you don't recognize. A demon sits \n"
				+ " on top of the table, and turns towards you as you enter.");
		five.setDescription("The stairs go up towards the second story. They creak and moan, but nothing else appears to be amiss.");
		six.setDescription("The stairs go towards what look like a basement. An odd glow eminates from the bottom, but you can't \n"
				+ " make anything out.");
		seven.setDescription("The room has a low bed, a small wooden rocking horse, and some drawers for clothes. Children's toys \n"
				+ " have been ripped to shreds on the ground, and just when you lean down to inspect, two voidlings pop out from \n"
				+ " under the bed.");
		eight.setDescription("A larger version of the child's room, but with less toys. A demon lays on the bed, sleeping. \n"
				+ " As you internalize the fact that demons sleep, you notice an HP Pot on the dresser right next to the bed.");
		nine.setDescription("The closet at the end of the hall looks like any normal closet, with various clothing, balls, and \n"
				+ " brooms strewn about. However, when you look through the mess, you find a large, iron shield.");
		ten.setDescription("Peering into the washroom, perhaps looking for a rag to rid yourself of the stench, you get charged by \n"
				+ " a voidling.");
		eleven.setDescription("As you get to the bottom of the stairs, you hear mumblings coming from behind the stairs, and \n"
				+ " a demon pops out from behind, ready for a fight.");
		twelve.setDescription("After felling the demon, you get a look around, and see a large circle with marking all around it \n"
				+ " drawn in white. Various herbs and plants, as well as some parts of animals (you hope), are scattered evenely \n"
				+ " around the circle. As you begin to take a closer look, a hooded figure appears from the shadows, telling you it \n"
				+ " is too late. Just then, the circle starts to glow, and the figure laughs as he charges you, staff in hand.");
		thirteen.setDescription("As the summoner is defeated, you turn, realizing the summoning is complete. A being made \n"
				+ " completely of bone emerges slowly from the now blindingly bright circle, cackling. He bows, somewhat smugly \n"
				+ " and introduces himself as Boratheon, the leader of the underworld. He explains that he is here to \n"
				+ " 'expand his territory' by taking over the earth and wiping out all humans. As he says this he grins, looking \n"
				+ " directly at you: 'starting with you.'");
		fourteen.setDescription("As you reach the top of the stairs, you see 2 doors in front of you, and one at the end of the \n"
				+ " hallway.");
		
		Map map = new Map(one);
		Room current;
		current = map.getCurrentRoom();
		
		one.setExits(two, three, five, six);
		two.setExits(one, four, null, null);
		three.setExits(one, four, null, null);
		four.setExits(two, three, null, null);
		five.setExits(one, fourteen, null, null);
		six.setExits(one, eleven, null, null);
		seven.setExits(null, fourteen, null, null);
		eight.setExits(null, fourteen, null, null);
		nine.setExits(null, fourteen, null, null);
		ten.setExits(fourteen, null, null, null);
		eleven.setExits(six, twelve, null, null);
		twelve.setExits(eleven, thirteen, null, null);
		thirteen.setExits(eleven, null, null, null);
		
		//Declare and initialize the player character.
		Scanner key = new Scanner(System.in);
		String tempName;
		tempName = key.nextLine();
		Player hero = new Player(tempName, 150, 10, Leather);
		System.out.println(one.getRoomDesc());

		//Declare variables for local use in the loop
		Monster currentMonster;
		Item currentItem;
		String itemCheck;
		String roomCheck;

		//Main loop Sequence
		while(hero.getPlayerHP()>0)
		{
			if (current.getMonsterFight())
			{
				//set current room's item and monster
				currentMonster = current.getMonster();
				System.out.println("In the room you see a " + currentMonster.getMonsterName() + ", " +
								currentMonster.getDescription());
				//fight
				while (hero.getPlayerHP() > 0 && currentMonster.getHP() > 0) {
					//Monster attack
					hero.takeDamage(currentMonster);
					System.out.println(currentMonster.getAttackDescription());
					//Player attack
					currentMonster.takeDamage(hero);
					System.out.println("You swing at the " + currentMonster.getMonsterName());
					//Player or monster death check.
					if (currentMonster.getHP() <= 0) {
						System.out.println("The " + currentMonster.getMonsterName() + " is dead.");
					} else if (hero.getPlayerHP() <= 0) {
						System.out.println("You have died. Restart the program to retry.");
					}
				}
				//Item check
			}
			if(current.getItem() != null)
            {
            	//Set current item for the room
            	currentItem = current.getItem();
            	//Item pick-up check
                System.out.println("You spy a " + currentItem.getItemName() + " on the ground. Would you" +
                        " like to pick it up?");
                System.out.println("{Y}/{N}?");
                itemCheck = keyboard.nextLine();
                itemCheck.toUpperCase();
                //Add a shield to the player's inventory
                if( itemCheck.equals("Y"))
                {
                    if(currentItem == Shield)
                    {
                        hero.equip(Shield);
                    }
                    //heal the player
                    hero.heal(currentItem);
                    System.out.println("You healed yourself for " + currentItem.getHealth() + " hp.");
                }
            }
			//move rooms
			current.printExits();
			roomCheck = keyboard.nextLine();
			map.moveRooms(roomCheck);
			//Set current room to the one player specified and print the room description
			map.setCurrentRoom(map.getNextRoom());
			map.roomText(map.getNextRoom());
		}
		//end game
		if(hero.getPlayerHP()>0 && boss.isDead() == true) {
			System.out.println("Congratulations! You have slain Boratheon and his minions, and are victorious!");
		}
		else if(hero.getPlayerHP()<=0 && boss.isDead() == false) {
			System.out.println("You were defeated by Boratheon and have lost the game.");
		}

	}
}
