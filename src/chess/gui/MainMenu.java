package chess.gui;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class MainMenu {
	public MainMenu() {
		// Nothing for now
	}
	
	public Scene buildMainMenu() {
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
}
