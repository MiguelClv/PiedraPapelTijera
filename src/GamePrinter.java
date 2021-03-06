/**
 * Created by 54167208T on 24/01/2017.
 */
public class GamePrinter {
    public static void printInstructions(){

        System.out.println("");
        System.out.println("Choose Rock(0), Paper(1) or Scissors(2).");


    }

    public static void optionNotValid() {
        System.out.println("Introduce a number between 0 and 2.");
    }

    public static void printComputerMove(Move move){
        System.out.println("The computer chose " + move);
    }


    public static void printResult(Result result, GameState game){
        if (result.equals(Result.COMPUTER) || result.equals(Result.HUMAN)) {
            System.out.println(result.name() + " has won.");
        }
        else {
            System.out.println("Draw.");
        }

        System.out.println("Current score: ");
        System.out.println("Human score: " + game.getHumanScore());
        System.out.println("Computer score: " + game.getComputerScore());


    }

    public static void printWinner(Result result){
        System.out.println( result.name() + " has won the game!!!");
    }
}
