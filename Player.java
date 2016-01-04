/**
 * @(#)Player.java
 * The Player Class stores information about the player including health,damage,money, and name
 *	It checks if the players health is less than 0 and pronounces him dead.
 * @author Haiming Gao 
 * @version 1.00 2015/5/8
 */


public class Player {
	
	//Instance Variables
	private int health;
	private int dmg;
	private int money;
	private String name;
	
	/*
	 *Sets values of default player
	 */
    public Player()
    {
    	health = 5;
    	dmg = 1;
    	money = 0;
    }
    
    /*
	 *@return Health of player;
	 */
    public int getHealth()
    {
    	return health;
    }
    /*
	 *@return Damage of player;
	 */
    public int getDmg()
    {
    	return dmg;
    }
    /*
	 *@return Money of player;
	 */
    public int getMoney()
    {
    	return money;
    }
    /*
	 *@return Name of player;
	 */
    public String getName()
    {
    	return name;
    }
    
    /*
	 *@param Amt of health to remove from player
	 *Removes health from player;
	 */
    public void removeHealth(int loss)
    {
    	health = health-loss;
    }
    /*
	 *@param set health of player to value;
	 */
    public void setHealth(int x)
    {
    	health = x;
    }
    
    /*
	 *@param amount of money added to person
	 */
    public void changeMoney(int change)
    {
    	money = money + change;
    }
    
    /*
	 *@param amount of damage added to player
	 */
    public void changeDamage(int change)
    {
    	dmg = dmg + change;
    }
    
    /*
	 *@param name of the player;
	 */
    public void setName(String name)
    {
    	this.name = name;
    }
    
    /*
	 *@return Whether person is dead or not
	 */
    public boolean isDead()
    {
    	if(health <= 0)
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
