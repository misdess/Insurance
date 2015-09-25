/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mis Dess
 */
public class customerTest {
    
    public customerTest() {
    }
    @Test 
 public void testcustomer(){
	  customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
	 assertEquals("mis des", p.getFullName());}
 
         public void testGetPhone(){
         customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
	 assertEquals("123", p.getPhone());}
         
         public void testEmail(){
         customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
	 assertEquals("misdess@", p.getEmail());}
         
         public void tsetBankAccount(){
           customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");   
	 assertEquals("5432", p.getBankAccount());}

         public void tsetCarType(){
         customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
         assertEquals("volvo", p.getCarType());}
	 
         
         public void testCarCode(){
          customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
         assertEquals("Se34", p.getCarCode()); }
         
         public void testCarPrice(){
        customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
        assertEquals(2000, p.getCarPrice(),0);}
         
	public void testGaragePhone(){
        customer p= new customer("mis","des","123","misdess@","5432", "volvo","Se34",2000,"321");
         assertEquals("321", p.getGaragaPhone());}
 
}
