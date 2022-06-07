import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import javax.sound.sampled.*;
import java.net.URL;
import java.util.EventListener;

public class GameArena extends JFrame{

    GamePanel panel;



    GameArena() {
        panel = new GamePanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        ImageIcon image = new ImageIcon("Duck.png");
        this.setIconImage(image.getImage());
        setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
                new ImageIcon("pngegg.png").getImage(),
                new Point(0, 0), "custom cursor"));
        this.setTitle("Duck Hunter");
        Sound sound = new Sound();



    }

}
