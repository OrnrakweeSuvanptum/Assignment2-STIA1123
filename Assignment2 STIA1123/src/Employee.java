import java.util.Scanner;
public class Employee { 
	
	Scanner sc = new Scanner(System.in);           //to answer question 1.2 Pre-Define Class for using Scanner
	
	 private String name, shift, position;
	 private int StaffID;
	 private double TotalNetSalary;
	 private double tax;
	 
	 Employee(){	      
		 System.out.print("Enter shift: ");
		 this.shift = sc.next();
		 
	 }
	 
	 Employee(String position){            
		 this.position = position;
	 }
	 
	 Employee(String name, int StaffID){	   
		 
		 this.name = name;
		 this.StaffID = StaffID;
	 }
	 
	public void printInfo() {    //2.2 Polymorphism of method printInfo
		
		int workHours;
		double wagesPerHours, NumberOfDaysWork, TotalSalary, TotalNetSalary;
		double tax = 0.05;
		
		System.out.print("Enter wages per hours: RM");
		wagesPerHours= sc.nextDouble();
		System.out.print("Enter work hours per day: ");
		workHours = sc.nextInt();
		System.out.print("Enter NumberOfDaysWork: ");
		NumberOfDaysWork=sc.nextDouble();
		TotalSalary=((wagesPerHours*workHours)*NumberOfDaysWork);
		System.out.printf("Your TotalSalary : RM%.2f\n",TotalSalary);
		TotalNetSalary = TotalSalary - (TotalSalary*tax);
		System.out.printf("Your TotalNetSalary: RM%.2f\n",TotalNetSalary);
	}
	
	public double Salary() {
		printInfo();
		return this.TotalNetSalary;
	}
	
	//2.3 Encapsulation getter method
	 public String getName() {		
	        return this.name;
	    }
	 
	 public String getShift() {		
		 	return this.shift;
	 }
	 
	 public String getPosition() {		
		 return this.position;
	 }
 
	 public Integer getStaffID() {		
	        return this.StaffID;
	    }
	 
	 public double getTax() {		
		 return this.tax;
	 }
	 

} 
