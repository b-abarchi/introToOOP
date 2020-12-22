package prob1;

public class Car extends Object{
	

	private double 	fuelCapacity;
	private double 	fuelEfficiency;
	private double 	fuelLevel;
	private double 	totalDistance;
	private double  time;
	private double  rate;
	
	//getters
	public double getFuelCapacity() {
		return fuelCapacity;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	public double getFuelLevel() {
		return fuelLevel;
	}
	public double getTotalDistance() {
		return totalDistance;
	}
	
	@Override
	public String toString() {
		return "Car [fuelCapacity=" + fuelCapacity + ", fuelEfficiency=" + fuelEfficiency + ", fuelLevel=" + fuelLevel
				+ "]";
	}

	//constructors
	public Car(double fuelCapacity, double fuelEfficiency, double fuelLevel) {
		super();
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
		this.fuelLevel = fuelLevel;
	}

	public Car(double fuelCapacity, double fuelEfficiency) {
		super();
		this.fuelCapacity = fuelCapacity;
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public void drive(double time, double rate) {
		
 		double distance = 0;
		double fuelRequired = 0;
		distance = time * rate;
		//get the fuel required first
		fuelRequired = distance / getFuelEfficiency();
		if(fuelRequired <= getFuelLevel()) {
			fuelLevel -= fuelRequired ;
			totalDistance += distance; 
		}
		else {
			totalDistance += getFuelLevel() * getFuelEfficiency(); 
			fuelLevel = 0;
		}
	}
	
public void fillUp(double amount) {
	if((fuelLevel + amount)  <= fuelCapacity) {
		fuelLevel += amount;
	}
	else {
		fuelLevel = fuelCapacity;
	}
}
	
}
