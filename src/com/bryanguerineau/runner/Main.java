package com.bryanguerineau.runner;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Runner");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane, 600,400,true);

        pane.getChildren().add(GameScene.getBackgroundLeft().getImageView());
        pane.getChildren().add(GameScene.getBackgroundRight().getImageView());
        pane.getChildren().add(theScene.getHeroCharacter().getSpriteSheet());

        primaryStage.setScene(theScene);
        primaryStage.show();

        theScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE) { // Si appuie de la touche SPACE
                    Hero.jump=1; //Permet de sauter
                }
            }
        });
    }

    public static void Main (String[] args) { launch(args); }
}