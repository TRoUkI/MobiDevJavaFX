package com.example.javafxproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class HelloApplication extends Application {
    private static final String[] MESSAGES = {
            "You clicked me!",
            "Nice one!",
            "Try again",
            "That tickled!",
            "Still here?",
    };

    private static final String[] COLORS = {
            "#FFADAD", "#FFD6A5", "#FDFFB6", "#CAFFBF", "#9BF6FF", "#A0C4FF"
    };

    @Override
    public void start(Stage stage) {
        Label label = new Label("Click the button for a surprise!");
        Button button = new Button("Click Me");

        Random random = new Random();

        VBox layout = new VBox(10, label, button);
        layout.setStyle("-fx-padding: 30; -fx-alignment: center;");

        button.setOnAction(e -> {
            int idx = random.nextInt(MESSAGES.length);
            label.setText(MESSAGES[idx]);
            layout.setStyle("-fx-padding: 30; -fx-alignment: center; -fx-background-color: " + COLORS[idx] + ";");
        });

        Scene scene = new Scene(layout, 300, 200);
        stage.setTitle("Simple Fun App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}