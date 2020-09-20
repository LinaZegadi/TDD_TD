package fr.parisnanterre.miage.rps.model;

import java.util.List;

public class Player {
    public String name;
    public int  score;
    //Collection de mouvements
    public List<RockPaperScissors.RPSEnum> move;

    public  Player(String name, List<RockPaperScissors.RPSEnum> move)
    {
        this.name = name;
        this.move = move;

    }
    private int index;

    public  Player(String name)
    {
        this.name = name;
        //Generer la collection de mouvements
        this.move = Generator.RoundGenerator(10);
        index = 0;
    }

   //Getter
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    //Nombre de mouvements
    public int getMove() {
        return move.size();
    }
    //Methode qui retourne le prochain élément de la collection des mouvements
    public RockPaperScissors.RPSEnum NextMove() {
        index ++;
        return move.get(index-1);
    }

    //Setter
    public void setScore(int score) {
        this.score = score;
    }

}
