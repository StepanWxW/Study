package RPSv2;

public enum GameField {
    STONE, PAPER, SCISSORS;
    static GameField[] getValues() {
        return new GameField[]{STONE, PAPER, SCISSORS};
    }
}

