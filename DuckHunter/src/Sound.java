import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.Frame;
import java.io.IOException;
import java.io.File;
import java.awt.*;
import java.awt.event.*;


public class Sound extends Frame implements MouseListener{

    Sound(){

        addMouseListener(this);
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("sound.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch(Exception ex) {System.out.println(".");
            ex.printStackTrace();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {




    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
