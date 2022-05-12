package RPSv2;

import java.util.Random;
import java.util.Scanner;

import static RPSv2.GameField.PAPER;

public class GameLogic {

    Field field = new Field();

    public void start() {
        System.out.println("It's game \"STONE\", \"SCISSORS\", \"PAPER\".\n Make you choice:");
        field.setHuman(getHumanChange());
        field.setComputer(getComputerChange());
        winnerChange(field.getHuman(),field.getComputer());
    }

    private void winnerChange(GameField humanValue, GameField compValue) {
        //сравнение твоеЗнач с компЗнач
        String winner = new String();

        if (humanValue == GameField.SCISSORS && compValue ==GameField.PAPER) {
            winner = "Human";
        }
        if (humanValue == GameField.SCISSORS && compValue ==GameField.SCISSORS) {
            winner = "не определен. Ничья.";
        }
        if (humanValue == GameField.SCISSORS && compValue ==GameField.STONE) {
            winner = "Computer";
        }
        if (humanValue == GameField.PAPER && compValue ==GameField.PAPER) {
            winner = "не определен. Ничья.";
        }
        if (humanValue == GameField.PAPER && compValue ==GameField.SCISSORS) {
            winner = "Computer";
        }
        if (humanValue == GameField.PAPER && compValue ==GameField.STONE) {
            winner = "Human";
        }
        if (humanValue == GameField.STONE && compValue ==GameField.PAPER) {
            winner = "Computer";
        }
        if (humanValue == GameField.STONE && compValue ==GameField.SCISSORS) {
            winner = "Human";
        }
        if (humanValue == GameField.STONE && compValue ==GameField.STONE) {
            winner = "не определен. Ничья.";
        }

        System.out.println("Победитель " + winner);
    }


    private GameField getComputerChange() {
        Random random1 = new Random();
        int i = random1.nextInt(3);
        GameField[] array = GameField.getValues();

        return GameField.STONE;
    }
    private GameField getHumanChange() {
        Scanner scan = new Scanner(System.in);
        return GameField.valueOf(scan.nextLine());
    }

}
