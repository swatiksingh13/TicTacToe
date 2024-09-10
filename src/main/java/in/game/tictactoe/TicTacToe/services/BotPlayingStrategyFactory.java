package in.game.tictactoe.TicTacToe.services;

import in.game.tictactoe.TicTacToe.models.BotDifficultyLevel;
import in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy.BotPlayingStrategy;
import in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy.EasyBotPlayingStrategy;
import in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy.HardBotPlayingStrategy;
import in.game.tictactoe.TicTacToe.services.strategies.botplayingstrategy.MediumBotPlayingStrategy;

import static in.game.tictactoe.TicTacToe.models.BotDifficultyLevel.HARD;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        // Implement a factory method to return the bot playing strategy based on the bot difficulty level
        return switch(botDifficultyLevel) {
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }
}
