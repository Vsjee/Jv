package SongTask;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SongTask extends Thread {
  public void run(){
    AudioPlayer();
  }

  public void AudioPlayer() {
    String pathname = "C:\\Users\\david\\OneDrive\\Escritorio\\PROGRAMIN\\java\\javaMovileClass\\taller2\\SongTask\\pullup.wav";
    try {
      File file = new File(pathname);
      AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
      Clip clip = AudioSystem.getClip();
      clip.open(audioStream);
      clip.start();
    } catch (Exception e) {
        System.out.println("Error playing WAV file: " + e.getMessage());
    }
  }
}