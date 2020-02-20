package chess.part;

import javafx.scene.shape.Rectangle;

public class ChessPiece extends Rectangle {

	public ChessPiece(int tileSize, int x, int y) {
		setHeight(tileSize);
		setWidth(tileSize);
		relocate(x * tileSize, y * tileSize);
	}
	
	// MUST OVERRIDE for Polymorphism
	public void movePiece() {}
	
	// MUST OVERRIDE for Polymorphism
	public void overtakePiece(ChessPiece cp) {}
}
