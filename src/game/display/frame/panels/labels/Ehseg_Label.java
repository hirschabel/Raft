package game.display.frame.panels.labels;

import javax.swing.JLabel;
import java.awt.Color;

public class Ehseg_Label extends JLabel {
    public Ehseg_Label(int gameWidth, int gameHeight) {
        this.setText("Éhség:");
        this.setBounds(15, 7, gameWidth, gameHeight);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.LEFT);
        this.setForeground(Color.yellow);
    }
}
