package game.entities;

import game.kellekek.terkepek.TileMap;

import java.util.Random;

public class Player {
    private static int oszlop, sor;
    private TileMap tileMap = new TileMap();
    private static int deszkaMennyiseg, levelMennyiseg, hulladekMennyiseg, halMennyiseg, burgonyaMennyiseg;
    private static int ehseg, szomjusag;
    private static boolean vizben;
    Random rnd = new Random();

    public Player(int oszlop, int sor) {
        Player.oszlop = oszlop;
        Player.sor = sor;
        deszkaMennyiseg = 0;
        levelMennyiseg = 0;
        hulladekMennyiseg = 0;
        halMennyiseg = 0;
        burgonyaMennyiseg = 0;
        ehseg = 100;
        szomjusag = 100;
        vizben = false;
    }

    public Player() {}

    public void subStats() {
        Player.ehseg--;
        Player.szomjusag--;
        if(Player.ehseg == 0 || Player.szomjusag == 0) {
            //GAME OVER
            System.out.println("game over");
        }
    }

    public void hajoBovit() {
        Player.deszkaMennyiseg -= 2;
        Player.levelMennyiseg -= 2;
    }

    public void addDeszka() {
        Player.deszkaMennyiseg++;
    }

    public void addLevel() {
        Player.levelMennyiseg++;
    }

    public void addHulladek() {
        Player.hulladekMennyiseg++;
    }

    public void addBurgonya() {
        Player.burgonyaMennyiseg++;
    }

    public void addHal() {
        Player.halMennyiseg++;
    }

    public void setVizben(boolean vizben) {
        Player.vizben = vizben;
    }
    public void setKoord(int oszlop, int sor) {
        Player.oszlop = oszlop;
        Player.sor = sor;
    }

    public void epitViztisztito() {
        Player.hulladekMennyiseg -= 4;
        Player.levelMennyiseg -= 2;
    }


    public boolean isVizben() {
        return vizben;
    }
    public int getOszlop() {
        return oszlop;
    }
    public int getSor() {
        return sor;
    }
    public int getEhseg() {
        return ehseg;
    }
    public int getSzomjusag() {
        return szomjusag;
    }
    public int getDeszkaMennyiseg() {
        return deszkaMennyiseg;
    }
    public int getLevelMennyiseg() {
        return levelMennyiseg;
    }
    public int getHulladekMennyiseg() {
        return hulladekMennyiseg;
    }
    public int getBurgonyaMennyiseg() {
        return burgonyaMennyiseg;
    }
    public int getHalMennyiseg() {
        return halMennyiseg;
    }
}
