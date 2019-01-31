package stub;

import java.util.ArrayList;

import service.Salary;

public class SalaryStub implements Salary {

	public ArrayList<Integer> returnSalaries() {
		
		
		ArrayList<Integer> salaries = new ArrayList<Integer>();
		
		salaries.add(100000);
		salaries.add(50000);
		salaries.add(75000);
		salaries.add(20000);
		salaries.add(30000);
		salaries.add(10000);
		
		return salaries;
	}

}
