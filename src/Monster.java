
public class Monster 
{
	private String monsterName;
	private int monsterHP;
	private int monsterAtt;
	private String monsterDesc;
	private String monsterAttDesc;

	public Monster(String name, int hp, int att)
	{
		monsterName = name;
		monsterHP = hp;
		monsterAtt = att;
	}
	public int getHP()
	{
			return monsterHP;
	}
	public void takeDamage(int dam)
	{
		monsterHP= monsterHP-dam;
	}
	public int attack()
	{
		return monsterAtt;
	}
	public void setDescription(String desc)
	{
		monsterDesc = desc;
	}
	public void setAttackDescription(String desc)
	{
		monsterAttDesc = desc;
	}
	public String getAttackDescription()
	{
		return monsterAttDesc;
	}
	public String getDescription()
	{
		return monsterDesc;
	}
	public String getMonsterName() {return monsterName;}
}
