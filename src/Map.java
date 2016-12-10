public class Map 
{
	private Room currentRoom;
	private Room nextRoom;
	private Room[] allRooms;
	
	public Map(Room start)
	{
		currentRoom = start;
		allRooms = new Room[20]; //Room count subject to change
	}
	
	public Room getCurrentRoom()
	{
		return currentRoom;
	}
	public Room getNextRoom()
	{
		return nextRoom;
	}
	public Room[] getAllRooms()
	{
		return allRooms;
	}
	public void setCurrentRoom(Room newRoom) {currentRoom = newRoom;}
	public String roomText(Room room)
	{
		String text;
		text = "You come into the " + currentRoom.getRoomName() + ". " + currentRoom.getRoomDesc();
		return text;
	}
	public void moveRooms(String input) //Moves the player to the next desired room
	{
		Room[] list;
		list = currentRoom.getExits();
		for(int i =0; i>=list.length; i++)
		{
			if(list[i].getRoomName()==input)
			{
				nextRoom = list[i];
			}
		}
	}
}
