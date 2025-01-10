package chess.models;

import java.util.Optional;

public class Cell {
    private final int x;
    private final int y;
    private boolean isFilled;
    private Optional<Piece> piece;

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
        this.piece = Optional.empty();
        this.isFilled = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public Optional<Piece> getPiece() {
        return piece;
    }

    public void setPiece(Optional<Piece> piece) {
        this.piece = piece;
    }
}
