package in.game.tictactoe.TicTacToe.models;

import in.game.tictactoe.TicTacToe.services.BotPlayingStrategyFactory;
import in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy.BotPlayingStrategy;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bot extends Player{
    private BotDifficultyLevel difficultyLevel;

    public Bot(String name, Symbol symbol, BotDifficultyLevel difficultyLevel) {
        super(name, symbol, PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
    }

    public Cell makeMove(Board board) {
        System.out.println(this.getName() + "'s turn");
        BotPlayingStrategy botPlayingStrategy = BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel);
        return botPlayingStrategy.makeMove(board);
    }

}
