package prob1;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Employee extends Object{
	private double[] hours = new double[7];
	private String name;
	private double payRate;
	private int day; 
	//constructor
	public Employee(String name, double payRate) {
		super();
		this.name = name;
		this.payRate = payRate;
	}
    //getters
	public double getHours(int day) {
		return hours[day];
	}

	public void setHours(int day, double hours) {
		this.hours[day] = hours;
	}
	public String getName() {
		return name;
	}

	public double getPayRate() {
		return payRate;
	}
	
	
	public int getNumDaysWorked() {
		int numDaysWorked = 0;
		for(int i = 0; i < hours.length;i++) {
			if(hours[i] > 0) {
			numDaysWorked++ ;}
			}
		return numDaysWorked;
	}
	public double getTotalHours() {
		double totalHours = 0;
		for(int i = 0; i < hours.length;i++) 
			totalHours += hours[i];
		return totalHours;
	}
	public double getWeekdayHours() {
		double weekdayHours = 0;
		for(int i = 0; i < hours.length;i++) 
			if(i >= 0 && i <= 4)
				weekdayHours += hours[i];
		return weekdayHours;
	}
	public double getWeekendHours() {
		double weekendHours = 0;
		for(int i = 0; i < hours.length;i++) 
			if(i > 4)
				weekendHours += hours[i];
		return weekendHours;
	}
	public void newWeek() {
		for(int i = 0; i < hours.length;i++) 
			hours[i] = 0;
	}
	public void mergeEmployee(Employee e) {
		for(int i = 0; i < hours.length;i++) 
			hours[i] += e.hours[i];
	}
	public double getPay() {
		double pay = 0; 
		double bonus = 50.0;
		double overtime = 0;
		if(getWeekdayHours() > 0 && getWeekdayHours() <= 40) {
		pay = getWeekdayHours() * payRate;
		}
		if(getWeekdayHours() > 40) {
			overtime = (getWeekdayHours() - 40) * 1.5 * payRate;
			pay += overtime + 1000; // $1000 is flat rate for 40hours
		}
	    if (getWeekendHours() > 0 ) {
			pay +=  getWeekendHours() * payRate * 2;
		}
		if(getNumDaysWorked() == 7) {
	    	pay += 50;
	    }
	    	
		return pay;
	}
	public String toString() {
		DecimalFormat formatter = new DecimalFormat("#0.00");// for 2 decimal places formating
		return "Pay Stub\r\n" + 
				" --------\r\n" + 
				"Name:" + getName() +  ", Pay Rate $" + formatter.format(getPayRate()) + "\r\n" + 
				" Hours:Mon: " + formatter.format(hours[0]) + " Tue:" + formatter.format(hours[1]) + " Wed:" + formatter.format(hours[2]) + " Thu:" + formatter.format(hours[3]) +
				" Fri:" + formatter.format(hours[4]) + " Sat:" + formatter.format(hours[5]) + " Sun:" + formatter.format(hours[6]) + "\r\n" + 
				" Days worked: " + getNumDaysWorked() + ", Total Hours:" + formatter.format(getTotalHours()) +"\r\n" + 
				" Weekday hours:"+ formatter.format(getWeekdayHours()) + ", Weekend hours:" + formatter.format(getWeekendHours()) + "\r\n" + 
				" Total pay: $" + formatter.format(getPay());
				
	}

}
