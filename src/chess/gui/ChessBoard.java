/**
* The ChessBoard class builds and models the gui front-end of the application
*
* @author  	PurpleLiquid
* @version  0.1
* @since	January 16, 2020 
*/

package chess.gui;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class ChessBoard extends Application {
	
	@Override
	public void start(Stage stage) {
		stage.setTitle("Meringue Chess");
		
		// Add main menu
		stage.setScene(buildMainMenu());
		
		stage.show();
	}
	
	private Scene buildMainMenu() {
		Group group = new Group();
		Scene mainScene = new Scene(group, 500, 500, Color.DARKSLATEGRAY);
		mainScene.getStylesheets().add("chess/gui/styles/main.css");
		
		// Title Header
		Text mainTitleHeader = new Text(150, 50, "Chess");
		Font titleFont = Font.font("Verdana", FontWeight.BOLD, 60);
		mainTitleHeader.setFont(titleFont);
		mainTitleHeader.setWrappingWidth(200);
		mainTitleHeader.setFill(Color.BLUEVIOLET);
		mainTitleHeader.setStroke(Color.CYAN);
		mainTitleHeader.setStrokeWidth(2.5);
		mainTitleHeader.setLineSpacing(2);
		
		// Play Button
		Button playButton = new Button("Play");
		playButton.getStyleClass().add("play-button");
		playButton.setLayoutX(150);
		playButton.setLayoutY(80);
		
		// Exit Button
		Button exitButton = new Button("Exit");
		exitButton.getStyleClass().add("play-button");
		exitButton.setLayoutX(150);
		exitButton.setLayoutY(130);
		
		// Adding all made components
		group.getChildren().add(mainTitleHeader);
		group.getChildren().add(playButton);
		group.getChildren().add(exitButton);
		
		return mainScene;
	}
	
	public static void main(String[] args)  {
		launch(args);
	}
}
