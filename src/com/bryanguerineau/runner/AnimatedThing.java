package com.bryanguerineau.runner;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double xHero;
    private double yHero;
    public ImageView spriteSheet;
    private int attitude;

    private int runIndex = 0;
    private double durationBetweenTwoFrames = 15;
    private int maxIndex = 10;
    private int sizeLength;
    private int sizeHeigth;
    private int offsetBetweenEachFrame = 10;
    public ImageView spriteSheetHero;

    public AnimatedThing(double xHero, double yHero, String fileName) {
        Image spriteSheetHeroImage = new Image("file:img/heros.png");
        this.spriteSheetHero = new ImageView(spriteSheetHeroImage);
        this.spriteSheetHero.setX(xHero);
        this.spriteSheetHero.setY(yHero);
        this.spriteSheetHero.setViewport(new Rectangle2D(0,0,75,100));
        this.yHero = yHero;
        this.xHero = xHero;
    }

    public ImageView getSpriteSheet() { return spriteSheet; }

    public double getxHero() { return xHero; }
    public double getyHero() { return yHero; }
    public int getRunIndex() { return runIndex; }

}
