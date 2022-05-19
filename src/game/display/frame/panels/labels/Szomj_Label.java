package game.display.frame.panels.labels;

import javax.swing.JLabel;
import java.awt.Color;

public class Szomj_Label extends JLabel{
    public Szomj_Label(int gameWidth, int gameHeight) {
        this.setText("Szomj:");
        this.setBounds(15, 33, gameWidth, gameHeight);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.LEFT);
        this.setForeground(Color.yellow);
    }
}
