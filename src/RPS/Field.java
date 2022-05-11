package RPS;

public class Field {
    
    //два поля, в которыхх буду записывать твой выбор ии выбор компьютера
    // определитьь что будет кмень ножницы бумага, почитать про енамы (комень, нож, бумага)
    
    // как перепрыгивать на новую сторку
    // статик класс изучить
    static void hello() {
        System.out.println("Hello! It's game: Rock, Paper, Scissors!");
     //   System.out.println("If need rules please write the word \"rule\" ");
        System.out.println("If you know the rules, then write: \"Rock\", \"Paper\", \"Scissors\": ");

    }
    static void rules() {
        System.out.println("The rules are very simple:");
        System.out.println("You choose one of thee element: Rock, Paper, Scissors.");
        System.out.println("Then the computer selects: rock or paper or scissors.");
        System.out.println("Then the winner is determined according to the rules:");
        System.out.println("Paper wins rock, rock wins scissors, scissors wins paper");
        
    }
}
