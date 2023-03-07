package jFrame;

import javax.swing.JTextPane;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Frame extends Thread {
  String addText = "";

  public void run() {
    JFrame frame = new JFrame("JFrame Example");  
    JTextPane text = new JTextPane();

    text.setText("WELCOME DEV! =D");

    frame.add(text);
    
    frame.setSize(500, 300);  
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);

    addMoreText(frame, text);
  }

  public void addMoreText(JFrame frame, JTextPane text) {
    Timer timer = new Timer();
		timer.schedule(new TimerTask() {
		  public void run() {
		    addText += "WELCOME DEV! =D ";
        text.setText(addText);
        frame.add(text);
		  }
		}, 0, 1000);
  }
}
