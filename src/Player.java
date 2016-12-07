public class Player 
{
	private String playerName;
	private int playerHP;
	private int playerMaxHP;
	private int playerAtt;
	private Armor playerArmor;
	private Armor playerShield;
	
	public Player(String name, int hp, int att, Armor armor)
	{
		playerName = name;
		playerMaxHP = hp;
		playerHP = playerMaxHP;
		playerAtt = att;
		playerArmor = armor;
	}
	public int attack()
	{
		return playerAtt;
	}
	public void takeDamage(int dam)
	{
		playerHP = playerHP - (dam - playerArmor.block() - playerShield.block());
	}
	public int getPlayerHP()
	{
		return playerHP;
	}
	public int getMaxHP()
	{
		return playerMaxHP;
	}
	public void heal(Item item) {playerHP += item.getHealth();}
	public void equip(Armor item) {playerShield = item;}
}
