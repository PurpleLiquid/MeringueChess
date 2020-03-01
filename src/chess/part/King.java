package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

public class King extends ChessPiece {
	public King(boolean light, int tileSize, int x, int y) {
		super(tileSize, x, y);
		
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/king.png");
		} else {
			image = new Image("/chess/part/resources/king-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
	
	@Override
	public void movePiece(double x, double y) {}
	
	@Override
	public void overtakePiece(ChessPiece cp) {}
}
