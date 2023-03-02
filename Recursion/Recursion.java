package Recursion;
import Utilities.ScanData;

public class Recursion extends Thread {
  public void run() {
    ScanData sc = new ScanData();
    System.out.println("We are going to calculate the power of a number");

    while(true) {
      System.out.print("Enter the number: ");
      int num = Integer.parseInt(sc.scanData());
      System.out.print("Enter the expo of that number: ");
      int exp = Integer.parseInt(sc.scanData());
      
      int res = powerOf(num, exp);
      System.out.println(res);

      System.out.print("Want to make another power calculation? (y/n): ");
      String wantToContinue = sc.scanData().toLowerCase();

      if(wantToContinue == "n") {
        System.out.println("Bye bye, see yaa!");
        System.exit(0);
        break;
      } else {
        System.out.println("Okei");
      }
    }
  }

  public static int powerOf(int num, int exp) {
    if(exp == 0) return 1;
    return num*powerOf(num, exp-1);
  }
}