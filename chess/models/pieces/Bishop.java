package chess.models.pieces;

import chess.*;
import chess.models.Cell;
import chess.models.Color;
import chess.models.Piece;
import chess.models.PieceName;

public class Bishop implements Piece {
    private final Color color;
    private boolean isDead;
    private final PieceName name;

    public Bishop(Color color, PieceName pieceName) {
        this.color = color;
        this.name = pieceName;
    }

    @Override
    public void move(ChessBoard board, Cell source, Cell destination) {

    }

    @Override
    public boolean isDead() {
        return isDead;
    }

    @Override
    public void setDead(boolean isDead) {
        this.isDead = isDead;
    }

    @Override
    public PieceName name() {
        return this.name;
    }

    public Color getColor() {
        return color;
    }
}
