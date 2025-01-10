package chess.models;

import chess.ChessBoard;

public interface Piece {
    void move(ChessBoard board, Cell source, Cell destination);
    boolean isDead();
    void setDead(boolean isDead);
    PieceName name();
}
