public class customer {
		private String fName;
		private String lName;
		private String phone;
		private String email;
		private String bankAccount;
		private String carType;
		private String carCode;
		private double carPrice;
		private String garagePhone;

		public customer(){}
		public customer(String f, String l, String p, String e, String ba,
				String t, String c, double d, String gp){
			this.fName=f; 	this.lName=l;	this.email=e;	
			this.phone=p; this.bankAccount=ba;
			this.carCode=c; this.carPrice=d; this.carType=t; this.garagePhone=gp;	
			}
		public String getFullName(){return this.fName +" "+lName;}
		public String getPhone(){return this.phone;}
		public String getEmail(){return this.email;}
		public String getBankAccount(){return this.bankAccount;}
		
		public String getCarType(){	return this.carType;}
		public String getCarCode(){	return this.carCode;}
		public double getCarPrice(){return this.carPrice;}
		public String getGaragaPhone(){	return this.garagePhone;}
	}