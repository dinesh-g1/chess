package chess.players;

import chess.ChessBoard;
import chess.models.Cell;
import chess.models.Piece;
import chess.models.PieceName;
import boardgamemodels.Move;

import java.util.Map;
import java.util.Scanner;

public class ComputerPlayer extends ChessPlayer{
    public ComputerPlayer(String name, Map<PieceName, Piece> pieces, ChessBoard board) {
        super(name, pieces, board);
    }

    @Override
    public Move makeMove() {
        Scanner input = new Scanner(System.in);
        int sx = input.nextInt(), sy = input.nextInt();
        Cell source = getBoard().getCell(sx, sy);
        int dx = input.nextInt(), dy = input.nextInt();
        Cell destination = new Cell(dx, dy);
        input.close();
        return new Move(source, destination);
    }
}
