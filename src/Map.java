public class Map 
{
	public Room currentRoom;
	private Room nextRoom;
	private Room[] allRooms;
	
	public Map(Room start)
	{
		currentRoom = start;
		allRooms = new Room[20]; //Room count subject to change
	}
	
	public static Room getCurrentRoom()
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
}
