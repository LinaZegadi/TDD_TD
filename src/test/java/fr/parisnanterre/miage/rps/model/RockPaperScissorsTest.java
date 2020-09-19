package fr.parisnanterre.miage.rps.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class RockPaperScissorsTest {

     RockPaperScissors rps;

    @BeforeMethod
    public void setUp()
    {
        rps = new RockPaperScissors();
    }

    @AfterMethod
    public void tearDown()
    {
        rps = null;
    }

    @Parameters({"papier" ,"pierre"})
    @Test
    public void testWinPlay(String p1, String p2) {
        assertEquals(rps.play(RockPaperScissors.RPSEnum.valueOf(p1), RockPaperScissors.RPSEnum.valueOf(p2)), RockPaperScissors.Result.WIN);

    }

    @Parameters ({"ciseaux", "papier", "ciseaux", "papier"})
    @Test
    public void testTiePlay(String p1, String p2)
    {
        assertEquals(rps.play(RockPaperScissors.RPSEnum.valueOf(p1), RockPaperScissors.RPSEnum.valueOf(p2)), RockPaperScissors.Result.WIN);

    }

    @Parameters ({ "papier" ," ciseaux" })
    @Test
    public void testLostPlay(String p1, String p2)
    {
        assertEquals(rps.play(RockPaperScissors.RPSEnum.valueOf(p1), RockPaperScissors.RPSEnum.valueOf(p2)), RockPaperScissors.Result.LOST);

    }
    @Test (dataProvider = "winData")
    public void testWinPlay (RockPaperScissors.RPSEnum p1, RockPaperScissors.RPSEnum p2)
    {

    }

    @Test (dataProvider = "tieData")
    public void testTiePlay (RockPaperScissors.RPSEnum p1, RockPaperScissors.RPSEnum p2)
    {

    }
    @Test (dataProvider = "lostData")
    public void testLostPlay (RockPaperScissors.RPSEnum p1, RockPaperScissors.RPSEnum p2)
    {

    }

}
