package prob1;
import java.lang.Math; 
public class BasketballPlayer extends Object{
	//  Instance variable, only available inside this class.
	private int freeThrowsAttempted;
	private int freeThrowsMade;
	private String name;
	private int threePointersAttempted;
	private int threePointersMade;
	private int twoPointersAttempted;
	private int twoPointersMade;
	boolean isMade = false;
	//getters returning values
	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}

	public int getFreeThrowsMade() {
		return freeThrowsMade;
	}

	public String getName() {
		return name;
	}

	public int getThreePointersAttempted() {
		return threePointersAttempted;
	}

	public int getThreePointersMade() {
		return threePointersMade;
	}

	public int getTwoPointersAttempted() {
		return twoPointersAttempted;
	}

	public int getTwoPointersMade() {
		return twoPointersMade;
	}

	
	//constructor
	public BasketballPlayer(String name) {
		super();
		this.name = name;
	}

	public double getFreeThrowPercent() {
		double freeThrowPercent = 0;
		//if isMade is true, then increments the number of free throws made.
		if (getFreeThrowsMade() > 0) {
			//convert to double because of integer division
			freeThrowPercent = ((double)getFreeThrowsMade() / (double)getFreeThrowsAttempted()) * 100;
		}
		return freeThrowPercent;
		
	}
	public void shootFreeThrow(boolean isMade) {
		//Increments the number of free throws attempted
		freeThrowsAttempted++;
		if(isMade) {
			freeThrowsMade++;
		}
		
	}
	public double getThreePointerPercent() {
		double threePointerPercent = 0;
		//if isMade is true, then increments the number of three pointers made.
		if (getThreePointersMade() > 0) {
			//convert to double because of integer division
			threePointerPercent = ((double)getThreePointersMade() / (double)getThreePointersAttempted()) * 100;
		}
		return threePointerPercent;
	}
	public void shootThreePointer(boolean isMade) {
		//Increments the number of three pointers attempted
		threePointersAttempted++;
		if(isMade) {
			threePointersMade++;
		}
}
	public double getTwoPointerPercent() {
		double twoPointerPercent = 0;
		//if isMade is true, then increments the number of two pointers made.
		if (getTwoPointersMade() > 0) {
			//convert to double because of integer division
			twoPointerPercent = ((double)getTwoPointersMade() / (double)getTwoPointersAttempted()) * 100;
		}
		return twoPointerPercent;
	}
	public void shootTwoPointer(boolean isMade) {
		//Increments the number of two pointers attempted
		twoPointersAttempted++;
		if(isMade) {
			twoPointersMade++;
		}
}
	

  public int getTotalPoints() { int getTotalPoints = 0; getTotalPoints =
  getFreeThrowsMade() +(getTwoPointersMade()*2) + (getThreePointersMade()*3);
  return getTotalPoints;
  
  }

@Override
public String toString() {
	
	return "  Player:" + getName() + ",  points:" + getTotalPoints() + "\n"
			+ "    Free Throws: made:" + getFreeThrowsMade() + ", attempted:" + getFreeThrowsAttempted() + ", percent:" + Math.round(getFreeThrowPercent()* 10.0) / 10.0 + "\n"
			+ "     2 Pointers: made:" + getTwoPointersMade() + ", attempted:" + getTwoPointersAttempted() + ", percent:" + Math.round(getTwoPointerPercent()* 10.0) / 10.0 + "\n"
			+ " Three Pointers: made:" + getThreePointersMade() + ", attempted:" + getThreePointersAttempted() + ", percent:" + getThreePointerPercent() + "\n";
			
	
}
  
 
}
