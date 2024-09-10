package in.game.tictactoe.TicTacToe.controllers;

import in.game.tictactoe.TicTacToe.models.GameState;
import in.game.tictactoe.TicTacToe.models.Player;
import in.game.tictactoe.TicTacToe.services.GameService;
import in.game.tictactoe.TicTacToe.services.strategies.winningstrategy.WinningStrategy;

import java.util.List;

public class GameController {
    private GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public void startGame(List<Player> players, List<WinningStrategy> winningStrategies) {
        gameService.startGame(players, winningStrategies);
    }

    public void makeMove() {
        gameService.makeMove();
    }

    public GameState getGameState() {
        return gameService.getGameState();
    }

    public Player getWinner() {
        return gameService.getWinner();
    }

    public void printBoard() {
        gameService.printBoard();
    }
}
