package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class King extends Rectangle {
	public King(boolean light) {
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/king.png");
		} else {
			image = new Image("/chess/part/resources/king-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
}
