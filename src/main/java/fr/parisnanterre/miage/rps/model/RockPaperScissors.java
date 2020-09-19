package fr.parisnanterre.miage.rps.model;

   public class RockPaperScissors {

       enum RPSEnum {ROCK, PAPER, SCISSORS}

       ;

       enum Result {WIN, LOST, TIE}

       ;

       public RockPaperScissors() {
       }

       public Result play(RPSEnum p1, RPSEnum p2) {
           if (p1 == p2)
               return Result.TIE;

           if ((p1 == RPSEnum.PAPER && p2 == RPSEnum.ROCK) || (p1 == RPSEnum.ROCK && p2 == RPSEnum.SCISSORS) || (p1 == RPSEnum.SCISSORS && p2 == RPSEnum.PAPER))
               return Result.WIN;

           return Result.LOST;

       }

       Result play(Player p1, Player p2) {

           Result round;

           for (int i = 0; i < p1.getMove(); i++)
           {
               round = play(p1.NextMove(), p2.NextMove());

               if(round == Result.WIN)
                    p1.setScore(p1.getScore()+1);

               else if(round == Result.WIN)
               {
                   p1.setScore(p1.getScore() + 1);
                   p2.setScore(p2.getScore() + 1);
               }

               else
                   p2.setScore(p2.getScore() + 1);
           }

          if(p1.getScore() > p2.getScore())
              return  Result.WIN;

          else if(p1.getScore() < p2.getScore())
               return  Result.LOST;

          else
              return Result.TIE;
       }
   }
