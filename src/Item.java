public class Item 
{
	private int health;
	private String itemName;
	private String description;
	
	public Item(String name, int hp)
	{
		health = hp;
		itemName = name;
	}
	
	public void setDescription(String desc)
	{
		description = desc;
	}
	public int getHealth()
	{
		return health;
	}
	public String getItemName()
	{
		return itemName;
	}
	public String getItemDesc()
	{
		return description;
	}
}
