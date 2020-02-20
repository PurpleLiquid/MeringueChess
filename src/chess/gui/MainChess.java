/**
* The ChessBoard class builds and models the gui front-end of the application
*
* @author  	PurpleLiquid
* @version  0.1
* @since	January 16, 2020 
*/

package chess.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainChess extends Application {
	
	@Override
	public void start(Stage stage) {
		MainMenu mm = new MainMenu();
		ChessBoard cb = new ChessBoard();
		Scene s = new Scene(cb);
		stage.setTitle("Meringue Chess");
		
		// Add main menu
		stage.setScene(s);
		
		stage.show();
	}
	
	public static void main(String[] args)  {
		launch(args);
	}
}
