import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Menu extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JButton playButton = new JButton("Play");
    JButton leaderboardButton = new JButton("Leaderboard");
    JButton exitButton = new JButton("Exit");
    JLabel duckLogo = new JLabel();

    Menu(){


        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setTitle("Duck Hunter");
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("Duck.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(Color.GRAY);




        playButton.setBounds(1, 600, 250,100);
        playButton.setFont(new Font(null, Font.ITALIC, 34));
        playButton.setFocusable(false);
        playButton.setBackground(Color.BLACK);
        playButton.setForeground(Color.yellow);
        playButton.addActionListener(this::actionPerformed);
        frame.add(playButton);


        leaderboardButton.setBounds(250, 600, 250,100);
        leaderboardButton.setFont(new Font(null, Font.ITALIC, 34));
        leaderboardButton.setFocusable(false);
        leaderboardButton.setBackground(Color.BLACK);
        leaderboardButton.setForeground(Color.yellow);
        leaderboardButton.addActionListener(this::actionPerformed);
        frame.add(leaderboardButton);


        exitButton.setBounds(500, 600, 230,100);
        exitButton.setFont(new Font(null, Font.ITALIC, 34));
        exitButton.setFocusable(false);
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.yellow);
        exitButton.addActionListener(this::actionPerformed);
        frame.add(exitButton);


        duckLogo.setIcon(new ImageIcon("DuckLogo.png"));
        duckLogo.setBounds(100, 10, 500, 575);
        frame.add(duckLogo);


    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==exitButton){
            frame.dispose();
        }
        else if(e.getSource()==leaderboardButton){
            frame.dispose();
            Leaderboard leaderboard = new Leaderboard();
        }
        else if(e.getSource()==playButton){
            frame.dispose();
            GameArena gamearena = new GameArena();
        }



    }


}

