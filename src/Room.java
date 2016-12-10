public class Room 
{
	private String roomName;
	private String roomDesc;
	Room[] exit = new Room[4];
	private Monster roomMonster;
	private Item roomItem;
	private boolean monsterFight;
	
	public Room(String name, Monster monster, Item item, boolean fight)
	{
		roomName = name;
		roomMonster = monster;
		roomItem = item;
		monsterFight = fight;
	}
	public Room(String name)
	{
		
	}
	
	public void setDescription(String desc)
	{
		roomDesc = desc;
	}
	
	public void setExits(Room exit1, Room exit2, Room exit3, Room exit4)
	{

		exit[0] = exit1;
		exit[1] = exit2;
		exit[2] = exit3;
		exit[3] = exit4;
	}
	public void addItem(Item item)
	{
		roomItem = item;
	}
	public String getRoomName()
	{
		return roomName;
	}
	public String getRoomDesc()
	{
		return roomDesc;
	}
	public Room[] getExits()
	{
		return exit;
	}
	public Monster getMonster()
	{
		return roomMonster;
	}
	public Item getItem()
	{
		return roomItem;
	}
	public boolean getMonsterFight() {return monsterFight;}
	public String printExits() // prints all the possible exits the player can go to
	{
		String message;
		message = "You can go to: ";
		for(int i =0; i < exit.length; i++)
		{
			if(exit[i]!=null) {
				System.out.println("{" + exit[i].getRoomName() + "}");
			}
		}
		message += " from here.";
		message += " Where would you like to? Please enter the room name.";
		return message;
	}
}
