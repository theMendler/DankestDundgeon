
public class Armor extends Item 
{
	private int armorDef;
	
	public Armor(String name, int def,int hp)
	{
		super(name, hp);
		armorDef = def;
	}
	public int block()
	{
		return armorDef;
	}
}
