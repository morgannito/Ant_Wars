package com.example.antwars;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Map.*;
import Ant.*;
import Resource.*;
import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;


public class HelloApplication extends Application{
    public static void main(String[] args)
    {
        //Map.setNbTile(5, 5);
        Map game = new Map(5,5);
//        Map.consoleDraw();
//        Master.shared().startGame();
        launch(HelloApplication.class, args);
    }

    @Override
    public void start(Stage stage) {
        stage.setResizable(false);
        stage.setTitle("AntWar");
        Group root = new Group();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        Canvas canvas = new Canvas( 500, 500);
        root.getChildren().add( canvas );

        new AnimationTimer()
        {
            @Override
            public void handle(long currentNanoTime)
            {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
//                Map.getTiles().draw(gc);
                try {
                    Thread.sleep(40);
                } catch (InterruptedException e) { }
            }
        }.start();

        stage.show();

    }
}

//public class HelloApplication extends Application {
//
//
//
////    @Override
////    public void start(Stage stage) throws IOException {
////        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
////        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
////        stage.setTitle("Hello!");
////        stage.setScene(scene);
////        stage.show();
////    }
//
//    public static void main(String[] args) {
////        launch();
//
//
//        Map map = new Map(10,10);
//        map.initMap();
//        map.display(map);
//
//        System.out.println("test");
//
//
//
//    }
//}