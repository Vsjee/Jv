package SongTask;

// Importing the libraries that are needed to play the song.
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SongTask extends Thread {
/**
 * It plays the audio file.
 */
  public void run(){
    AudioPlayer();
  }

/**
 * It takes a file pathname as a string, opens the file, and plays it
 */
  public void AudioPlayer() {
    // Creating a string variable called pathname and it is assigning the path of the audio file to it.
    String pathname = "C:\\Users\\david\\OneDrive\\Escritorio\\PROGRAMIN\\java\\javaMovileClass\\taller2\\SongTask\\pullup.wav";
    try {
      // Creating a new file object with the pathname.
      File file = new File(pathname);
      
      // Creating a new audio stream from the file.
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      
      // Creating a new clip object.
      Clip clip = AudioSystem.getClip();
      
      // It opens the audio stream.
      clip.open(audioStream);
      
      // It starts the audio stream.
      clip.start();
    } catch (Exception e) {
        System.out.println("Error playing WAV file: " + e.getMessage());
    }
  }
}