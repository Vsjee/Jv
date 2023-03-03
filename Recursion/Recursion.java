package Recursion;
import Utilities.ScanData;
import Utilities.Separator;

public class Recursion extends Thread {
  ScanData sc = new ScanData();
  Separator sp = new Separator();

  public void run() {
    System.out.println("We are going to calculate the power of a number");

    sp.separator();

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

  public static int powerOf(int num, int exp) {
    if(exp == 0) return 1;
    return num*powerOf(num, exp-1);
  }
}