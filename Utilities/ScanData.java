package Utilities;
import java.util.Scanner;

public class ScanData {
  Scanner sc = new Scanner(System.in);

/**
 * It returns the next line of input from the user
 * 
 * @return The next line of input from the user.
 */
  public String scanData() {
    return sc.nextLine();
  }
}
