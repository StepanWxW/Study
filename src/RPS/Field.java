package RPS;

public class Field {

    static void Hello() {
        System.out.println("Hello! It's game: Rock, Paper, Scissors!");
     //   System.out.println("If need rules please write the word \"rule\" ");
        System.out.println("If you know the rules, then write: \"Rock\", \"Paper\", \"Scissors\": ");

    }
    static String rules() {
        System.out.println("The rules are very simple:");
        System.out.println("You choose one of thee element: Rock, Paper, Scissors.");
        System.out.println("Then the computer selects: rock or paper or scissors.");
        System.out.println("Then the winner is determined according to the rules:");
        System.out.println("Paper wins rock, rock wins scissors, scissors wins paper");
        return null;
    }
}
