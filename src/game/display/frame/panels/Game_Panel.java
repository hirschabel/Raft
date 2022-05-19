package game.display.frame.panels;

import game.actions.Cselekves_Tortent;
import game.actions.Jatek_Mechanika;
import game.display.frame.panels.labels.Cselekves_Label;
import game.display.frame.panels.labels.Ehseg_Label;
import game.display.frame.panels.labels.Item_Label;
import game.display.frame.panels.labels.Szomj_Label;
import game.display.frame.panels.progress_bars.EhsegProgressBar;
import game.display.frame.panels.progress_bars.SzomjusagProgressBar;
import game.entities.Player;
import game.kellekek.Kepek;
import game.kellekek.terkepek.AlapanyagMap;
import game.kellekek.terkepek.EpitmenyMap;
import game.kellekek.terkepek.TileMap;
import game.kellekek.terkepek.ToltottsegMap;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game_Panel extends JPanel implements KeyListener {
    private Player player;
    private Cselekves_Label cselekvesLabel;
    private Item_Label itemLabel;
    private EhsegProgressBar ehsegProgressBar;
    private SzomjusagProgressBar szomjusagProgressBar;
    private Cselekves_Tortent cselekves_tortent = new Cselekves_Tortent();
    private Kepek kepek = new Kepek();
    private AlapanyagMap alapanyagMap = new AlapanyagMap();
    private EpitmenyMap epitmenyMap = new EpitmenyMap();
    private TileMap tileMap = new TileMap();
    private ToltottsegMap toltottsegMap = new ToltottsegMap();
    private static int cselekves;


    public Game_Panel(int WIDTH, int HEIGHT) {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setLayout(null);
        this.add(cselekvesLabel = new Cselekves_Label(WIDTH, HEIGHT));
        this.add(itemLabel = new Item_Label(WIDTH, HEIGHT));
        this.add(new Ehseg_Label(WIDTH, HEIGHT));
        this.add(new Szomj_Label(WIDTH, HEIGHT));
        this.add(ehsegProgressBar = new EhsegProgressBar());
        this.add(szomjusagProgressBar = new SzomjusagProgressBar());
        this.addKeyListener(this);
        this.setFocusable(true);
        player = new Player(17, 12);
        cselekves = 0;
        new Jatek_Mechanika();

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(int i = 0; i < tileMap.getSorHossz(); i++) {
            for(int j = 0; j < tileMap.getOszlopHossz(); j++) {
                if(tileMap.getTileMapKoord(j, i) == 0) {
                    g.setColor(new Color(0, 119, 190));
                } else {
                    g.setColor(new Color(190, 71, 0));
                }
                g.fillRect(j * 38, i * 38, 38, 38);
                g.setColor(Color.black);
                g.fillRect(j * 38, i * 38, 1, 38);
                g.fillRect(j * 38, i * 38, 38, 1);

               if(epitmenyMap.getEpitmenyKoord(j, i) != 0) {
                   switch (epitmenyMap.getEpitmenyKoord(j, i)) {
                       case 1: g.drawImage(kepek.viztisztito_ures, j * 38, i * 38, null);
                   }
               }
                if(tileMap.getTileMapKoord(j, i) == 0) {
                    switch(alapanyagMap.getAlapanyagKoord(j, i)) {
                        case 1: g.drawImage(kepek.deszka, j * 38, i * 38, null); break;
                        case 2: g.drawImage(kepek.level, j * 38, i * 38, null); break;
                        case 3: g.drawImage(kepek.hulladek, j * 38, i * 38, null); break;
                        case 4: g.drawImage(kepek.hordo, j * 38, i * 38, null); break;
                    }
                }
                if(i == player.getSor() && j == player.getOszlop()) {
                    g.drawImage(kepek.player, j * 38, i * 38, null);
                }
            }
        }
    }

    public void addCselekves() {
        cselekves++;
        cselekvesLabel.cselekves(cselekves);
        new Jatek_Mechanika(itemLabel);
        repaint();
    }

    public void progressBarFrissites() {
        ehsegProgressBar.setValue(player.getEhseg());
        ehsegProgressBar.setString(player.getEhseg() + " / " + 100);
        szomjusagProgressBar.setValue(player.getSzomjusag());
        szomjusagProgressBar.setString(player.getSzomjusag() + " / " + 100);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        cselekves_tortent.cselekves_ellenorzes(keyEvent.getKeyChar(), this);
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {}

    @Override
    public void keyReleased(KeyEvent keyEvent) {}
}
