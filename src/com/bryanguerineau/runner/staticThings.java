package com.bryanguerineau.runner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class staticThings {
    private ImageView imageView;
    private double sizeX;
    private double  sizeY;

    public ImageView getImageView() { return imageView; }

    public double getSizeX() { return this.sizeX; }

    public double getSizeY() { return this.sizeY; }

    public void setSizeX(double sizeX) {
        this.sizeX = sizeX;
    }

    public staticThings(double sizeX, double sizeY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image("/img/"+fileName);
        this.imageView = new ImageView(fileName);
        this.imageView.setX(sizeX);
        this.imageView.setY(sizeY);

    }


}
