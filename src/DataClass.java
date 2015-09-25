
public class DataClass {
   static DataClass claimant = new DataClass();
	
	//authentication table
	static DataClass.user user1=claimant.new user("misganu","misdess");
	static user user2=claimant.new user("melat","melu");
	static user user3=claimant.new user("tajebe","taj");
	static user userTable[]={user1, user2, user3};
        
        static claim c1=new claim("misganu", "432", "Tig23", "Mekelle", "23/10/2014", "registered" ,342,"Simple", 1);
        static claim c2=new claim("taj", "432", "Tig", "Mekelle", "23/10/2014", "registered" ,342,"Simple",2);
        static claim  book[] = new claim[12];    
        static claim [] claimTable= {c1, c2};
        
         static paymentHistory ph1 = new paymentHistory("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242",52);
         static paymentHistory ph2 = new paymentHistory("taj", "432", "Tig", "Mekelle", "23/10/2014","423", "242",52);
         static  paymentHistory [] phTable = {ph1, ph2};
       // static 
	
	//claimant table		
	static customer p1 = claimant.new customer("misganu", "dessalegn", "1", "11", "muruts@kth.se", "111", "volvo", "Se11", 1000, "1111");
	static customer p2 = claimant.new customer("tajebe", "dessalegn", "2", "22", "tajebe@kth.se", "222", "Toyota","Se22", 2000, "2222");
	static customer p3 = claimant.new customer("melat", "anania", "3", "33", "melu@kth.se", "333", "Fiat", "Se33", 3000, "3333");
	static customer customerTable[]={p1, p2,p3}; 
        
        //unPayed decisions
        static claimUnPayed cp1 = new claimUnPayed("misganu", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
	
        static claimUnPayed cp2 = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
        static claimUnPayed cp3 = new claimUnPayed("mis", "432", "Tig23", "Mekelle", "23/10/2014","423", "242");
        static claimUnPayed [] cpTable = {cp1, cp2, cp3};
        /*
       static claim c1= claimant.new claim("john", "19870323-7632", "Se12", "Kista", "12/3/2014", 
                "waiting for decision",2432, "complex");
       static claim [] p=new claim[30];
       p[0]=c1;
*/
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
 
 public class customer {
		private String fName;
		private String lName;
		private String phone;
		private String email;
                private String ssn;
		private String bankAccount;
		private String carType;
		private String carCode;
		private double carPrice;
		private String garagePhone;

		public customer(){}
		public customer(String f, String l, String s, String p, String e, String ba,
				String t, String c, double d, String gp){
			this.fName=f; 	this.lName=l;	this.email=e; this.ssn=s;	
			this.phone=p; this.bankAccount=ba;
			this.carCode=c; this.carPrice=d; this.carType=t; this.garagePhone=gp;	
			}
		public String getFullName(){return this.fName +" "+lName;}
		public String getPhone(){return this.phone;}
		public String getEmail(){return this.email;}
		public String getBankAccount(){return this.bankAccount;}
		public String getSSN(){return this.ssn;}
		public String getCarType(){	return this.carType;}
		public String getCarCode(){	return this.carCode;}
		public double getCarPrice(){return this.carPrice;}
		public String getGaragaPhone(){	return this.garagePhone;}
	}
 public class user{
	 public String uName;
	 public String pword;
	 
	 public user(){};
	 public user(String u, String p){
		 this.uName=u;
		 this.pword=p;
	 }
	 public String getUserName(){return this.uName;}
	 public String getPassword(){return this.pword;}
	 
        }
 /*
 public class claim{
	 private String name, ssn, plate, place, date, state, type;
         private double  damageCost;
	 public claim(){}
	 public claim(String na, String ss, String p, String pl, String d, String s, double cost, String ty){
		 this.name=na; this.ssn=ss; this.plate=p; this.place=pl;this.date=d; this.state=s;
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
         
         public void setDamageCost(double d){this.damageCost=d;}
         public void setState(String s){this.state=s;}
         public void setType(String ty){this.type=ty;}
        }

  */
 /*
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
*/
 
 public class letter{
	String reciever, date, decision;
	public letter(String r, String da, String de){
		this.reciever=r;this.date=da;this.decision=de;}
	
	public String getReceiver(){return this.reciever;}
	public String getDate(){return this.date;}
	public String getDecision(){return this.decision;}
}    
}
