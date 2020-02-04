package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Queen extends Rectangle {
	public Queen(boolean light) {
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/queen.png");
		} else {
			image = new Image("/chess/part/resources/queen-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
}
