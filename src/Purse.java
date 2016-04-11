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
		for(int i = purse.coins.size();i>0;i--){
			purse.coins.add(coins.get(i-1));
		}
		for (int j=0; j < purse.coins.size()/2;j++){
			purse.coins.remove(j);
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
		for (int k=0; k < other.coins.size(); k++){
			purse.coins.add(other.coins.get(k));
			other.coins.remove(k);
		}
		
	}
	
	/*
	 * Checks whether the other purse has the same coins in the same order 
	 * 
	 */
	public boolean sameContents(Purse other) 
	{
		int count1 = 0;
		if (other.coins.size()==purse.coins.size()){
			for (int i=0; i<other.coins.size();i++){
				if (other.coins.get(i)!=purse.coins.get(i)){
					return false;
				} else {
					count1 += 1;
				}
			}
			if (count1>=purse.coins.size()){
				return true;
			}
			
		}
		else{
			return false;
		}
		
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
		if (purse.coins.size()==other.coins.size()){
			int count = 0;
			for (int i=0; i<other.coins.size();i++){
				for (int j=0; j<purse.coins.size();j++){
					if (other.coins.get(i)==purse.coins.get(j)){
						count += 1;
					}
				}
			}
			if (count==purse.coins.size() || count > purse.coins.size()){
				return true;
			} else {
				return false;
			}
		}
		return false; 
	}
	
	
	

}
