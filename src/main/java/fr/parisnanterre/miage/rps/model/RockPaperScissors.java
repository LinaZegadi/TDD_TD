package fr.parisnanterre.miage.rps.model;

   public class RockPaperScissors {

    enum RPSEnum{ROCK, PAPER, SCISSORS};
    enum Result{WIN, LOST, TIE};


     public Result play(RPSEnum p1, RPSEnum p2)
     {
         if ((p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK) || (p2 == RPSEnum.PAPER && p1 == RPSEnum.ROCK))
             return Result.WIN;

         if((p1 == RPSEnum.PAPER && p2 == RPSEnum.PAPER) || (p1 == RPSEnum.ROCK && p2 == RPSEnum.ROCK) ||(p1 == RPSEnum.SCISSORS && p2 == RPSEnum.SCISSORS))
             return Result.TIE;

         else
             return Result.LOST;

     }
}
