package in.game.tictactoe.TicTacToe;

import in.game.tictactoe.TicTacToe.controllers.GameController;
import in.game.tictactoe.TicTacToe.models.*;
import in.game.tictactoe.TicTacToe.services.strategies.winningstrategy.ColumnWinningStrategy;
import in.game.tictactoe.TicTacToe.services.strategies.winningstrategy.DiagonalWinningStrategy;
import in.game.tictactoe.TicTacToe.services.strategies.winningstrategy.RowWinningStrategy;
import in.game.tictactoe.TicTacToe.services.strategies.winningstrategy.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        playTicTacToe();
    }

    private static void playTicTacToe() {
        System.out.println("Let's play to Tic Tac Toe!");
        List<Player> players = new ArrayList<>();

        players.add(new Player("Player-1", new Symbol('X'), PlayerType.HUMAN));
        players.add(new Player("Player-2", new Symbol('O'), PlayerType.HUMAN));
        // BOT
        //players.add(new Bot("Bot1", new Symbol('B'), BotDifficultyLevel.EASY));
        //players.add(new Bot("Bot2", new Symbol('C'), BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = List.of(
                new RowWinningStrategy(),
                new ColumnWinningStrategy(),
                new DiagonalWinningStrategy()
        );

        // Start the game
        GameController gameController = new GameController();
        gameController.startGame(players, winningStrategies);

        System.out.println(gameController.getGameState());

        // Play the game
        while (gameController.getGameState() == GameState.IN_PROGRESS) {
            gameController.printBoard();
            gameController.makeMove();
        }

        // Game over
        System.out.println("Game Over!");
        gameController.printBoard();
        if (gameController.getGameState() == GameState.ENDED) {
            System.out.println("Winner is: " + gameController.getWinner().getName());
        } else {
            System.out.println("It's a draw!");
        }
    }
}