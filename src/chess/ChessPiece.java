package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {   // a cor pode ser acessada 
								// nao tem set pq a cor nao pode ser mudada 	
		return color;
	}

}
