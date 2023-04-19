package main;

import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    JFrame window = new JFrame(); // Create the frame
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the window properly
    window.setResizable(false); // cannot resize the window
    window.setTitle("2D Advanture");

    GamePanel gamePanel = new GamePanel();
    window.add(gamePanel);

    window.pack(); // this window to be sized to fit the preferred size and layouts of its subcomponents.

    window.setLocationRelativeTo(null); // window display on the centre of the screen
    window.setVisible(true); // see the window

    gamePanel.setupGame(); // set object
    gamePanel.startGameThread();
  }
}