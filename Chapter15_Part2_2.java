/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                    Chapter 15, Part 2: Problem 2                                         *****
 *****__________________________________________________________________________________________________________*****
 *****                      2. Write a program which accepts MouseClicked actions and                           *****
 *****                        adds the current x,y coordinate as a point in a new line,                         *****
 *****                               draw that line, attaching to the old point.                                *****
 *****                        For this to work, the original <x,y> will start at 50,50.                         *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import javafx.stage.Stage;


public class Chapter15_Part2_2 extends Application {

    // CLASS VARIABLE(s) declaration(s)
    private Pane pane;
    private Line line;
    private double oldX = 50;
    private double oldY = 50;
    private double newX, newY;


    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage){
        // Initialize the Pane
        pane = new Pane();

        // MouseClicked EventHandler
        pane.setOnMouseClicked(e ->{
            newX = e.getSceneX();
            newY = e.getSceneY();
            line = new Line(oldX, oldY, newX, newY);
            pane.getChildren().add(line);
            oldX = newX;
            oldY = newY;
        });

        // Create the Scene with the Pane, Set the Title, Set the Scene to the Stage, Show the Stage
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 15, Part 2: Problem 2: Drawing Lines");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
