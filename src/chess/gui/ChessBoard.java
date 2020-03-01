package chess.gui;

import javafx.scene.Group;
import javafx.scene.layout.Pane;

import chess.part.ChessTile;
import chess.part.*;

public class ChessBoard extends Pane {
	public final static int TILE_SIZE = 100;
	private final int HEIGHT = 8;
	private final int WIDTH = 8;
	
	private Group tileGroup = new Group();
	private Group pieceGroup = new Group();
	
	public ChessBoard() {
		setPrefSize(HEIGHT * TILE_SIZE, WIDTH * TILE_SIZE);
		getChildren().add(tileGroup);
		getChildren().add(pieceGroup);
		
		for(int y = 0; y < HEIGHT; y++) {
			for(int x = 0; x < WIDTH; x++) {
				ChessTile tile = new ChessTile((x+y)%2 == 0, TILE_SIZE, x, y);
				
				tileGroup.getChildren().add(tile);
				
				// Dark is top side
				if(y == 0) {
					setDarkRoyals(x, y);
				}
				
				if(y == 1) {
					Pawn dPawn = new Pawn(false, TILE_SIZE, x, y);
					pieceGroup.getChildren().add(dPawn);
				}
				
				//Light is bottom side
				if(y == 6) {
					Pawn lPawn = new Pawn(true, TILE_SIZE, x, y);
					pieceGroup.getChildren().add(lPawn);
				}
				
				if(y == 7) {
					setLightRoyals(x, y);
				}
			}
		}
	}
	
	private void setDarkRoyals(int x, int y) {
		switch(x) {
			case 0:
			case 7:
				Rook rook = new Rook(false, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(rook);
				break;
			case 1:
			case 6:
				Knight knight = new Knight(false, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(knight);
				break;
			case 2:
			case 5:
				Bishop bishop = new Bishop(false, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(bishop);
				break;
			case 3:
				Queen queen = new Queen(false, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(queen);
				break;
			case 4:
				King king = new King(false, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(king);
				break;
		};
	}
	
	private void setLightRoyals(int x, int y) {
		switch(x) {
			case 0:
			case 7:
				Rook rook = new Rook(true, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(rook);
				break;
			case 1:
			case 6:
				Knight knight = new Knight(true, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(knight);
				break;
			case 2:
			case 5:
				Bishop bishop = new Bishop(true, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(bishop);
				break;
			case 3:
				Queen queen = new Queen(true, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(queen);
				break;
			case 4:
				King king = new King(true, TILE_SIZE, x, y);
				pieceGroup.getChildren().add(king);
				break;
		};
	}
	
	
}
