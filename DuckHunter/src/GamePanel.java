import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class GamePanel extends JPanel implements ActionListener {

    final int PANEL_WIDTH = 900;
    final int PANEL_HEIGHT = 640;
    Image duck;
    Image backgroundImage;
    Timer timer;
    int xVelocity = 1;
    int yVelocity = 1;
    int x = 900;
    int y = 0;


    GamePanel() {

        JLabel score = new JLabel("SCORE: ");
        score.setBounds(450, 50, 200, 200);
        score.setFont(new Font(null, Font.ITALIC, 25));
        add(score);
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.BLACK);
        duck = new ImageIcon("DuckEnemy.png").getImage();
        backgroundImage = new ImageIcon("waw.jpg").getImage();
        timer = new Timer(10, this);
        timer.start();

    }

    public void paint(Graphics g) {


        super.paint(g);
        Graphics2D d2d = (Graphics2D) g;

        d2d.drawImage(backgroundImage, 0, 0, null);
        d2d.drawImage(duck, x, y, null);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= PANEL_WIDTH) {
            xVelocity = xVelocity * -1;
        } else if (y >= PANEL_HEIGHT) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        x = x + xVelocity;
        repaint();

    }


}