package chess.players;

import chess.ChessBoard;
import chess.models.Piece;
import chess.models.PieceName;
import boardgamemodels.Move;
import boardgamemodels.Player;

import java.util.Map;
import java.util.NoSuchElementException;

public abstract class ChessPlayer extends Player {
    private final Map<PieceName, Piece> pieces;
    private final ChessBoard board;

    public ChessPlayer(String name, Map<PieceName, Piece> pieces, ChessBoard board) {
        super(name);
        this.pieces = pieces;
        this.board = board;
    }

    @Override
    public abstract Move makeMove();

    public Piece getPiece(PieceName pieceName) {
        if (!this.pieces.containsKey(pieceName)) {
            throw new NoSuchElementException(this.getName() + " does not have " + pieceName.name());
        }
        return this.pieces.get(pieceName);
    }

    public Map<PieceName, Piece> getPieces() {
        return pieces;
    }

    public ChessBoard getBoard() {
        return board;
    }
}
