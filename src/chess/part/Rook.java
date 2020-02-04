package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Rook extends Rectangle {
	public Rook(boolean light) {
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/rook.png");
		} else {
			image = new Image("/chess/part/resources/rook-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
}
