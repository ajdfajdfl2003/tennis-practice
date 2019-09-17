import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    private Tennis tennis;

    @Before
    public void setUp() {
        tennis = prepareTennis();
    }

    private Tennis prepareTennis() {
        return new Tennis();
    }

    @Test
    public void when_2_0_then_Thirty_Love() {
        tennis.playerAHit();
        tennis.playerAHit();
        assertEquals("Thirty Love", tennis.score());
    }

    @Test
    public void when_1_0_then_Fifteen_Love() {
        tennis.playerAHit();
        assertEquals("Fifteen Love", tennis.score());
    }

    @Test
    public void when_0_0_then_Love_All() {
        assertEquals("Love All", tennis.score());
    }
}