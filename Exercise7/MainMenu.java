import java.awt.Color;
import java.awt.Font;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {
    
    MainMenu(){
        // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon snakeImage = new ImageIcon("snake.gif");
        imageLabel.setIcon(snakeImage);
        // Add image to frame
        this.add(imageLabel);

        // JBUtton
        JButton button = new JButton();
        button.setText("START GAME");
        button.setFont(new Font("Arial", Font.BOLD, 25));
        // Add button to frame
        this.add(button);

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);
        // Add button to frame
        this.add(button);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set bg color of frame
        this.getContentPane().setBackground(Color.WHITE);
        // lock frame
        this.setResizable(false);

    }
     // Event Handler
     private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            // open game frame
            new ColorMenu();
            // Close main menu frame
            dispose();

    }
}
}