package game.display.frame;

import game.display.frame.panels.Game_Panel;
import game.display.frame.panels.Help_Panel;
import game.kellekek.Kepek;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class Frame extends JFrame {

    public Frame(int gameWidth, int gameHeight, int helpWidth, int helpHeight) {
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(new Kepek().icon);
        this.setLayout(new FlowLayout());
        this.add(new Help_Panel(helpWidth, helpHeight));
        this.add(new Game_Panel(gameWidth, gameHeight));
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
