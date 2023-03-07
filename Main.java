import Recursion.Recursion;
import SongTask.SongTask;
import jFrame.Frame;

public class Main {
/**
 * This function creates a new object of the class Recursion, SongTask and Frame and then calls the
 * start method of each class
 */
  public static void main(String[] args) {
    Recursion recursionTask = new Recursion();
    recursionTask.start();

    SongTask songTask = new SongTask();
    songTask.start();

    Frame javaFrame = new Frame();
    javaFrame.start();
  }
}
