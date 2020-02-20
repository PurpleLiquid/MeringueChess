package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Knight extends ChessPiece {
	public Knight(boolean light, int tileSize, int x, int y) {
		super(tileSize, x, y);
		
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/knight.png");
		} else {
			image = new Image("/chess/part/resources/knight-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
	
	@Override
	public void movePiece() {}
	
	@Override
	public void overtakePiece(ChessPiece cp) {}
}
