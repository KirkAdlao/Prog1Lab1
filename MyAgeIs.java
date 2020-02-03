	import java.util.*;
	public class MyAgeIs {
 	 public static void main(String[] args) {

 	 	Scanner kb = new Scanner (System.in);
 	 	System.out.println("Please enter the year of your birth");
 	 	int yearborn = kb.nextInt();

 	 	int currentyear = 2020;
 	 	int age = currentyear - yearborn;

 	 	System.out.println("Your age is " + age);

 	 }

}
