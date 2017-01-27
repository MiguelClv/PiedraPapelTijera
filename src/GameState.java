/**
 * Created by 54167208T on 19/01/2017.
 */
public class GameState {
    private int humanScore = 0;
    private int computerScore = 0;

    public int getHumanScore() {
        return humanScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public int increaseHumanScore(){
        humanScore++;
        return humanScore;
    }

    public int increaseComputerScore(){
        computerScore++;
        return computerScore;
    }

    public boolean isOver(){
        if (humanScore==3 || computerScore==3){
            return true;
        }
        else {
            return false;
        }
    }

    public Result winnerMove(Move human, Move computer){
        if (human.equals(Move.ROCK)  && computer.equals(Move.PAPER)){
            return Result.COMPUTER ;
        }
        if (human.equals(Move.PAPER) && computer.equals(Move.ROCK)){
            return Result.HUMAN;
        }
        if (human.equals(Move.SCISSORS) && computer.equals(Move.PAPER)){
            return Result.HUMAN;
        }
        if (human.equals(Move.PAPER) && computer.equals(Move.SCISSORS)){
            return Result.COMPUTER;
        }
        if (human.equals(Move.SCISSORS) && computer.equals(Move.ROCK)){
            return Result.COMPUTER;
        }
        if (human.equals(Move.ROCK) && computer.equals(Move.SCISSORS)){
            return Result.HUMAN;
        }
        return null;
    }

    public Result getWinner(){
        if (humanScore==3){
            return Result.HUMAN;
        }
        else if (computerScore==3){
            return Result.COMPUTER;
        }
        return null;
    }
}
