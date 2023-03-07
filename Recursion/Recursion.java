package Recursion;
import Utilities.ScanData;
import Utilities.Separator;

public class Recursion extends Thread {
  ScanData sc = new ScanData();
  Separator sp = new Separator();

  public void run() {
    System.out.println("We are going to calculate the power of a number");

    sp.separator();

    // Asking the user if he wants to make another power calculation. If he does, it will ask for the
    // number and the exponent. If he doesn't, it will exit the program.
    while(true) {
      System.out.print("Enter the number: ");
      int num = Integer.parseInt(sc.scanData());
      System.out.print("Enter the expo of that number: ");
      int exp = Integer.parseInt(sc.scanData());
      
      int res = powerOf(num, exp);
      System.out.println("Result: "+res);

      System.out.print("Want to make another power calculation? (y/n): ");
      String wantToContinue = sc.scanData().toLowerCase();

      if(wantToContinue == "n") {
        System.out.println("Bye bye, see yaa!");
        System.exit(0);
        break;
      } else {
        System.out.println("Okei");
      }

      sp.separator();
    }
  }

/**
 * "If the exponent is 0, return 1, otherwise return the number multiplied by the number to the power
 * of the exponent minus 1."
 * 
 * This is a recursive function because it calls itself
 * 
 * @param num The number to be raised to the power of exp
 * @param exp the exponent
 * @return The value of the number raised to the power of the exponent.
 */
  public static int powerOf(int num, int exp) {
    if(exp == 0) return 1;
    return num*powerOf(num, exp-1);
  }
}