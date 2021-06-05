
public abstract class EventDescription implements Payment {    //2.4 Abstraction   //2.5 Implemention interface Payment
	
	protected double price;
	protected double packagePrice;
	protected double discount;
	protected int deposit;
	protected double totalPrice;
	

	public void printPackacge1() {    
		System.out.println("1.Family Package\n"
							+ "-3days 2nights\n"
							+ "-5 members per family\n"
							+ "-1 homestay with breakfast\n"
							+ "-BBQ night\n"
							+ "-Night boat\n"
							+ "-Snorkeling\n"
							+ "-3 Jet Ski\n"
							+ "-Cable car\n"
							+ "-Sunset with dinner\n"
							+ "-Total Price: RM750-\n");
	}
	public void printPackage2() {
		System.out.println("2.Single Package\n"
							+ "-3days 2nights\n"
							+ "-2 persons per package\n"
							+ "-1 single room\n"
							+ "-Snorkeling\n"
							+ "-Jet Ski\n"
							+ "-Night boat fishing\n"
							+ "-Island hopping tour\n"
							+ "-Sunset cycling\n"
							+ "-Total Price: RM400-\n");
		
	}
	
	 public double calPackage1Price() {
		 getPayment();
		 return this.packagePrice;
	 }
	
	 public double calPackage2Price() {
		 packagePrice= 400;
		 System.out.println("Package Price: RM" + packagePrice);
		 deposit = 50;
		 System.out.println("Deposit: RM" + deposit);
		 this.price = packagePrice+deposit;
		 System.out.println("Price: " + this.price); 
		 return this.packagePrice;
	 }
			
	 public double discount() {   
		discount = 0.1;
		return this.discount;
	 }
	 
	 public abstract void printInfo();  //2.4 abstract method
	 
	 public void getPayment() {  //2.5 Implemention interface Payment
		 packagePrice = 700;
		 System.out.println("Package Price: RM" + packagePrice);
		 deposit = 100;
		 System.out.println("Deposit: RM" + deposit);
		 this.price = packagePrice+deposit;
		 System.out.println("Price: RM" + this.price);
	 }
	
}
