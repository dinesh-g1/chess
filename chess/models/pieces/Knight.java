package chess.models.pieces;

import chess.*;
import chess.models.Cell;
import chess.models.Color;
import chess.models.Piece;
import chess.models.PieceName;

public class Knight implements Piece {
    private final Color color;
    private final PieceName name;
    private boolean isDead;

    public Knight(Color color, PieceName name) {
        this.color = color;
        this.name = name;
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
