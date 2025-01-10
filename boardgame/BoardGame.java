package boardgame;

import boardgamemodels.Board;
import boardgamemodels.Move;
import boardgamemodels.Player;

import java.util.Queue;

public abstract class BoardGame {
    private final Board board;
    private Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players) {
        this.board = board;
        this.players = players;
    }

    public void startGame() {
        while (true) {
            Player player = players.poll();
            Move move = player.makeMove();
            board.applyMove(move);
            if (isOver()) {
                System.out.println(player.getName() + " won the game.");
                break;
            }
            players.add(player);
        }
    }

    public abstract boolean isOver();
}
