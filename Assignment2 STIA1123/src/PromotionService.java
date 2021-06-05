

public class PromotionService {    
	
	private String startDate, endDate;
	
	PromotionService(){   
		
		printTypeOfPromotion();
		printInfo();
	}
	
	public void printTypeOfPromotion() {    
		
		System.out.println("---Type Of Promotion---\n"
							+ "\t1.Voucher\n"
							+ "\t2.Cashback Promotion");
		System.out.println("-----------------------");
						
	}
	
	public void printInfo() {   //2.2 Polymorphism of method printInfo    
		 
		System.out.println("1.Voucher: 15% off for 1 package\n"
						   + "2.Cashback Promotion: 10% cashback of 1 purchase\n");
	}
	
	//2.3 Encapsulation setter method
	public void setStartDate(String startDate) {  
		this.startDate = startDate;
	}
	
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	//2.3 Encapsulation getter method
	public String getStartDate() {
		return this.startDate;
	}
	
	public String getEndDate() {
		return this.endDate;
	}
}
