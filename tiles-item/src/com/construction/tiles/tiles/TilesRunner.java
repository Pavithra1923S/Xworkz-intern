package com.construction.tiles;

import com.construction.tiles.tiles.Tiles;

public class TilesRunner {
    public static void main(String[] args) {
        Tiles tile1 = new Tiles();
        tile1.setMaterial("Ceramic");
        tile1.setColor("White");
        tile1.setFinish("Glossy");
        tile1.setBrand("Kajaria");
        tile1.setSizeInInches(12.0);
        tile1.setAntiSkid(false);
        tile1.setPricePerSqft(45.0);

        Tiles tile2 = new Tiles();
        tile2.setMaterial("Porcelain");
        tile2.setColor("Grey");
        tile2.setFinish("Matte");
        tile2.setBrand("Somany");
        tile2.setSizeInInches(24.0);
        tile2.setAntiSkid(true);
        tile2.setPricePerSqft(60.5);

        Tiles tile3 = new Tiles();
        tile3.setMaterial("Marble");
        tile3.setColor("Beige");
        tile3.setFinish("Glossy");
        tile3.setBrand("Nitco");
        tile3.setSizeInInches(36.0);
        tile3.setAntiSkid(false);
        tile3.setPricePerSqft(110.0);

        Tiles tile4 = new Tiles();
        tile4.setMaterial("Granite");
        tile4.setColor("Black");
        tile4.setFinish("Semi-Gloss");
        tile4.setBrand("Johnson");
        tile4.setSizeInInches(18.0);
        tile4.setAntiSkid(true);
        tile4.setPricePerSqft(85.0);

        Tiles tile5 = new Tiles();
        tile5.setMaterial("Terracotta");
        tile5.setColor("Rust");
        tile5.setFinish("Natural");
        tile5.setBrand("Local");
        tile5.setSizeInInches(16.0);
        tile5.setAntiSkid(true);
        tile5.setPricePerSqft(40.0);

        tile1.details();
        tile2.details();
        tile3.details();
        tile4.details();
        tile5.details();
    }
}