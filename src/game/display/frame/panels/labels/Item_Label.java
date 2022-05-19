package game.display.frame.panels.labels;

import javax.swing.*;
import java.awt.*;

public class Item_Label extends JLabel {
    public Item_Label(int gameWidth, int gameHeight) {
        this.setText("<html><body style='font-size: 10px; text-align: right; color: white; padding-top: 7px; padding-bottom: 3px; padding-right: 10px;'>" +
                "0 Deszka<br>0 Levél<br>0 Hulladék<br><br>0 Burgonya<br>0 Hal</body></html>");
        this.setBounds(0, 0, gameWidth, gameHeight);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.RIGHT);
    }

}
