package com.bryanguerineau.runner;

import javafx.scene.image.ImageView;


public class staticThings {
    ImageView imageView;
    double sixeX;
    double sizeY;

    public ImageView getImageView() { return imageView; }

    public staticThings(double sixeX, double sizeY, String fileName) {
        this.sixeX = sixeX;
        this.sizeY = sizeY;
        this.imageView = new ImageView(fileName);
    }

}
