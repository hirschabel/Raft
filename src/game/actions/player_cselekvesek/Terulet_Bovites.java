package game.actions.player_cselekvesek;

import game.entities.Player;
import game.kellekek.terkepek.EpitmenyMap;
import game.kellekek.terkepek.TileMap;

public class Terulet_Bovites {
    private final Player player = new Player();
    private final EpitmenyMap epitmenyMap = new EpitmenyMap();
    private final TileMap tileMap = new TileMap();

    public boolean terulet_bovites(int oszlop_Noveles, int sor_Noveles ) {
        if(player.getDeszkaMennyiseg() < 2 || player.getLevelMennyiseg() < 2) {
            return false;
        }
        int x = player.getOszlop();
        int y = player.getSor();
        if(x + oszlop_Noveles < 0 || x + oszlop_Noveles > 35 || y + sor_Noveles < 0 || y + sor_Noveles > 25) {
            return false;
        } else if(tileMap.getTileMapKoord(x + oszlop_Noveles, y + sor_Noveles) == 1 || player.isVizben() || epitmenyMap.getEpitmenyKoord(x + oszlop_Noveles, y + sor_Noveles) == 3) {
            return false;
        } else if(tileMap.getTileMapKoord(x, y + sor_Noveles) == 0 && tileMap.getTileMapKoord(x + oszlop_Noveles, y) == 0) {
            return false;
        }
        player.hajoBovit();
        tileMap.setKoord(x + oszlop_Noveles, y + sor_Noveles, 1);
        return true;
    }
}
