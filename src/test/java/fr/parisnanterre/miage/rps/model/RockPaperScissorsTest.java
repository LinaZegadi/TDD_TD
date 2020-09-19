package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;

public class RockPaperScissorsTest {

     RockPaperScissors rps;

    @BeforeClass
    public void setUp()
    {
        rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown()
    {
        rps = null;
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
