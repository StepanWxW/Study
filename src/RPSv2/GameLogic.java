package RPSv2;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    Field field = new Field();

    public void start() {
        field.setHuman(getHumanChange());
        field.setComputer(getComputerChange());
        winnerChange(field.getHuman(),field.getComputer());
    }

    private void winnerChange(GameField humanValue, GameField compValue) {
        //сравнение твоеЗнач с компЗнач
        GameField виннер = присвоить результат сравнения;
        System.out.println("Победил" + виннер);
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
