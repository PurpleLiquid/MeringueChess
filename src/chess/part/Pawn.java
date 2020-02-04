package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Pawn extends Rectangle {
	public Pawn(boolean light) {
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/pawn.png");
		} else {
			image = new Image("/chess/part/resources/pawn-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
		setHeight(200);
		setWidth(200);
		relocate(200, 200);
	}
}
