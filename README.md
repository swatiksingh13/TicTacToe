# TicTacToe

# Tic-Tac-Toe Game 🎮

This is a customizable Tic-Tac-Toe game implemented in Java with multiple difficulty levels for bot gameplay. The game allows both human and bot players, with different winning strategies.
---

## Features ✨
- Multiplayer: Supports multiple players.
- Bot Play: Includes bots with varying difficulty levels (Easy, Medium, Hard).
- Flexible Winning Strategies: Implement different winning strategies (row, column, diagonal).
- Dynamic Game State: View the game state and the current status of the board.
- Modular Design: Easily extendable with new strategies or difficulty levels.

## Classes Overview
-- GameController.java
This class is responsible for managing the interaction between the user and the GameService. It initializes the game, accepts moves, and displays the game board.

-- GameService.java
Handles all the core game logic such as starting a new game, making moves, checking for the winner, and managing the game state.

Bot Difficulty Levels
EasyBotPlayingStrategy: Plays randomly.
MediumBotPlayingStrategy: Makes somewhat smarter moves but can still make mistakes.
HardBotPlayingStrategy: Tries to win or block every turn.
Winning Strategies
RowWinningStrategy: Checks if all cells in a row belong to the same player.
ColumnWinningStrategy: Checks if all cells in a column belong to the same player.
DiagonalWinningStrategy: Checks for a diagonal win condition.
---
## Tech Stack 🔧
- **Java**: Core programming language used
- **OOP Principles**: To ensure clean and modular code
- **Design Patterns**: Includes the **Strategy** and **Controller** patterns for game logic

---
