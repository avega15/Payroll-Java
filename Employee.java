package PayrollSystem;

public class Employee {
	String id;
	String name;
	double wage;
	double hours;
	public String setID;
	static double pay;
	
	
	public Employee(String idIn, String nameIn, double wageIn, double hoursIn){
		id = idIn;
		name = nameIn;
		wage = wageIn;
		hours = hoursIn;
	}

	public void setID(String idIn){
		id = idIn;
	}
	
	public void setName(String nameIn){
		name = nameIn;
	}
	
	public void setWage(double wageIn){
		wage = wageIn;
	}
	
	public void setHours(double hoursIn){
		hours = hoursIn;
	}
	
	public static double calcPay(double wageIn, double hoursIn){
		pay = wageIn * hoursIn;
		return pay;
	}
	public String toString(){
		return id;
	}
	
}
