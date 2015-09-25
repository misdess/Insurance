/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mis Dess
 */
public class paymentHistoryTest {
    
 @Test
 public void testAmount(){
	 paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals(52, c.getAmount(),0);} 
 @Test
 public void testGarageAccount(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("242", c.getGarageAccount());}
 @Test 
 public void testGetGaragePhone(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("423", c.getGaragePhone()); }
 @Test
 public void testGetDate(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("23/10/2014", c.getDate());}
 @Test
 public void testGetPlace(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("Mekelle", c.getPlace());}
 @Test
 public void testGetPlate(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("Tig23", c.getPlate());}
 @Test
 public void testGetSSN(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
     assertEquals("432", c.getSSN());}
 
 @Test
 public void testGetName(){
     paymentHistory c = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
	 assertEquals("mis", c.getName());}
}
   