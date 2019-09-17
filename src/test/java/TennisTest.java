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
    public void when_0_2_then_Love_Thirty() {
        tennis.playerBHit();
        tennis.playerBHit();
        assertEquals("Love Thirty", tennis.score());
    }

    @Test
    public void when_0_1_then_Love_Fifteen() {
        tennis.playerBHit();
        assertEquals("Love Fifteen", tennis.score());
    }

    @Test
    public void when_3_0_then_Forty_Love() {
        givenPlayerAHitGameTimes(3);
        assertEquals("Forty Love", tennis.score());
    }

    @Test
    public void when_2_0_then_Thirty_Love() {
        givenPlayerAHitGameTimes(2);
        assertEquals("Thirty Love", tennis.score());
    }

    private void givenPlayerAHitGameTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.playerAHit();
        }
    }

    @Test
    public void when_1_0_then_Fifteen_Love() {
        givenPlayerAHitGameTimes(1);
        assertEquals("Fifteen Love", tennis.score());
    }

    @Test
    public void when_0_0_then_Love_All() {
        assertEquals("Love All", tennis.score());
    }
}