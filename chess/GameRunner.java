package chess;

import boardgamemodels.Player;
import chess.models.Piece;
import chess.models.PieceName;
import chess.players.ChessPlayer;
import chess.players.HumanPlayer;

import java.util.HashMap;
import java.util.Map;

public class GameRunner {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        //need to initialize pieces;
        Map<PieceName, Piece> pieces = new HashMap<>();
        ChessPlayer player1 = new HumanPlayer("Shekar", pieces,chessBoard);
        ChessPlayer player2 = new HumanPlayer("Janaki", pieces, chessBoard);
        ChessGame game = new ChessGame(chessBoard, player1, player2);
        game.startGame();
    }
}
