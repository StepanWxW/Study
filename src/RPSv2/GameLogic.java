package RPSv2;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    Field field = new Field();

    public void start() {
        System.out.println("It's game \"STONE\", \"SCISSORS\", \"PAPER\".\nMake you choice:");
        field.setHuman(getHumanChange());
        field.setComputer(getComputerChange());
        System.out.println("Computer change: " +valueOf(getComputerChange()));
        winnerChange(field.getHuman(),field.getComputer());
    }

    private GameField valueOf(GameField computerChange) {

        return computerChange;
    }

    private void winnerChange(GameField humanValue, GameField compValue) {

        String winner = null;

        if (humanValue == GameField.SCISSORS && compValue == GameField.PAPER) {
            winner = "Human";
        }
        if (humanValue == GameField.SCISSORS && compValue == GameField.SCISSORS) {
            winner = "не определен. Ничья.";
        }
        if (humanValue == GameField.SCISSORS && compValue == GameField.STONE) {
            winner = "Computer";
        }
        if (humanValue == GameField.PAPER && compValue == GameField.PAPER) {
            winner = "не определен. Ничья.";
        }
        if (humanValue == GameField.PAPER && compValue == GameField.SCISSORS) {
            winner = "Computer";
        }
        if (humanValue == GameField.PAPER && compValue == GameField.STONE) {
            winner = "Human";
        }
        if (humanValue == GameField.STONE && compValue == GameField.PAPER) {
            winner = "Computer";
        }
        if (humanValue == GameField.STONE && compValue == GameField.SCISSORS) {
            winner = "Human";
        }
        if (humanValue == GameField.STONE && compValue == GameField.STONE) {
            winner = "не определен. Ничья.";
        }

        System.out.println("Победитель " + winner);
    }


   private GameField getComputerChange() {
       return GameField.values()[new Random().nextInt(GameField.values().length)];
   }

    private GameField getHumanChange() {
        Scanner scan = new Scanner(System.in);
        return GameField.valueOf(scan.nextLine());
    }

}
