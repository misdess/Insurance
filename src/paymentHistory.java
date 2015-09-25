 public class paymentHistory{
	 private String name, ssn, plate, place, date, garagePhone, garageAccount; double amount;
	 public paymentHistory(){}
	 public paymentHistory(String na, String ss, String p, String pl, String d, String gp, String ga, double am){
		 this.name=na; this.ssn=ss; this.plate=p; this.place=pl;this.date=d;this.garagePhone=gp;this.garageAccount=ga;this.amount=am;
	 }
	 public String getName(){return this.name; }
	 public String getSSN(){return this.ssn;	 }
	 public String getPlate(){return this.plate;	 }
	 public String getPlace(){return this.place;}
	 public String getDate(){return this.date;}
	 public String getGaragePhone(){return this.garagePhone;}
	 public String getGarageAccount(){return this.garageAccount;}
	 public double getAmount(){return this.amount;}
        }