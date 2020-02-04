package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;

public class Knight extends Rectangle {
	public Knight(boolean light) {
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/knight.png");
		} else {
			image = new Image("/chess/part/resources/knight-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
	}
}
