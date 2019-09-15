import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    private Tennis tennis;

    @Before
    public void setUp() {
        tennis = new Tennis("Tom", "Joe");
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