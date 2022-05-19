package game.actions;


import game.actions.player_cselekvesek.Epites;
import game.actions.player_cselekvesek.Lepes;
import game.actions.player_cselekvesek.Terulet_Bovites;
import game.display.frame.panels.Game_Panel;
import game.entities.Player;

public class Cselekves_Tortent {
    Player player = new Player();
    Game_Panel gamePanel;

    public void cselekves_ellenorzes(char e, Game_Panel gamePanel) {
        this.gamePanel = gamePanel;
        switch (e) {
            case 'y': case 'z': { if(new Lepes().lepes(-1, +1)) cselekves_igaz(); break; }
            case 's': { if(new Lepes().lepes(+0, +1)) cselekves_igaz(); break; }
            case 'x': { if(new Lepes().lepes(+1, +1)) cselekves_igaz(); break; }
            case 'a': { if(new Lepes().lepes(-1, +0)) cselekves_igaz(); break; }
            case 'd': { if(new Lepes().lepes(+1, +0)) cselekves_igaz(); break; }
            case 'q': { if(new Lepes().lepes(-1, -1)) cselekves_igaz(); break; }
            case 'w': { if(new Lepes().lepes(+0, -1)) cselekves_igaz(); break; }
            case 'e': { if(new Lepes().lepes(+1, -1)) cselekves_igaz(); break; }
            case 'Y': case 'Z': { if(new Terulet_Bovites().terulet_bovites(-1, +1)) cselekves_igaz(); break; }
            case 'S': { if(new Terulet_Bovites().terulet_bovites(+0, +1)) cselekves_igaz(); break; }
            case 'X': { if(new Terulet_Bovites().terulet_bovites(+1, +1)) cselekves_igaz(); break; }
            case 'A': { if(new Terulet_Bovites().terulet_bovites(-1, +0)) cselekves_igaz(); break; }
            case 'D': { if(new Terulet_Bovites().terulet_bovites(+1, +0)) cselekves_igaz(); break; }
            case 'Q': { if(new Terulet_Bovites().terulet_bovites(-1, -1)) cselekves_igaz(); break; }
            case 'W': { if(new Terulet_Bovites().terulet_bovites(+0, -1)) cselekves_igaz(); break; }
            case 'E': { if(new Terulet_Bovites().terulet_bovites(+1, -1)) cselekves_igaz(); break; }
            case '1': { if(new Epites().viztisztito_epites()) cselekves_igaz(); break;}
            case '2': { }
            case '3': { }
            case '4': { }
        }
    }

    public void cselekves_igaz() {
        gamePanel.addCselekves();
        player.subStats();
        gamePanel.progressBarFrissites();
    }
}
