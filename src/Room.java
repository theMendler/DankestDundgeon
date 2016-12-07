public class Room 
{
	private String roomName;
	private String roomDesc;
	private Room[] exit;
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
		Room[] exit = new Room[4];
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
	public String printExits()
	{
		String message;
		message = "You can go to: ";
		for(Room rooms: exit)
		{
			if(rooms!=null) {
				System.out.println("{" + rooms.getRoomName() + "}");
			}
		}
		message += " from here.";
		message += " Where would you like to? Please enter the room name.";
		return message;
	}
}
