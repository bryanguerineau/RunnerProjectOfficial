package com.bryanguerineau.runner;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
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
        GameScene theScene = new GameScene(pane, 644,362,true);

        pane.getChildren().add(GameScene.getBackgroundLeft().getImageView());
        pane.getChildren().add(GameScene.getBackgroundRight().getImageView());
        pane.getChildren().add(theScene.getHeroCharacter().getSpriteSheet());
        pane.getChildren().add(theScene.getFoe().getSpriteSheet());

        primaryStage.setScene(theScene);
        primaryStage.show();

        theScene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            //*** Cette partie ne fonctionne pas ***
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.SPACE) {
                    Hero.jump=1;
                }
            }
            // *************************************
        });
    }

    public static void Main (String[] args) { launch(args); }
}