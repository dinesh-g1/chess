package chess;

import chess.models.PieceName;
import chess.players.ChessPlayer;
import boardgame.BoardGame;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ChessGame extends BoardGame {
    private final ChessPlayer player1, player2;

    public ChessGame(ChessBoard board, ChessPlayer player1, ChessPlayer player2) {
        super(board, new ArrayDeque<>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).isDead()
                || player2.getPiece(PieceName.KING).isDead();
    }
}
