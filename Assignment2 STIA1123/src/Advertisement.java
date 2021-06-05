
public class Advertisement { 
 
	private double costOfAdsPlatform, tax, totalCost;
	
	Advertisement(){                    
		printAdvertisementPlatform();
		printCostOfAdsPlatform();
		printInfo();
	}
	
	public void printAdvertisementPlatform() {    
		
		System.out.println("---Platform for Advertisement---");
		System.out.println("\t1.Television");
		System.out.println("\t2.Social Media:\n"
							+ "\t-Facebook\n"
							+ "\t-Instagram"); 
		System.out.println("\t3.Banner");
		System.out.println("--------------------------------");
		}
	 
	public void printCostOfAdsPlatform() {        
		
		System.out.println("Cost per month");
		System.out.println("1.Television: RM10000\n"
							+ "2.Social Media: RM70\n"
							+ "3.Banner: RM40\n");
	}
	
	public void printInfo() {   //2.2 Polymorphism of method printInfo
		System.out.println("#This Advertisement advertise our package that company provide to the customer\n"
							+ "#Advertise our promotion\n");
		
	}
	public double calCostOfAdsPlatform() {      
		double TelevisionCost, BannerCost, SocMedCost;
		
		TelevisionCost =  10000;
		SocMedCost = 70;
		BannerCost = 40;
		
		costOfAdsPlatform = TelevisionCost+SocMedCost+BannerCost; 
		System.out.println("Cost for advertisment platform per month: RM" + costOfAdsPlatform);
		
		return this.costOfAdsPlatform;
	
	} 
	
	public double calTotalCost() {    
		
		costOfAdsPlatform = 10110;
		tax = 0.05;
		tax = costOfAdsPlatform*tax;
		totalCost = costOfAdsPlatform+tax;
		
		System.out.println("Tax: RM" + tax);
		System.out.println("Total Cost for advertisement per month: RM" +totalCost);
		
		return this.totalCost;
	}
	
	
}
