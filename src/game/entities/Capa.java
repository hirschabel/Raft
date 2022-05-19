package game.entities;

import game.kellekek.terkepek.TileMap;

import java.util.Random;

public class Capa {
    private int oszlop, sor;
    private TileMap tileMap;
    Random rnd = new Random();

    public Capa(int oszlop, int sor, TileMap tileMap) {
        this.oszlop = oszlop;
        this.sor = sor;
        this.tileMap = tileMap;
    }
}
