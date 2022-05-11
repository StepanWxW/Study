package RPSv2;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {



    public void start() {
        Scanner scan = new Scanner(System.in);
        GameField change = GameField.valueOf(scan.nextLine()); ////зачемто валуеоф>>> погуглил вроде
                                                                // типа в нужнный формат переводит

        Field field = new Field();
        field.setComputer(random());
        field.setHuman(change);
        методВыборПобедителя(field.getHuman(), field.getComputer());

    }
    private void методВыборПобедителя(GameField твоеЗнач, GameField компЗнач) {
        //сравнение твоеЗнач с компЗнач
        GameField виннер = присвоить результат сравнения;
        System.out.println("Победил" + виннер);
    }


    public GameField random() {

        Random random1 = new Random();
        int i = random1.nextInt(3);

        GameField x;


        if (i == 0) x = "Rock";
        else if (i == 1) x = "Paper";
        else x = "Scissors";
        return x;
    }

    private GameField твое знач(){
        метод ввода
                перевод в enum
                return enumEtot;
    }

}
