
public class Armor extends Item 
{
	private int armorDef;
	
	public Armor(String name, int def,int hp)
	{
		super(name, hp);
		this.armorDef = def;
	}
	//Used for lowering damage the player takes in the .takeDamage() method
	public int block()
	{
		return armorDef;
	}
}
