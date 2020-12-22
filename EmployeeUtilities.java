 package prob1;

public class EmployeeUtilities {

	public EmployeeUtilities() {}
	
	public double getTotalPay(Employee[] emps) {
		double totalPay = 0;
		int i = 0;
		//get the individual pay and add the value together
		  for(i= 0 ; i < 3 ;i++) {
			  totalPay += emps[i].getPay();
		  }
		  return totalPay;
		
	}
	
	public Employee getEmployeeWithMostHours(Employee[] emps) {
		int i = 0;
		double max = 0;
		int index = 0;
		double hours [] = new double[7];
		// find the largest value in the array then return its index
		  for(i= 0 ; i < emps.length ;i++) {
			  hours[i] = emps[i].getTotalHours();
			  if (hours[i] > max) 
	                 max = hours[i];
			          index = i;
			  }
		return emps[index];
	}
	
	public double [] getHoursArray(Employee[] emps) {
		double[] hoursArray = new double[3];
		int i = 0;
		//get the hours and load the values in the hoursArray
		  for(i= 0 ; i < 3 ;i++) {
			  hoursArray[i] = emps[i].getTotalHours();
		  }
		  return hoursArray;
	}
}
