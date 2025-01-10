package chess;

import chess.models.Piece;
import chess.models.PieceName;
import chess.players.ChessPlayer;
import boardgame.BoardGame;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ChessGame extends BoardGame {
    private static final int row7 = 7, row6 = 6, row0 = 0, row1 = 1;
    private final ChessPlayer player1, player2;

    public ChessGame(ChessBoard board, ChessPlayer player1, ChessPlayer player2) {
        super(board, new ArrayDeque<>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
        prepareTheBoard(this.player1, this.player2, board);
    }

    private void prepareTheBoard(ChessPlayer player1, ChessPlayer player2, ChessBoard board) {
        preparePlayer1Pieces(player1, board);
        preparePlayer2Pieces(player2, board);
    }

    private void preparePlayer2Pieces(ChessPlayer player2, ChessBoard board) {
        prepareKing(row7, player2, board);
        prepareQueen(row7, player2, board);
        prepareBishops(row7, player2, board);
        prepareKnights(row7, player2, board);
        prepareRooks(row7, player2, board);
        preparePawns(row6, player2, board);
    }

    private void preparePlayer1Pieces(ChessPlayer player1, ChessBoard board) {
        prepareKing(row0, player1, board);
        prepareQueen(row0, player1, board);
        prepareBishops(row0, player1, board);
        prepareKnights(row0, player1, board);
        prepareRooks(row0, player1, board);
        preparePawns(row1, player1, board);
    }

    private void prepareKing(int row, ChessPlayer player2, ChessBoard board) {
        int col = 4;
        player2.putPiece(row, col, player2.getPiece(PieceName.KING));
    }

    private void prepareQueen(int row, ChessPlayer player2, ChessBoard board) {
        int col = 3;
        player2.putPiece(row, col, player2.getPiece(PieceName.QUEEN));
    }

    private void prepareKnights(int row, ChessPlayer player2, ChessBoard board) {
        List<PieceName> pieces = Arrays.asList(PieceName.KNIGHT1, PieceName.KNIGHT2);
        int col = 1;
        for (PieceName pn : pieces) {
            player2.putPiece(row, col, player2.getPiece(pn));
            col += 5;
        }
    }

    private void prepareBishops(int row, ChessPlayer player2, ChessBoard board) {
        List<PieceName> pieces = Arrays.asList(PieceName.BISHOP1, PieceName.BISHOP2);
        int col = 2;
        for (PieceName pn : pieces) {
            player2.putPiece(row, col, player2.getPiece(pn));
            col += 3;
        }
    }

    private void prepareRooks(int row, ChessPlayer player2, ChessBoard board) {
        List<PieceName> pieces = Arrays.asList(PieceName.ROOK1, PieceName.ROOK2);
        int col = 0;
        for (PieceName pn : pieces) {
            player2.putPiece(row, col, player2.getPiece(pn));
            col += 7;
        }
    }

    private void preparePawns(int row, ChessPlayer player2, ChessBoard board) {
        List<PieceName> pieces = Arrays.asList(PieceName.PAWN1, PieceName.PAWN2, PieceName.PAWN3,
                PieceName.PAWN4, PieceName.PAWN5, PieceName.PAWN6, PieceName.PAWN7, PieceName.PAWN8);
        int col = 0;
        for (PieceName pn : pieces) {
            player2.putPiece(row, col++, player2.getPiece(pn));
        }
    }

    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).isDead()
                || player2.getPiece(PieceName.KING).isDead();
    }
}
