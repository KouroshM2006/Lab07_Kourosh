/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab07_kourosh;

//github link: https://github.com/KouroshM2006/Lab07_Kourosh.git

import javafx.scene.control.*;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 *
 * @author kouro
 */
public class Lab07_kourosh extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        BorderPane root = new BorderPane();
        
        Pane middlepaPane = new Pane();
        
        Button startButton = new Button("Start");
        Button resetButton = new Button("Reset");
        Button exitButton = new Button("Exit");
        
        exitButton.setOnAction(e -> stage.close());
        
        HBox buttonsBox = new HBox();
        buttonsBox.getChildren().addAll(startButton, resetButton, exitButton);
        buttonsBox.setAlignment(Pos.CENTER);
        
        root.setBottom(buttonsBox);
        root.setCenter(middlepaPane);
        
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();
    }
    
}
