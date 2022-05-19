package game.actions.player_cselekvesek;

import game.entities.Player;
import game.kellekek.terkepek.TileMap;

public class Lepes {
    private final Player player = new Player();
    private final TileMap tileMap = new TileMap();

    public boolean lepes(int oszlop_noveles, int sor_noveles) {
        if(player.getOszlop() + oszlop_noveles < 0 || player.getOszlop() + oszlop_noveles > 35 || player.getSor() + sor_noveles < 0 || player.getSor() + sor_noveles > 25) {
            return false;
        }
        player.setVizben(tileMap.getTileMapKoord(player.getOszlop() + oszlop_noveles, player.getSor() + sor_noveles) == 0);
        player.setKoord(player.getOszlop() + oszlop_noveles, player.getSor() + sor_noveles);
        return true;
    }

}
