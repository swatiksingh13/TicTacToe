package in.game.tictactoe.TicTacToe.services.strategies.winningstrategy;

import in.game.tictactoe.TicTacToe.models.Board;
import in.game.tictactoe.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean isWinning(Board board, Move move);
}
