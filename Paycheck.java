package PayrollSystem;

public class Paycheck {
	double pay;
	String id;
	String name;
	
	public Paycheck (String idIn, String nameIn, double payIn){
		pay = payIn;
		id = idIn;
		name = nameIn;
	}
	public String toString(){
		return "Paycheck for " + pay + " issued to " + id + " " + name;
	}

}
