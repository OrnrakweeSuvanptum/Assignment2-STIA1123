import java.util.Scanner;

public class CustomerRegistration extends EventDescription {     //2.1 Inheritance
	
	Scanner sc = new Scanner(System.in);    //to answer question 1.2 Pre-Define Class for using Scanner        
	
	private String CustName, IdentityNumber, Email;
	private int Package;

	
	CustomerRegistration(){										
		
		System.out.print("Please Enter Your Name : ");
		this.CustName = sc.nextLine();
		System.out.print("Please Enter Your Identity Number :");
		this.IdentityNumber = sc.nextLine();
		System.out.print("Please Enter Your Email :");
		this.Email = sc.nextLine();
			
	}
	
	public void printInfo() {   //2.2 Polymorphism of method printInfo
		super.printPackacge1();
		super.printPackage2();
	}
	
	public Integer choosePackage() {
		System.out.print("Please choose Package: ");
		this.Package = sc.nextInt();
		if(Package == 1) {
			super.calPackage1Price();
		}
		else if(Package == 2) {
			super.calPackage2Price();
		}
		return this.Package;
	}
	
	public double calTotalPrice() {   
			 System.out.print("Enter package price after plus deposit: RM");
			 this.price = sc.nextDouble();
			 discount = this.price*super.discount();
			 System.out.println("Discount: RM" + discount);
			 totalPrice = this.price-(this.price*super.discount());
			 System.out.println("Total Price after discount: RM" + totalPrice);
			 return this.totalPrice;
		 
	}
	
	public String getCustName() {	//Encapsulation getter method
		return this.CustName;
	}
	
	public String getIdentityNumber() {		//Encapsulation getter method
		return this.IdentityNumber;
	}
	
	public String getEmail() {		//Encapsulation getter method
		return this.Email;
	}
	
	
}