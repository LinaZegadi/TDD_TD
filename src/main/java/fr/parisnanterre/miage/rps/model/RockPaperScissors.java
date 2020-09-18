package fr.parisnanterre.miage.rps.model;

public class RockPaperScissors {

   public RockPaperScissors()   {}

    enum RPSEnum{ROCK, PAPER, SCISSORS};
    enum Result{WIN, LOST, TIE};


     public Result play(RPSEnum p1, RPSEnum p2) {
             return Result.LOST;

     }
}
