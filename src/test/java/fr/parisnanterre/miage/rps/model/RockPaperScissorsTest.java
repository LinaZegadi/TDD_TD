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

    @Parameters ({"ciseaux","papier"})
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
