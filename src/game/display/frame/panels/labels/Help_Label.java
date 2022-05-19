package game.display.frame.panels.labels;

import javax.swing.JLabel;

public class Help_Label extends JLabel {
    public Help_Label(int helpWidth, int helpHeight) {
        this.setText("<html>" +
                "<head>" +
                "<style>table {margin: 16px; border: 1px solid black} td {border: 1px dotted black;} .class {padding: 5px; text-align: center} ul {margin-top: 0px;}</style>" +
                "</head>" +
                "<body style='font-size: 10px;'>" +
                "<hr><h1 style='text-align: center;'>MOZGÁS</h1>" +
                "<table>" +
                "<tr><td>Felfele:</td> <td class='class'>W</td></tr>" +
                "<td>Balra:</td> <td class='class'>A</td></tr>" +
                "<tr><td>Lefele:</td> <td class='class'>S</td></tr>" +
                "<tr><td>Jobbra:</td> <td class='class'>D</td></tr>" +
                "<tr><td>Balra fel:</td> <td class='class'>Q</td></tr>" +
                "<tr><td>Jobbra fel:</td> <td class='class'>E</td></tr>" +
                "<tr><td>Balra le:</td> <td class='class'>Y / Z</td></tr>" +
                "<tr><td>Jobbra le:</td> <td class='class'>X</td></tr>" +
                "<tr><td>Horgászat:</td> <td class='class'>F</td></tr>" +
                "</table>" +
                "<br><hr><h1 style='text-align: center;'>ÉPÍTÉS</h1>" +
                "Hajó bővítés<br>(SHIFT) + (W / A / S / D):<ul><li>2 deszka</li><li>2 levél</li></ul>" +
                "Víztisztító építés (1):<ul><li>2 levél</li><li>4 hulladék</li></ul>" +
                "Tűzhely epítés (2):<ul><li>2 deszka</li><li>4 levél</li><li>3 hulladék</li></ul>" +
                "Háló építés (3):<ul><li>2 deszka</li><li>6 levél</li></ul>" +
                "Lándzsa készítés (4):<ul><li>4 deszka</li><li>4 levél</li><li>4 hulladék</li></ul><hr>" +
                "</body>" +
                "</html>");
        this.setBounds(0, 0, helpWidth, helpHeight);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setHorizontalAlignment(JLabel.LEFT);
    }
}
