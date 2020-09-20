package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class RockPaperScissorsTest {

     RockPaperScissors rps;
     Player  player1, player2, player3;

    @BeforeClass
    public void setUp()
    {
        rps = new RockPaperScissors();

        List<RockPaperScissors.RPSEnum> WinMouv = new ArrayList<>();
        List<RockPaperScissors.RPSEnum> LostMouv = new ArrayList<>();

        assingWin(WinMouv);
        assingLost(LostMouv);

        player1 = new Player("player1",WinMouv);
        player2 = new Player("player2",LostMouv);
        player3 = new Player("player3",WinMouv);
    }

    @AfterClass
    public void tearDown()
    {
        rps = null;
        //Liberer les ressources
        player1 = null;
        player2 = null;
    }

    private void assingWin(List<RockPaperScissors.RPSEnum> m)
    {
        m.add(RockPaperScissors.RPSEnum.ROCK);
        m.add(RockPaperScissors.RPSEnum.PAPER);
        m.add(RockPaperScissors.RPSEnum.PAPER);
    }

    private void assingLost(List<RockPaperScissors.RPSEnum> m)
    {
        m.add(RockPaperScissors.RPSEnum.SCISSORS);
        m.add(RockPaperScissors.RPSEnum.ROCK);
        m.add(RockPaperScissors.RPSEnum.PAPER);
    }
    @Parameters({"papier" ,"pierre"})
    @Test
    public void testWinPlay(String p1, String p2) {
        assertEquals(rps.play(RockPaperScissors.RPSEnum.valueOf(p1), RockPaperScissors.RPSEnum.valueOf(p2)), RockPaperScissors.Result.WIN);

    }

   @Parameters ({"papier", "papier"})
    @Test
    public void testTiePlay(String p1, String p2)
    {
        assertEquals(rps.play(RockPaperScissors.RPSEnum.valueOf(p1), RockPaperScissors.RPSEnum.valueOf(p2)), RockPaperScissors.Result.TIE);

    }

    @Parameters ({"papier","ciseaux"})
    @Test
    public void testLostPlay(String p1, String p2)
    {
        assertEquals(rps.play(RockPaperScissors.RPSEnum.valueOf(p1), RockPaperScissors.RPSEnum.valueOf(p2)), RockPaperScissors.Result.LOST);

    }
    @DataProvider(name = "winData")
    public Object[][] createWinPlay()
    {
        return new Object[][]{{RockPaperScissors.RPSEnum.ROCK,RockPaperScissors.RPSEnum.SCISSORS},{RockPaperScissors.RPSEnum.SCISSORS,RockPaperScissors.RPSEnum.PAPER},{RockPaperScissors.RPSEnum.PAPER,RockPaperScissors.RPSEnum.ROCK}};
    }

    @Test (dataProvider = "winData")
    public void testWinPlayProvider (RockPaperScissors.RPSEnum p1, RockPaperScissors.RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2), RockPaperScissors.Result.WIN);

    }


    @DataProvider(name = "tieData")
    public Object[][] createTiePlay()
    {
        return new Object[][]{{RockPaperScissors.RPSEnum.ROCK,RockPaperScissors.RPSEnum.ROCK},{RockPaperScissors.RPSEnum.SCISSORS,RockPaperScissors.RPSEnum.SCISSORS},{RockPaperScissors.RPSEnum.PAPER,RockPaperScissors.RPSEnum.PAPER}};
    }

    @Test (dataProvider = "tieData")
    public void testTiePlayProvider (RockPaperScissors.RPSEnum p1, RockPaperScissors.RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2), RockPaperScissors.Result.TIE);

    }


    @DataProvider(name = "lostData")
    public Object[][] createLostPlay()
    {
        return new Object[][]{{RockPaperScissors.RPSEnum.SCISSORS,RockPaperScissors.RPSEnum.ROCK},{RockPaperScissors.RPSEnum.PAPER,RockPaperScissors.RPSEnum.SCISSORS},{RockPaperScissors.RPSEnum.ROCK,RockPaperScissors.RPSEnum.PAPER}};
    }

    @Test (dataProvider = "lostData")
    public void testLostPlayProvider (RockPaperScissors.RPSEnum p1, RockPaperScissors.RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2), RockPaperScissors.Result.LOST);

    }



}
