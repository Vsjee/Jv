package jFrame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frame extends Thread {
  public void run() {
    JFrame frame = new JFrame("JFrame Example");  
    JButton button = new JButton();  
    button.setText("Button");
    frame.setSize(500, 300);  
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);  
  }
}
