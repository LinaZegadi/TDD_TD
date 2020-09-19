package fr.parisnanterre.miage.rps.model;

   public class RockPaperScissors {

    enum RPSEnum{ROCK, PAPER, SCISSORS};
    enum Result{WIN, LOST, TIE};

     public RockPaperScissors (){}

     public Result play(RPSEnum p1, RPSEnum p2)
     {
         if(p1 == p2)
             return Result.TIE;

         if ((p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK) || (p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS) || (p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER))
               return Result.WIN;

         return Result.LOST;

     }

     Result play (Player p1, Player p2)
     {
         return  Result.LOST;
     }
}
