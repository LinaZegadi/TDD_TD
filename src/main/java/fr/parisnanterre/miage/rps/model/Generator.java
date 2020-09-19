package fr.parisnanterre.miage.rps.model;

import java.util.ArrayList;
import java.util.List;

public class Generator {
    private  static RockPaperScissors.RPSEnum MovGenerator(int number)
    {
        switch (number) {
            case 0:
                return RockPaperScissors.RPSEnum.ROCK;
            case 1:
                return RockPaperScissors.RPSEnum.PAPER;
            default:
                return RockPaperScissors.RPSEnum.SCISSORS;
        }
    }
    private static RockPaperScissors.RPSEnum PlayGenerator()
    {
       int nbr = (int)(Math.random() * 3);
       return MovGenerator(nbr);
    }


    static List<RockPaperScissors.RPSEnum> RoundGenerator(int size)
    {
        List<RockPaperScissors.RPSEnum> liste = new ArrayList<>(size);
        for (int i=0; i<size; i++)
        {
         liste.add(PlayGenerator());
        }

        return liste;
    }

}
