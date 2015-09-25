/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mis Dess
 */
public class claimUnPayed {
     private String name, ssn, plate, place, date, garagePhone, garageAccount; 
	 public claimUnPayed(){}
	 public claimUnPayed(String na, String ss, String p, String pl, String d, String gp, String ga){
		 this.name=na; this.ssn=ss; this.plate=p; this.place=pl;this.date=d;this.garagePhone=gp;this.garageAccount=ga;
	 }
	 public String getName(){return this.name; }
	 public String getSSN(){return this.ssn;	 }
	 public String getPlate(){return this.plate;	 }
	 public String getPlace(){return this.place;}
	 public String getDate(){return this.date;}
	 public String getGaragePhone(){return this.garagePhone;}
	 public String getGarageAccount(){return this.garageAccount;}
}