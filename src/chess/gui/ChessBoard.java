package chess.gui;

import javafx.scene.Group;
import javafx.scene.layout.Pane;

import chess.part.ChessTile;

public class ChessBoard extends Pane {
	private final int TILE_SIZE = 100;
	private final int HEIGHT = 8;
	private final int WIDTH = 8;
	
	private Group tileGroup = new Group();
	
	public ChessBoard() {
		setPrefSize(HEIGHT * TILE_SIZE, WIDTH * TILE_SIZE);
		getChildren().add(tileGroup);
		
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				ChessTile tile = new ChessTile((x+y)%2 == 0, TILE_SIZE, x, y);
				
				tileGroup.getChildren().add(tile);
			}
		}
	}
	
	
}
