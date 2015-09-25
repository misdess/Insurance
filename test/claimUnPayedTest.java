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
public class claimUnPayedTest {
    
 @Test
 public void testGarageAccount(){
     claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	 assertEquals("242", c.getGarageAccount());}
 @Test 
 public void testGetGaragePhone(){
     claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	 assertEquals("423", c.getGaragePhone()); }
 @Test
 public void testGetDate(){
     claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	 assertEquals("23/10/2014", c.getDate());}
 @Test
 public void testGetPlace(){
    claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	 assertEquals("Mekelle", c.getPlace());}
 @Test
 public void testGetPlate(){
     claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	 assertEquals("Tig23", c.getPlate());}
 @Test
 public void testGetSSN(){
    claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
     assertEquals("432", c.getSSN());}
 
 @Test
 public void testGetName(){
     claimUnPayed c = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	 assertEquals("mis", c.getName());}
}
   