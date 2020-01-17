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

public class ChessBoard extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Meringue Chess");
		stage.show();
	}
	
	public static void main(String[] args)  {
		launch(args);
	}
	
}
