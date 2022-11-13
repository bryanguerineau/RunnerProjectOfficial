package com.bryanguerineau.runner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
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

        primaryStage.setScene(theScene);
        primaryStage.show();
    }

    public static void Main (String[] args) { launch(args); }
}