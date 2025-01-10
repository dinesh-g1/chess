package chess;

import chess.models.Cell;
import boardgamemodels.Board;
import boardgamemodels.Move;

public class ChessBoard implements Board {
    private static final int boardSize = 8;
    private final Cell[][] cells;

    public ChessBoard() {
        this.cells = new Cell[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                cells[i][j] = new Cell(i,j);
            }
        }
    }

    @Override
    public void applyMove(Move move) {
        Cell source = move.getSource();
        source.getPiece().get().move(this, source, move.getDestination());
    }

    @Override
    public void display() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (cells[i][j].getPiece().isEmpty()) {
                    System.out.print(" - | " );
                } else {
                    System.out.print(cells[i][j].getPiece().get().name() + " | ");
                }
            }
            System.out.println();
        }
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }
}
