package com.bryanguerineau.runner;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    private Camera gameCam;

    private static staticThings backgroundLeft;
    private static staticThings backgroundRight;


    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
        this.backgroundLeft = new staticThings(0,0,"file:img/desert.png");
        this.backgroundRight = new staticThings(0,0,"file:img/desert.png");
        Camera gameCam = new Camera(0, 0);

    }

    public static staticThings getBackgroundLeft() {
        return backgroundLeft;
    }

    public static staticThings getBackgroundRight() {
        return backgroundRight;
    }
}
