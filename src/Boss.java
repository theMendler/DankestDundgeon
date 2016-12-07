
public class Boss extends Monster
{
	private String specialAttackDescription;
	private int specialAttack;
	public boolean isDead() {
		if(this.getHP() <= 0) {
			return true;
		}
		else {return false;}
	}
	
	public Boss(String name, int hp, int att, int specAttDam)
	{
		super(name, hp, att);
		specialAttack = specAttDam;
	}
	public void setDescription(String desc)
	{
		specialAttackDescription = desc;
	}
	public String getSpecAttDesc()
	{
		return specialAttackDescription;
	}
	public int getSpecAtt()
	{
		return specialAttack;
	}

}
