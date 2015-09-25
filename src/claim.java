public class claim{
	 private String name, ssn, plate, place, date, state, type;
         private double  damageCost;
         int count=0;
	 public claim(){}
	 public claim(String na, String ss, String p, String pl, String d, String s, double cost, String ty, int cou){
		 this.name=na; this.ssn=ss; this.plate=p; this.place=pl;this.date=d; this.state=s; this.count=cou;
                 this.damageCost=cost;this.type=ty;
	 }
	 public String getName(){return this.name; }
	 public String getSSN(){return this.ssn;	 }
	 public String getPlate(){return this.plate;	 }
	 public String getPlace(){return this.place;}
	 public String getDate(){return this.date;}
         public String getState(){return this.state;}
         public double getCost(){return this.damageCost;}
         public String getType(){return this.type;}
         public int getCount(){return this.count;}
         public void incrmentCont(){this.count++;}
         
         public void setDamageCost(double d){this.damageCost=d;}
         public void setState(String s){this.state=s;}
         public void setType(String ty){this.type=ty;}
         
        }
