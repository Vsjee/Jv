package jFrame;

// Importing the JTextPane, Timer, TimerTask, and JFrame classes.
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JTextPane;
import javax.swing.JFrame;

public class Frame extends Thread {
  String addText = "";
  
/**
 * It creates a JFrame and a JTextPane, adds the JTextPane to the JFrame, sets the size and location of
 * the JFrame, sets the default close operation of the JFrame, and makes the JFrame visible.
 */
  public void run() {
    JFrame frame = new JFrame("JFrame Example");  
    JTextPane text = new JTextPane();

    text.setText("WELCOME DEV! =D");

    frame.add(text);
    
    frame.setSize(500, 300);  
    frame.setLocationRelativeTo(null);  
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    frame.setVisible(true);

    // Adding function to a JTextPane for add text every second.
    addMoreText(frame, text);
  }

/**
 * It adds text to a JTextPane every second
 * 
 * @param frame The JFrame that the text is on.
 * @param text The text you want to add to the JTextPane
 */
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
