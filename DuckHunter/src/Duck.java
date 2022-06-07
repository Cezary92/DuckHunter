import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Duck extends JFrame{

    Container a;
    JLabel duc;
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    int lifecounter = 3;
    int speed = 1;
    Icon pic;
    String text;

    public Duck() {
        a = getContentPane();
        pic = new ImageIcon("DuckEnemy.png");
        duc = new JLabel(text, pic, JLabel.CENTER);
        duc.addMouseListener(new MListener());
        a.add(duc);
    }
    public class MListener extends MouseAdapter{
        public void mousePressed(MouseEvent e) {
            duc.setText(lifecounter-- +" ");
            speed +=2;
        }
    }
    public void run() throws Exception{
        int y = 300;
        int x = 300;
        boolean yb = false;
        boolean xb = false;

        while ((lifecounter>= 0)){
            Thread.sleep(10);
            setLocation(x,y);

            if (y >= dim.getHeight() - 300){
                yb = true;
            }else if (y <= -300){
                yb = false;
            }
            if (x >= dim.getWidth() - 300){
                xb = true;
            }else if(x<= -300){
                xb = false;
            }
            if(yb){
                y -= speed;
            }else{
                y += speed;
            }
            if(xb){
                x -=speed;
            }else {
                x +=speed;
            }
        }
        duc.setText(" ");
        Thread.sleep(1800);



    }



}

