import java.util.ArrayList;


public class Purse {
	
	//ArrayList that contains the coins 
	private ArrayList<String> coins;
	public Purse purse= new Purse(coins);
	
	//constructor that initializes empty purse 
	public Purse()
	{
	coins = new ArrayList<String>();

	}
	
	//constructor that initializes the purse with the coins passed in
	public Purse(ArrayList<String> coins)
	{
	Purse purse = new Purse (coins);	
	}
	
	/*
	 * Method that adds a specific coin (Quarter, Dime, Nickel, Penny) 
	 * to the current Purse object
	 * @param coinName - the coin to be added to the purse 
	 */
	public void addCoin(String coinName)
	{
	coins.add(coinName);
		
		
	}
	
	/*
	 * Returns the String representation of the purse 
	 * in the format of 
	 * Purse[Quarter,Dime,Nickel,Dime] 
	 * coins are separated by commas and contain no spaces.
	 * The list of coins is surrounded by square brackets 
	 * and is preceded by the word Purse 
	 */
	public String toString()
	{
		if (coins.size()==0){
			return "Purse[]";
		}else{
			String newPurse = "Purse[";
			for (String coin:coins){		
				newPurse = newPurse + coin + ",";
			}
			newPurse=newPurse+"]";
			return newPurse;
			
		}
	}
	
	/*
	 * Reverses the sequence of coins in the purse
	 * For example if reverse is called with a purse
	 * Purse[Quarter,Dime,Nickel,Dime]
	 * then the purse is changed to
	 * Purse[Dime,Nickel,Dime,Quarter]
	 */
	public void reverse()
	{
		ArrayList<String>coinReversed = new ArrayList<String>();
		for(int i = coins.size();i>0;i--){
			coinReversed.add(coins.get(i-1));
		}
	}
	
	/*
	 * Transfer the contents of one purse to another 
	 * For example if a is 
	 * Purse[Quarter,Dime,Nickel,Dime]
	 * and b is 
	 * Purse[Dime,Nickel]
	 * then after the call a.transfer(b), a is 
	 * Purse[Quarter,Dime,Nickel,Dime]
	 * and b is empty 
	 */
	public void transfer(Purse other)
	{

	}
	
	/*
	 * Checks whether the other purse has the same coins in the same order 
	 * 
	 */
	public boolean sameContents(Purse other)
	{
		return false;
	}
	
	/*
	 * checks whether the other purse has the same coins, perhaps in a different order 
	 * For example, the purses 
	 * Purse[Quarter,Dime,nickel,Dime]
	 * and 
	 * Purse[Nickel,Dime,Dime,Quarter]
	 * should be considered equal 
	 * You will probably need one or more helper method 
	 */
	public boolean sameCoins(Purse other)
	{
		return false; 
	}
	
	
	

}
