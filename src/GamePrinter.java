/**
 * Created by 54167208T on 24/01/2017.
 */
public class GamePrinter {
    public static void printInstructions(){

        System.out.println("Escoge Piedra(0), Papel(1), Tijera(2)");


    }

    public static void optionNotValid() {
        System.out.println("Introduce a number between 0 and 2.");
    }


    public static void printResult(Result result){
        System.out.println( result.name() + " has won.");
    }

    public static void printWinner(Result result){
        System.out.println( result.name() + " has won the game!!!");
    }

}
