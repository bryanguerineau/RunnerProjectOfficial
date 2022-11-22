package com.bryanguerineau.runner;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;

public class foe extends AnimatedThing {

    public foe() {
        super(290, 225, "file:img/nuage.png");
        this.getSpriteSheet().setViewport(new Rectangle2D(0,0,132,64));
    }


    @Override
    public ImageView getSpriteSheet() {
        return this.spriteSheetFoe;
    }
}
