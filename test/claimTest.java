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
public class claimTest {
   @Test 
  public void testGetType(){
         claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);

         assertEquals("Simple", c.getType());
 }
  @Test
  public void testGetCost(){
   claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);
         assertEquals(342, c.getCost(), 0);}
  @Test
  public void testGetState(){
   claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);
         assertEquals("registered",c.getState());}
  @Test
  public void testDate(){
  claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);
	 assertEquals("23/10/2014", c.getDate());}
  @Test
  public void testGetPlace(){
  claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);
	 assertEquals("Mekelle", c.getPlace());}
  @Test
  public void testGetPlate(){
   claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);
    assertEquals("Tig23", c.getPlate());}
  
  @Test
  public void testGetName(){
  claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 0);
	 assertEquals("mis", c.getName());}
  @Test
  public void testGetSSN(){
  claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple",0);
	 assertEquals("432", c.getSSN());}
  
    @Test
    public void testGetCount(){
         claim c = new claim("mis", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple",0);
	 assertEquals(0, c.getCount());}
    
}
