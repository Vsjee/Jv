import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Recursion.Recursion;
import SongTask.SongTask;
import jFrame.Frame;

public class Main {
  public static void main(String[] args) {
  
    Recursion recursionTask = new Recursion();
    recursionTask.start();

    SongTask songTask = new SongTask();
    songTask.start();

    Frame javaFrame = new Frame();
    javaFrame.start();
  }
}
