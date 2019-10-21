package PayrollSystem;

public class PayrollDriver {
	public static void main(String[] args){	
		PayrollSystem payroll = new PayrollSystem();
		
		
		payroll.addEmployee("E00010", "Stan", 10, 100);
		payroll.addEmployee("E00013", "Maria", 5, 500);
		payroll.addEmployee("E00002", "Harvey", 11, 80);
		payroll.addEmployee("E00056", "Alisa", 13, 30);
		payroll.addEmployee("E00043", "Stanley", 21, 60);
		payroll.printPaycheck();
		
		//Removing the first person in the list now. 
		payroll.removeEmployee("E00010");
		
		System.out.println();
		System.out.println("Look for employee with ID E00010 and remove them, then print paychecks, please.");
		payroll.printPaycheck();
		
		System.out.println();
		System.out.println("Look for employee with ID E00013 and print their paycheck, please.");
		//Printing single Employee paycheck based on ID number. 
		payroll.printSingleCheck("E00013");
		
		
	}
	
}
