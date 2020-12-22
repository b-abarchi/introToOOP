package prob1;

public class ProductTest {

	/***
	 * YOU SHOULD WRITE THESE TEST METHODS.
	 * 
	 */
	public static void main(String[] args) {
		testProductConstructor_Plant_3chars_Batch_2chars();
		testProductConstructor_Plant_3chars_Batch_1chars();
    	testProductConstructor_Plant_2chars_Batch_2chars();
		testProductConstructor_Plant_2chars_Batch_1chars();
		testIsAfter2000Test_True_Year2019();
		testIsAfter2000Test_True_Year2000();
		testIsAfter2000Test_False_Year1994();
		testIsMonthEqual_True();
		testIsMonthEqual_False();
		testToString();
	}
	
	
public static product buildProduct() {
	product p; 
	p = new product("VLD0204201993");
	return p;
}
public static product buildProduct2() {
	product p; 
	p = new product("SF0404200045");
	return p;
}
public static product buildProduct3() {
	product p; 
	p = new product("VLD041819949");
	return p;
}
public static product buildProduct4() {
	product p; 
	p = new product("SF042719364");
	return p;
}
/***
 * Construct a product where the plant has 3 characters, and the batch has 2.
 * Should show that code, plant, date, and batch are correct.
 */
public static void testProductConstructor_Plant_3chars_Batch_2chars() {
	product p;
    p = buildProduct();
	System.out.println("-->testProductConstructor_Plant_3chars_Batch_2chars()");
	System.out.println("  expected: code=VLD0204201993, plant=VLD, date=02/04/2019, batch=93");
	System.out.println("    Actual: code=" + p.getCode() + ", plant:" + p.getPlant() + ", date:" + p.getDate() + ", batch:=" + p.getBatch() );
}
	/***
	 * Construct a product where the plant has 3 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_3chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_3chars_Batch_1chars()");
		product p;
	    p = buildProduct3();
		System.out.println("  expected: code=VLD041819949, plant=VLD, date=04/18/1994, batch= 9");
		System.out.println("    Actual: code=" + p.getCode() + ", plant:" + p.getPlant() + ", date:" + p.getDate() + ", batch:=" + p.getBatch() );
	
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 2.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_2chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_2chars()");
		product p;
	    p = buildProduct2();
		System.out.println("  expected: code:=SF0404200045, plant=SF, date:=04/04/2000, batch:=45");
		System.out.println("    Actual: code=" + p.getCode() + " , plant:" + p.getPlant() + ", date:" + p.getDate() + " , batch:=" + p.getBatch() );
	}

	/***
	 * Construct a product where the plant has 2 characters, and the batch has 1.
	 * Should show that code, plant, date, and batch are correct.
	 */
	public static void testProductConstructor_Plant_2chars_Batch_1chars() {
		System.out.println("\n-->testProductConstructor_Plant_2chars_Batch_1chars()");
		product p;
	    p = buildProduct4();
		System.out.println("  expected: code:=SF042719364, plant=SF, date:=04/27/1936, batch:=4");
		System.out.println("    Actual: code=" + p.getCode() + " , plant:" + p.getPlant() + ", date:" + p.getDate() + " , batch:=" + p.getBatch() );
	}

	/***
	 * Construct a product where the year is 2019 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2019() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2019()");
		product p;
	    p = buildProduct();
	    System.out.println("  expected: isAfter2000 = true");
		System.out.println("  Actual:   isAfter2000 = " + p.isAfter2000());
	}

	/***
	 * Construct a product where the year is 2000 and then call isAfter2000() which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_True_Year2000() {
		System.out.println("\n-->testIsAfter2000Test_True_Year2000()");
		product p;
	    p = buildProduct2();
	    System.out.println("  expected: isAfter2000 = true");
		System.out.println("    Actual: isAfter2000 = " + p.isAfter2000());
	}

	/***
	 * Construct a product where the year is 1994 and then call isAfter2000() which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsAfter2000Test_False_Year1994() {
		System.out.println("\n-->testIsAfter2000Test_False_Year1994()");
		product p;
	    p = buildProduct3();
	    System.out.println("  expected: isAfter2000 = false");
		System.out.println("    Actual: isAfter2000 = " + p.isAfter2000());
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(2) which should return true.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_True() {
		System.out.println("\n-->testIsMonthEqual_True()");
		product p;
	    p = buildProduct();
	    System.out.println("  expected: isMonthEqual = true");
		System.out.println("    Actual: isMonthEqual = " + p.isMonthEqual(2));
	}

	/***
	 * Construct a product where the month is say, Feb, and then call isMonthEqual(3) which should return false.
	 * Show values to illustrate that return is correct.
	 */
	public static void testIsMonthEqual_False() {
		System.out.println("\n-->testIsMonthEqual_False()");
		product p;
	    p = buildProduct();
	    System.out.println("  expected: isMonthEqual = false");
		System.out.println("    Actual: isMonthEqual = " + p.isMonthEqual(3));
	}
	public static void testToString() {
		product p3;
	    p3 = buildProduct3();
	    product p2;
	    p2 = buildProduct2();
		System.out.println("\n-->testToString()");
		System.out.println(p3);
		System.out.println(p2);
		
	}
}
