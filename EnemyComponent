/*
 *The Enemy class creates enemy objects for the players to destroy 
 *@author Haiming Gao, Patrick Kwon, Allen Wu
 *Date: 05-25-15
 *Period: 3
 */ 


import java.awt.Rectangle;


public class Enemy {

	private int health;
	private int dmg;
	private int money;
	private int speed;
	private Rectangle en;
	private int initx;
	private int inity;
	private int x;
	private int y;
	
	
	/**Creates a new Enemy object with the given health, damage, speed, and money
	 *@param health the given health for the enemy
	 *@param dmg the given damage enemy can give to player
	 *@param speed the given speed of the enemy's movement
	 *@param money the given money value of the enemy
	 */
    public Enemy(int health, int dmg, int speed, int money)
    {
    	this.health = health;
    	this.dmg = dmg;
    	this.money = money;
    	this.speed = speed;
    	createLocation();
    	en = new Rectangle(initx,inity, 30, 30); 
        
    }
    
    
    /**Returns the money value of the enemy
     *@return the money value of the enemy
     */
    public int getMoney()
    {
    	return money;
    }
    
    
    /**Checks to see if the enemy is dead
     *@return whether the enemy is dead
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
    
    
    /**Returns the damage amount that the enemy can give to the player
     *@return the damage amount that the enemy can give to the player
     */
    public int getDmg()
    {
    	return dmg;
    }
    
    /**Returns the enemy's health
     *@return the health value of the enemy
     */
    public int getHealth()
    {
    	return health;
    }
   
    
    /**Updates the enemy's health after the enemy is clicked and damaged
     */
    public void changeHealth(int dmg)
    {
    	health = health - dmg;
    }
    
    
    /**Creates a random location for the enemy to be created in 
     */
    public void createLocation()
	{
		int num = (int) (Math.random() * 2) + 1;
		int num2 = (int) (Math.random() * 2) + 1;
		if(num == 1)
		{
			if(num2 == 1)
			{
				initx = 0;
			}
			else
			{
				initx = 600;
			}
			inity = (int)(Math.random() * 600);
		}
		else if(num == 2)
		{
			if(num2 == 1)
			{
				inity = 0;
			}
			else
			{
				inity = 600;
			}
			initx = (int)(Math.random() * 600);
		}
		x = initx;
		y = inity;
	}
	
	
	/**Returns the x coordinate of the enemy
	 *@return enemy's x coordinate
	 */
	public int getInitX()
   {
   	return initx;
   }
   
   /**Returns the y coordinate of the enemy
	 *@return enemy's y coordinate
	 */
   public int getInitY()
   {
   	return inity;
   }
   
   /**sets location of enemy as it moves towards the center
	 *Calculates positions needed to place in center
	 */
   public void moveToCenter()
   {
   	 int center = 300;
     int diffX = center - initx;
   	 int diffY = center - inity;
     int increX = diffX/80;
     int increY = diffY/80;
     	x = x + increX;
   	    y = y + increY;
   	 en.setLocation(x,y);
	
   }
   
   /**Return the rectangle of the enemy
	 *@return Rectangle of the enemy
	 */
   public Rectangle getRect()
   {
   	return en;
   }
   
}
