package RPS;

import java.util.Random;

public class GameLogic {

public static String random() {

    Random random = new Random();
    int i = random.nextInt(3);

    String x;

    if (i == 0) x = "Rock";
    else if (i == 1) x = "Paper";
    else x = "Scissors";
    return x;


}


}

