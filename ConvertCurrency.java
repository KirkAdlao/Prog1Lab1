import java.util.Scanner;
public class ConvertCurrency {

    public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

          System.out.println("Enter amount of CAD");
             double cad = sc.nextDouble();

            System.out.println("Enter amount of USD");
             double usd = sc.nextDouble();

            System.out.println("Enter amount of EUR");
              double eur = sc.nextDouble();

            double eurvaluecad = cad * 0.68;
              double usdvaluecad = cad * 0.75;

             System.out.println("Your canadian money is equal to" +  eurvaluecad + "€");
             System.out.println("Your canadian money is equal to" +  usdvaluecad + "$USD");

             double eurvalueusd = usd * 0.91;
             double cadvalueusd = usd * 1.33;

             System.out.println("Your US money is equal to " + eurvalueusd + "€");
             System.out.println("Your US money is equal to" + cadvalueusd + "$CAD");

             double usvalueeuro = eur * 1.10;
             double cadvalueeuro = eur * 1.47;

             System.out.println("Your Euro is equal to" + usvalueeuro + "$USD");
             System.out.println("Your Euro is equal to " + cadvalueeuro + "$CAD");
            }
	    }        