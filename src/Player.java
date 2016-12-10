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
		this.playerName = name;
		this.playerMaxHP = hp;
		this.playerHP = playerMaxHP;
		this.playerAtt = att;
		this.playerArmor = armor;
	}
	public int attack()
	{
		return playerAtt;
	}
	public void takeDamage(Monster monster) //Takes damage from a given monster, minus the player's armor and shield(if they have one)
	{
		playerHP -= (monster.attack() - playerArmor.block() - playerShield.block());
	}
	public int getPlayerHP()
	{
		return playerHP;
	}
	public int getMaxHP()
	{
		return playerMaxHP;
	}
	public void heal(Item item) {playerHP += item.getHealth();} //heals with a given health pot or food item
	public void equip(Armor item) {playerShield = item;} // equips the shield found in the closet upstairs
}
