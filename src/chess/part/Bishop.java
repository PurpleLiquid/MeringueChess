package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Bishop extends Rectangle {
	public Bishop(boolean light) {
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/bishop.png");
		} else {
			image = new Image("/chess/part/resources/bishop-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
}
