package cmput402.mocking;

import java.util.ArrayList;
import java.util.List;

import service.City;
import service.Salary;

public class Util {

	// Recall superclass can accept/be an subclass, and we implemented the interface as CityStub
	public int filterEdmonton(City city) {
		
		int count = 0;
		//List<String> cities = new ArrayList<String>();

		for (String aCity : city.listCities()) {
			if (aCity.equals("Edmonton")) {
				count++;
			}
		}
		
		return count;
	}
	
	public int numSalaries(Salary salary){
		
		int count = 0;
		for (Integer aSalary : salary.returnSalaries()) {
			if (aSalary > 50000) {
				count++;
			}
		}
		
		return count;
	}
}
