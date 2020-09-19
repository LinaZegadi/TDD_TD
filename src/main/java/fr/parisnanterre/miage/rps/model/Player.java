package fr.parisnanterre.miage.rps.model;

import java.util.List;

public class Player {
    public String name;
    public int  score;
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
        this.move = Generator.RoundGenerator(10);
        index = 0;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getMove() {
        return move.size();
    }

    public RockPaperScissors.RPSEnum NextMove() {
        index ++;
        return move.get(index-1);
    }

    public void setScore(int score) {
        this.score = score;
    }

}
