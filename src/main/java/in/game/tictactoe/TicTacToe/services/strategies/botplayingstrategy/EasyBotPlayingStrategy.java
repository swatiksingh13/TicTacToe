package in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy;

import in.game.tictactoe.TicTacToe.models.Board;
import in.game.tictactoe.TicTacToe.models.Cell;
import in.game.tictactoe.TicTacToe.models.CellState;

public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    public Cell makeMove(Board board) {
        // Generate a random move
        int row, col;
        do {
            row = (int) (Math.random() * board.getDimension());
            col = (int) (Math.random() * board.getDimension());
        } while (board.getBoard().get(row).get(col).getCellState() != CellState.EMPTY);

        return new Cell(row, col);
    }
}
