package com.bryanguerineau.runner;

import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    private final Camera gameCam;

    public GameScene(Parent parent, double v, double v1, boolean b, Camera gameCam) {
        super(parent, v, v1, b);
        this.gameCam = gameCam;
    }
}
