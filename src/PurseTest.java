import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;


public class PurseTest extends TestCase {
	
	private Purse p1;
	private Purse p2;
	private String quarter = "Quarter";
	private String dime = "Dime";
	private String nickel = "Nickel";
	private String penny = "Penny";
	
	@Before
	public void setup()
	{
		p1 = new Purse();
		ArrayList<String> input = new ArrayList<String>(Arrays.asList("Quarter", "Dime","Nickel","Quarter"));
		p2 = new Purse(input);
		
	}

	@Test
	public void test() {
		assertEquals("Make sure your format is exactly as described in the toString", "Purse[Quarter,Dime,Nickel,Quarter]", p2.toString());
		assertEquals("Empty purse should still have a valid toString","Purse[]", p1.toString());
	}
	
	@Test
	public void testAddCoin() {
		p1.addCoin(quarter);
		assertEquals("Purse should now .equals \"Purse[Quarter]\" ", "Purse[Quarter]", p1.toString());
		p1.addCoin(dime);
		assertEquals("Purse should now .equals \"Purse[Quarter,Dime]\" ", "Purse[Quarter,Dime]", p1.toString());
		p1.addCoin(penny);
		assertEquals("Purse should now .equals \"Purse[Quarter,Dime,Penny]\" ", "Purse[Quarter,Dime,Penny]", p1.toString());
		p1.addCoin(nickel);
		assertEquals("Purse should now .equals \"Purse[Quarter,Dime,Penny,Nickel]\" ", "Purse[Quarter,Dime,Penny,Nickel]", p1.toString());
		
	}
	public void testToString(){
		p2.toString();
		assertEquals("Purse should be displayed as a string.","Quarter,Dime,Nickel,Quarter",p2.toString());
	}
	
	public void testReverse (){
		p2.reverse();
		p2.toString();
		assertEquals("Purse contents should be reversed and now .equals \"Purse[Quarter,Nickel,Dime,Quarter]\"","Purse[Quarter,Dime,Nickel,Quarter]",p2.toString());
	}
	public void testTransfer(){
		p1.transfer(p2);
		p1.toString();
		assertEquals("Purse contents are transfered from p2 to p1 and now p1 now .equals \"Purse[Quarter,Dime,Nickel,Quarter]\"","P2 Purse[Quarter,Dime,Nickel,Quarter]",p1.toString());
	}
	public void testSameContents(){
		p1.sameContents(p2);
		assertEquals("Tests if two purses, p1 and p2, are equal and now .equals \"True","Purse[Quarter,Dime,Nickel,Quarter]",p1.toString());
	}
	public void testSameCoins(){
		p1.sameCoins(p2);
		assertEquals("Tests if two purses have same coins and now .equals \"True","Purse[Quarter,Dime,Nickel,Quarter]",p1.toString());
	}
	
	
	
	

}
