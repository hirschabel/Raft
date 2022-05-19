package game.display.frame.panels;

import game.display.frame.panels.labels.Help_Label;

import javax.swing.JPanel;
import java.awt.Dimension;

public class Help_Panel extends JPanel {
    public Help_Panel(int WIDTH, int HEIGHT) {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setLayout(null);
        this.add(new Help_Label(WIDTH, HEIGHT));
    }
}
