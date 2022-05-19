package game.actions.player_cselekvesek;

import game.entities.Player;
import game.kellekek.terkepek.EpitmenyMap;
import game.kellekek.terkepek.TileMap;

public class Epites {
    private final Player player = new Player();
    private final EpitmenyMap epitmenyMap = new EpitmenyMap();
    private final TileMap tileMap = new TileMap();

    public boolean viztisztito_epites() {
        if(szabad_hely() && player.getLevelMennyiseg() >= 2 && player.getHulladekMennyiseg() >= 4) {
            epitmenyMap.setKoord(player.getOszlop(), player.getSor(), 1);
            player.epitViztisztito();
            return true;
        }
        return false;
    }

    private boolean szabad_hely() {
        if(player.isVizben() || epitmenyMap.getEpitmenyKoord(player.getOszlop(), player.getSor()) != 0)
            return false;
        return true;
    }
}
