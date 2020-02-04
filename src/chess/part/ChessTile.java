package chess.part;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ChessTile extends Rectangle {
	
	public ChessTile(boolean light, int tileSize, int x, int y) {
		if(light) {
			setFill(Color.AQUA);
		} else {
			setFill(Color.DARKVIOLET);
		}
		
		setWidth(tileSize);
		setHeight(tileSize);
		relocate(x * tileSize, y * tileSize);
	}
}
