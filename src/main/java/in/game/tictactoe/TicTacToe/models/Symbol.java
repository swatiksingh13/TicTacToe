package in.game.tictactoe.TicTacToe.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Symbol {
    private char symbol;

    public Symbol(char symbol) {
        this.symbol = symbol;
    }
}