package game.display.frame.panels.labels;

import javax.swing.JLabel;

public class Cselekves_Label extends JLabel {
    public Cselekves_Label(int gameWidth, int gameHeight) {
        this.setText("<html><body style='font-size: 20px; color: yellow;'>Cselekvés: 0 / 1000</body></html>");
        this.setBounds(0, 0, gameWidth, gameHeight);
        this.setVerticalAlignment(JLabel.TOP);
        this.setHorizontalAlignment(JLabel.CENTER);
    }

    public void cselekves(int cselekves) {
        this.setText("<html><body style='font-size: 20px; color: yellow;'>Cselekvés: " + cselekves + " / 1000</body></html>");
    }
}
