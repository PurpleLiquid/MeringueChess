package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class Bishop extends ChessPiece {
	public Bishop(boolean light, int tileSize, int x, int y) {
		super(tileSize, x, y);
		
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/bishop.png");
		} else {
			image = new Image("/chess/part/resources/bishop-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
	
	@Override
	public void movePiece() {}
	
	@Override
	public void overtakePiece(ChessPiece cp) {}
}
