
import org.junit.Test;
import static org.junit.Assert.*;

//import Insurance.default package.*;
public class DataClassTest {
    
    public DataClassTest() {
    }
 
   @SuppressWarnings("deprecation")
@Test 
 public void testcustomer(){
	 DataClass d = new DataClass();
	  customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
	 
	 assertEquals("mis des", p.getFullName());
	 assertEquals("123", p.getPhone());
	 assertEquals("misdess@", p.getEmail());
	 assertEquals("5432", p.getBankAccount());
	 assertEquals("volvo", p.getCarType());
	 assertEquals("Se34", p.getCarCode());
	 assertEquals(2000, p.getCarPrice(),0);
	 assertEquals("321", p.getGaragaPhone());
 }
    
  @Test
 public void testUser(){
	 DataClass d = new DataClass();
         DataClass.user user1= d.new user("mis","dess");
	 assertEquals("mis", user1.getUserName());
	 assertEquals("dess", user1.getPassword());
 }
 
/* public void testClaim(){
         DataClass d = new DataClass();
	 DataClass.claim c = d.new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple");;
	 assertEquals("mis", c.getName());
	 assertEquals("432", c.getSSN());
	 assertEquals("Tig23", c.getPlate());
	 assertEquals("Mekelle", c.getPlace());
	 assertEquals("23/10/2014", c.getDate());
         assertEquals("registered",c.getState());
         assertEquals(342, c.getCost(), 0);
         assertEquals("Simple", c.getType());
 }
 */
 
 /*@Test
 public void testPaymentHistory(){
	 DataClass d = new DataClass();
         DataClass.paymentHistory c = d.new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("mis", c.getName());
	 assertEquals("432", c.getSSN());
	 assertEquals("Tig23", c.getPlate());
	 assertEquals("Mekelle", c.getPlace());
	 assertEquals("23/10/2014", c.getDate());
	 assertEquals("423", c.getGaragePhone());
	 assertEquals("242", c.getGarageAccount());
	 assertEquals(52, c.getAmount(),0);
 }
 */@Test 
public void testLetter(){
    DataClass d = new DataClass();
    DataClass.letter l= d.new letter("mis dess", "10/8/2014","yes");
 assertEquals("mis dess", l.getReceiver());
 assertEquals("10/8/2014", l.getDate());
 assertEquals("yes", l.getDecision());
}

}
