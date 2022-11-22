package com.bryanguerineau.runner;

import javafx.animation.AnimationTimer;
import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class GameScene extends Scene {

    private Camera gameCam;

    private static staticThings backgroundLeft;
    private static staticThings backgroundRight;

    private Hero heroCharacter;
    private foe foe;


    public GameScene(Parent parent, double v, double v1, boolean b) {
        super(parent, v, v1, b);
        //this.backgroundLeft = new staticThings(0,0,"file:img/desert.png");
        //this.backgroundRight = new staticThings(0,0,"file:img/desert.png");
        this.backgroundLeft = new staticThings(0,0,"file:img/background.png");
        this.backgroundRight = new staticThings(0,0,"file:img/background.png");
        this.heroCharacter = new Hero();
        this.foe = new foe();

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
        int speed = 10;
        double xl = backgroundLeft.getSizeX();
        double xr = backgroundRight.getSizeX();
        if (xl < 4){
            backgroundLeft.getImageView().setX(644);
            backgroundLeft.setSizeX(644);
            backgroundRight.getImageView().setX(0);
            backgroundRight.setSizeX(0);
        } else {
            backgroundLeft.getImageView().setX(xl-speed);
            backgroundLeft.setSizeX((xl-speed));
            backgroundRight.getImageView().setX((xr-speed));
            backgroundRight.setSizeX((xr-speed));
        }
    }

    // Getter
    public static staticThings getBackgroundLeft() {
        return backgroundLeft;
    }

    public static staticThings getBackgroundRight() {
        return backgroundRight;
    }

    public Hero getHeroCharacter() {
        return heroCharacter;
    }

    public foe getFoe(){return foe;}
}
