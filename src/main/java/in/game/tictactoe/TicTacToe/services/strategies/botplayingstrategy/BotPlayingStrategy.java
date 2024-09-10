package in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy;

import in.game.tictactoe.TicTacToe.models.Board;
import in.game.tictactoe.TicTacToe.models.Cell;

public interface BotPlayingStrategy {
    public Cell makeMove(Board board);
}
