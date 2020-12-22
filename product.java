package prob1;

public class product {
	private int batch;
	private String code;
	private String date;
	private int year;
	private int theMonth;
	private int indexDateBegins;
	private String plant;

	public int getBatch() {
		return batch;
	}

	public String getCode() {
		return code;
	}

	public String getDate() {
		return date;
	}

	public String getPlant() {
		return plant;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		
		return theMonth;
	}

	public product(String code) {
		super();
		
		this.code = code;
		// code can only have either 13, 12 or 11 characters
		if(code.length() == 13) {
			for(int i = 0; i < code.length(); i++) {
				this.plant=code.substring(0, 3);
				this.date = code.substring(3, 5) + "/"+ code.substring(5, 7) + "/" + code.substring(7, 11);
				this.batch = Integer.parseInt(code.substring(11));
				this.year = Integer.parseInt(code.substring(7, 11));
				this.theMonth = Integer.parseInt(code.substring(3, 5));
			}
		}
		if(code.length() == 11) {
			for(int i = 0; i < code.length(); i++) {
				this.plant=code.substring(0, 2);
				this.date = code.substring(2, 4) + "/"+ code.substring(4, 6) + "/" + code.substring(6, 10);
				this.batch = Integer.parseInt(code.substring(10));
				this.year = Integer.parseInt(code.substring(6, 10));
				this.theMonth = Integer.parseInt(code.substring(2, 4));
			}
	}
		//for 12 character check if the 3rd character is a letter 
		if(code.length() == 12) { 
			if(Character.isLetter(code.charAt(2))){
				for(int i = 0; i < code.length(); i++) {
					this.plant=code.substring(0, 3);
					this.date = code.substring(3, 5) + "/"+ code.substring(5, 7) + "/" + code.substring(7, 11);
					this.batch = Integer.parseInt(code.substring(11));
					this.year = Integer.parseInt(code.substring(7, 11));
					this.theMonth = Integer.parseInt(code.substring(3, 5));}
				
			}
			else { 
				for(int i = 0; i < code.length(); i++) {
					this.plant=code.substring(0, 2);
					this.date = code.substring(2, 4) + "/"+ code.substring(4, 6) + "/" + code.substring(6, 10);
					this.batch = Integer.parseInt(code.substring(10));
					this.year = Integer.parseInt(code.substring(6, 10));
					this.theMonth = Integer.parseInt(code.substring(2, 4));
				}
			}
		}	
	}
	public boolean isAfter2000() {
		
		 if(getYear() >= 2000) {
			 return true;
		 }
		return false;
	}
	public boolean isMonthEqual(int month) {
		if(theMonth == month) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return " code= " + getCode() + ", plant= " + getPlant()+ " , date= " + getDate() + "  , batch=" + getBatch() ;
	}
	
}
