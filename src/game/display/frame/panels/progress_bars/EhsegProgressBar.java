package game.display.frame.panels.progress_bars;

import javax.swing.JProgressBar;
import javax.swing.BorderFactory;
import java.awt.Color;

public class EhsegProgressBar extends JProgressBar {
    public EhsegProgressBar() {
        this.setValue(100);
        this.setForeground(new Color(210, 105, 30));
        this.setBackground(Color.black);
        this.setStringPainted(true);
        this.setString("100 / 100");
        this.setBounds(60, 8, 100, 17);
        this.setBorder(BorderFactory.createLineBorder(Color.black, 2));
    }
}
