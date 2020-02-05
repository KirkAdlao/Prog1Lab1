import java.util.Scanner;
public class rectangle {

  public static void main (String [] args) { 
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter the width");
    double width = sc.nextDouble();

    System.out.println("Enter the length");
    double length = sc.nextDouble();

   double perimiter = (2 * length + 2 * width);
   System.out.println("perimiter of the rectangle is" + perimiter);

   double area = (length * width);
   System.out.println("area of the rectangle is " + area);

    }
}
