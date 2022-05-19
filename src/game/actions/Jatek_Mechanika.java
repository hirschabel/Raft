package game.actions;

import game.actions.player_cselekvesek.Alapanyag_Felvetel;
import game.display.frame.panels.labels.Item_Label;
import game.entities.Player;
import game.kellekek.terkepek.AlapanyagMap;
import game.kellekek.terkepek.EpitmenyMap;
import game.kellekek.terkepek.TileMap;

import java.util.Random;

public class Jatek_Mechanika {
    private Random random = new Random();

    private Player player = new Player();
    private AlapanyagMap alapanyagMap = new AlapanyagMap();
    private EpitmenyMap epitmenyMap = new EpitmenyMap();
    private TileMap tileMap = new TileMap();
    private Alapanyag_Felvetel felvetel = new Alapanyag_Felvetel();

    public Jatek_Mechanika() {
        generalas();
    }

    public Jatek_Mechanika(Item_Label itemLabel) {
        csusztatas();
        generalas();
        felvetel.alapanyag_Felvetel();

        labelUpdate(itemLabel);
    }

    private void labelUpdate(Item_Label itemLabel) {
        itemLabel.setText("<html><body style='font-size: 10px; text-align: right; color: white; padding-top: 7px; padding-bottom: 3px; padding-right: 10px;'>"
                + player.getDeszkaMennyiseg() + " Deszka<br>"
                + player.getLevelMennyiseg() +" Levél<br>"
                + player.getHulladekMennyiseg() + " Hulladék<br><br>"
                + player.getBurgonyaMennyiseg() + " Burgonya<br>"
                + player.getHalMennyiseg() + " Hal</body></html>");
    }

    //ITEM CSUSZTATAS
    private void csusztatas() {
        for(int i = tileMap.getSorHossz() - 1; i >= 0; i--) {
            for(int j = 0; j < tileMap.getOszlopHossz(); j++) {
                if (i != tileMap.getSorHossz() - 1) {
                    int alapanyag = alapanyagMap.getAlapanyagKoord(j, i);
                    alapanyagMap.setKoord(j, i, 0);
                    if (epitmenyMap.getEpitmenyKoord(j, i + 1) == 3) {
                        switch (alapanyagMap.getAlapanyagKoord(j, i)) {
                            case 1: { player.addDeszka(); break; }
                            case 2: { player.addLevel(); break; }
                            case 3: { player.addHulladek(); break; }
                            case 4: { felvetel.hordoFelvetel(); break; }
                        }
                    } else {
                        alapanyagMap.setKoord(j, i + 1, alapanyag);
                    }
                } else {
                    alapanyagMap.setKoord(j, i, 0);
                }
            }
        }
    }

    //ITEM GENERALAS
    public void generalas() {
        int spawnMennyiseg = random.nextInt(4);
        int a = random.nextInt(alapanyagMap.getOszlopHossz());
        int b = random.nextInt(alapanyagMap.getOszlopHossz() - 1);
        int c = random.nextInt(alapanyagMap.getOszlopHossz() - 2);

        switch (spawnMennyiseg) {
            case 1: {
                alapanyagMap.setKoord(a, 0, miKeletkezik());
                break;
            }
            case 2: {
                alapanyagMap.setKoord(a, 0, miKeletkezik());
                if(alapanyagMap.getAlapanyagKoord(b, 0) != 0) {
                    alapanyagMap.setKoord(b + 1, 0, miKeletkezik());
                } else {
                    alapanyagMap.setKoord(b, 0, miKeletkezik());
                }
                break;
            }
            case 3: {
                alapanyagMap.setKoord(a, 0, miKeletkezik());
                if(alapanyagMap.getAlapanyagKoord(b, 0) != 0) {
                    alapanyagMap.setKoord(b + 1, 0, miKeletkezik());
                } else {
                    alapanyagMap.setKoord(b, 0, miKeletkezik());
                }
                if(alapanyagMap.getAlapanyagKoord(c ,0) != 0) {
                    if(alapanyagMap.getAlapanyagKoord(c + 1, 0) != 0) {
                        alapanyagMap.setKoord(c + 2, 0, miKeletkezik());
                    } else {
                        alapanyagMap.setKoord(c + 1, 0, miKeletkezik());
                    }
                } else {
                    alapanyagMap.setKoord(c, 0, miKeletkezik());
                }
                break;
            }
            default: break;
        }
    }
    private int miKeletkezik() {
        int valtozo = random.nextInt(100);
        if(valtozo < 32)
            return 1;
        else if(valtozo < 64)
            return 2;
        else if(valtozo < 96)
            return 3;
        else
            return 4;
    }
}
