package chess.players;

import chess.ChessBoard;
import chess.models.Piece;
import chess.models.PieceName;
import boardgamemodels.Move;

import java.util.Map;

public class ComputerPlayer extends ChessPlayer{
    public ComputerPlayer(String name, Map<PieceName, Piece> pieces, ChessBoard board) {
        super(name, pieces, board);
    }

    @Override
    public Move makeMove() {
        return null;
    }
}
