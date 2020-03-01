package chess.part;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import chess.gui.ChessBoard;

public class Pawn extends ChessPiece {
	private double mouseX, mouseY;
	private double oldX, oldY;
	
	public Pawn(boolean light, int tileSize, int x, int y) {
		super(tileSize, x, y);
		movePiece(x, y);
		
		Image image = null;
		
		if(light) {
			image = new Image("/chess/part/resources/pawn.png");
		} else {
			image = new Image("/chess/part/resources/pawn-black.png");
		}
		
		ImagePattern imagePattern = new ImagePattern(image);
		
		setFill(imagePattern);
		
		setOnMousePressed(e->{
			mouseX = e.getSceneX();
			mouseY = e.getSceneY();
		});
		
		setOnMouseDragged(e -> {
            relocate(e.getSceneX() - mouseX + oldX, e.getSceneY() - mouseY + oldY);
        });
	}
	
	@Override
	public void movePiece(double x, double y) {
		oldX = x * ChessBoard.TILE_SIZE;
        oldY = y * ChessBoard.TILE_SIZE;
        relocate(oldX, oldY);
	}
	
	@Override
	public void overtakePiece(ChessPiece cp) {}
	
}
