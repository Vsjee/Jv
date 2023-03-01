package Recursion;

public class Recursion {
  public static int powerOf(int num, int exp) {
    if(exp == 0) return 1;
    return num*powerOf(num, exp-1);
  }
}