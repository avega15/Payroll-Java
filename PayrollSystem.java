package PayrollSystem;

import java.util.ArrayList;

public class PayrollSystem {
	ArrayList<Employee> employees = new ArrayList<Employee>();
	ArrayList<Paycheck> paychecks = new ArrayList<Paycheck>();
	

	public void addEmployee(String idIn, String nameIn, double wageIn, double hoursIn){
		double pay;
		pay = Employee.calcPay(wageIn, hoursIn);
		
		employees.add(new Employee(idIn, nameIn, wageIn, hoursIn));
		paychecks.add(new Paycheck(idIn, nameIn, pay));
	}
	
	public void removeEmployee(String idIn){
		for(int i = 0; i < employees.size(); i++){
			Employee findID = employees.get(i);
			String id = findID.toString();
			
			if (id == idIn){
				employees.remove(i);
				paychecks.remove(i);
			}
		}
	}
	
	public void printSingleCheck(String idIn){
		for(int i = 0; i < employees.size(); i++){
			Employee findID = employees.get(i);
			String id = findID.toString();
			
			if (id == idIn){
				System.out.println(paychecks.get(i));
			}
		}
	}
	
	public void printPaycheck(){
		System.out.println("Payroll for Ace Peat Moss Inc.:");
		printList(paychecks);
		//paychecks.clear();
	}
	public void printList(ArrayList<Paycheck> list){
		for(int j = 0; j <list.size(); j++){
			System.out.println(list.get(j));
		}

	}

}
