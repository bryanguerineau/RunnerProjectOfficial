package com.bryanguerineau.runner;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class AnimatedThing {
    private double xHero;
    private double yHero;

    private double xFoe;
    private double yFoe;
    public ImageView spriteSheet;
    public ImageView spriteSheetFoe;
    private int attitude;

    private int runIndex = 0;
    private int jumpIndex = 0;
    private double durationBetweenTwoFrames = 15;
    private int maxIndex = 4;
    private int maxJump = 2;
    private int sizeLength;
    private int sizeHeigth;
    private int offsetBetweenEachFrame = 10;
    public ImageView spriteSheetHero;
    private int jump;

    public AnimatedThing(double xHero, double yHero, String fileName) {
        //Image spriteSheetHeroImage = new Image("file:img/heros.png");
        Image spriteSheetHeroImage = new Image("file:img/Perso.png");
        this.spriteSheetHero = new ImageView(spriteSheetHeroImage);
        this.spriteSheetHero.setX(xHero);
        this.spriteSheetHero.setY(yHero);
        this.spriteSheetHero.setViewport(new Rectangle2D(0,0,123,124));
        this.yHero = yHero;
        this.xHero = xHero;

        Image thisSpringSheetFoe = new Image("file:img/nuage.png");
        this.spriteSheetFoe=new ImageView(thisSpringSheetFoe);
        this.spriteSheetFoe.setX(xFoe);
        this.spriteSheetFoe.setY(yFoe);
        spriteSheetFoe.setViewport( new Rectangle2D(0,0,132,64));
        setXFoe(xFoe);
        setYFoe(yFoe);
    }

    // Setter

    public void setxHero(double xHero) { this.xHero = xHero; }

    public void setyHero(double yHero) { this.yHero = yHero; }

    public void setSpriteSheet(ImageView spriteSheet) { this.spriteSheet = spriteSheet; }

    public void setRunIndex(int runIndex) { this.runIndex = runIndex; }

    public void setJumpIndex(int jumpIndex) { this.jumpIndex = jumpIndex; }

    public abstract ImageView getSpriteSheet();

    public void setXFoe(double x) {this.xFoe = x;}
    public void setYFoe(double y) {this.yFoe = y;}

    // Getter

    public double getxHero() { return xHero; }
    public double getyHero() { return yHero; }
    public int getRunIndex() { return runIndex; }

    public int getJumpIndex() { return jumpIndex; }

    // Création de la méthode Update

    public void update(long l) {
        int newIndex;
        if (jump == 0){
            newIndex = getRunIndex();
            if (newIndex == maxIndex) {
                setRunIndex(0);
            } else {
                setRunIndex(newIndex+1);
            }
            xHero = getxHero();
            spriteSheetHero.setViewport(new Rectangle2D(getRunIndex()*123,0,123,124));
        } else {
            newIndex = getJumpIndex();
            if (newIndex == maxIndex){
                setJumpIndex(0);
                jump = 0;
            } else {
                xHero = getxHero();
                spriteSheetHero.setViewport(new Rectangle2D(getJumpIndex()*85,160,85,100));
                setJumpIndex(newIndex+1);
            }
        }
    }
}
