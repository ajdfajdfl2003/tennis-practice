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
    public void when_2_0_then_Thirty_Love() {
        givenPlayerAGameTimes(2);
        assertEquals("Thirty Love", tennis.score());
    }

    @Test
    public void when_1_0_then_Fifteen_Love() {
        givenPlayerAGameTimes(1);
        assertEquals("Fifteen Love", tennis.score());
    }

    private void givenPlayerAGameTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.playerAHit();
        }
    }

    @Test
    public void when_0_0_then_Love_All() {
        assertEquals("Love All", tennis.score());
    }
}