import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
// GameFrame class represents the main window of the game
public class GameFrame extends JFrame{
    GamePanel panel;// The game panel that holds the game logic and graphics

    GameFrame(){
        panel = new GamePanel();// Create a new GamePanel object
        this.add(panel);// Add the game panel to the frame
        this.setTitle("Pong Game" );// Set the title of the frame
        this.setResizable(false);// Disable window resizing
        this.setBackground(Color.GRAY);// Set the background color of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Exit the application when the frame is closed
        this.pack();// Pack the components within the frame
        this.setVisible(true);// Make the frame visible
        this.setLocationRelativeTo(null);// Center the frame on the screen


    }

}
