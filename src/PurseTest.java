import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;


public class PurseTest {
	
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
	
	
	
	

}
