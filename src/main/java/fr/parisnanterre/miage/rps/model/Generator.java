package fr.parisnanterre.miage.rps.model;

import java.util.ArrayList;
import java.util.List;


public class Generator {

    // Methode qui attribut un nombre (0, 1, 2) à papier, ciseaux et pierre
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

    // Methode qui genere aléatoirement un nombre (0, 1, 2) à papier, ciseaux et pierre
    private static RockPaperScissors.RPSEnum PlayGenerator()
    {
       int nbr = (int)(Math.random() * 3);
       return MovGenerator(nbr);
    }

   //Methode pour generer les rounds
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
