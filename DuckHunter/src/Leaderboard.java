import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Leaderboard extends JFrame implements ActionListener {

    JButton backButton = new JButton("Back to menu");
    JLabel first = new JLabel();
    JLabel second = new JLabel();
    JLabel third = new JLabel();
    File leaderboard = new File("Leaderboard.txt");




    Leaderboard() {
        this.setSize(750, 700);
        this.setTitle("Duck Hunter");
        this.setVisible(true);
        this.setResizable(false);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Duck.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(Color.GRAY);

        JLabel jLabelObject = new JLabel();
        jLabelObject.setIcon(new ImageIcon("podium.png"));
        jLabelObject.setBounds(40, 300, 650, 300);
        add(jLabelObject);

        backButton.setBounds(50, 20, 200,50);
        backButton.setFont(new Font(null, Font.ITALIC, 20));
        backButton.setFocusable(false);
        backButton.setBackground(Color.BLACK);
        backButton.setForeground(Color.yellow);
        backButton.addActionListener(this::actionPerformed);
        add(backButton);

        int f = 0;
        first.setBounds(320, 280, 400, 50);
        first.setFont(new Font(null, Font.ITALIC, 34 ));
        add(first);

        int s = 0;
        second.setBounds(150, 340, 400, 50);
        second.setFont(new Font(null, Font.ITALIC, 34 ));
        add(second);

        int t = 0;
        third.setBounds(550, 380, 400, 50);
        third.setFont(new Font(null, Font.ITALIC, 34 ));
        add(third);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==backButton){
            this.dispose();
            Menu menu = new Menu();
        }
//        String scr = score.getText();
//        if(score>f){
//            first.setText(score);
//        }else if(score>s){
//            second.setText(score);
//        }else if(score>t){
//            third.setText(score);
//        }

    }

}
