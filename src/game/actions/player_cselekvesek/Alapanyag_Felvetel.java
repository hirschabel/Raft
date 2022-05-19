package game.actions.player_cselekvesek;

import game.entities.Player;
import game.kellekek.terkepek.AlapanyagMap;
import game.kellekek.terkepek.TileMap;

import java.util.Random;

public class Alapanyag_Felvetel {
    AlapanyagMap alapanyagMap = new AlapanyagMap();
    Player player = new Player();

    public void alapanyag_Felvetel() {
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <= 1; j++) {
                if(player.getSor() + i < alapanyagMap.getSorHossz() && player.getSor() + i >= 0 && player.getOszlop() + j < alapanyagMap.getOszlopHossz() && player.getOszlop() + j >= 0) {
                    felvesz(player.getOszlop() + j, player.getSor() + i);
                }
            }
        }
    }

    private void felvesz(int oszlop, int sor) {
        if(new TileMap().getTileMapKoord(oszlop, sor) == 0) {
            switch (alapanyagMap.getAlapanyagKoord(oszlop, sor)) {
                case 1: { player.addDeszka(); break; }
                case 2: { player.addLevel(); break; }
                case 3: { player.addHulladek(); break; }
                case 4: { hordoFelvetel(); break; }
            }
            alapanyagMap.setKoord(oszlop, sor, 0);
        }
    }

    public void hordoFelvetel() {
        for(int i = 0; i < 5; i++) {
            int a = new Random().nextInt(4);
            switch (a) {
                case 0: { player.addDeszka(); break; }
                case 1: { player.addLevel(); break; }
                case 2: { player.addHulladek(); break; }
                case 3: { player.addBurgonya(); break; }
            }
        }
    }
}
