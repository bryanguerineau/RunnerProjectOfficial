package com.bryanguerineau.runner;

import javafx.animation.AnimationTimer;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class GameScene extends Scene {

    private Camera gameCam;

    private static staticThings backgroundLeft;
    private static staticThings backgroundRight;

    private Hero heroCharacter;


    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
        this.backgroundLeft = new staticThings(0,0,"file:img/desert.png");
        this.backgroundRight = new staticThings(0,0,"file:img/desert.png");
        this.heroCharacter = new Hero();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                heroCharacter.update(l);
                GameScene.update(l);

            }
        };
        timer.start();
    }

    private static void update(long l) {
        int speed = 7;
        double xl = backgroundLeft.getSizeX();
        double xr = backgroundRight.getSizeX();
        if (xl < 4){
            backgroundLeft.getImageView().setX(800);
            backgroundLeft.setSizeX(800);
            backgroundRight.getImageView().setX(0);
            backgroundRight.setSizeX(0);
        } else {
            backgroundLeft.getImageView().setX(xl-speed);
            backgroundLeft.setSizeX((xl-speed));
            backgroundRight.getImageView().setX((xr-speed));
            backgroundRight.setSizeX((xr-speed));
        }
    }

    public static staticThings getBackgroundLeft() {
        return backgroundLeft;
    }

    public static staticThings getBackgroundRight() {
        return backgroundRight;
    }

    public Hero getHeroCharacter() {
        return heroCharacter;
    }
}
