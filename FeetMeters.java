import java.util.*;
	public class FeetMeters {
 	 public static void main(String[] args) {

 	 	Scanner kb = new Scanner (System.in);
 	 	System.out.println("Please enter the unit you want to convert from meters to feet");
 	 	double meter = kb.nextInt();
 	 	double conversion;

 	 	double feet = 3.28084;
 	 	conversion = meter * feet;

 	 	System.out.println(meter + " meter is equal to " + conversion);
 	 }

}