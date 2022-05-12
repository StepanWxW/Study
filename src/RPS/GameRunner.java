package RPS;


import java.util.Scanner;

public class GameRunner {
    // вайл -чтобы бесконечно играть
    // приведение типов, как перевести инт в стринг
    public static void main(String[] arg) {

        GameLogic starter = new GameLogic();
        System.out.println(starter.toString());
        //   starter.start
        Field Print = new Field();
      //  Field.Hello();

        Scanner read = new Scanner(System.in);
        String user = read.nextLine();
        System.out.println("You wrote is: " +user);

     //   Field field = new Field();
      //  String rule = Field.rules();
       GameLogic comx = new GameLogic();
       String answer = comx.random();



           System.out.println("Computer answer: " + answer);

           switch (user + answer) {
               case "RockRock":
               case "PaperPaper":
               case "ScissorsScissors":
                   System.out.println("It's draw!");
                   break;
               case "RockPaper":
               case "PaperScissors":
               case "ScissorsRock":
                   System.out.println("You are loss.");
                   break;
               case "RockScissors":
               case "PaperRock":
               case "ScissorsPaper":
                   System.out.println("Congratulation! You are winner!");
                   break;
               default:
                   System.out.println("Something went wrong");

       }



    }

}
