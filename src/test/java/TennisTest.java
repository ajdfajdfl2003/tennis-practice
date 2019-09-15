import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    @Test
    public void when_1_0_then_Fifteen_Love() {
        Tennis tennis = new Tennis("Tom", "Joe");

        tennis.playerAHit();
        String score = tennis.score();

        assertEquals("Fifteen Love", score);
    }

    @Test
    public void when_0_0_then_Love_All() {
        Tennis tennis = new Tennis("Tom", "Joe");
        String score = tennis.score();

        assertEquals("Love All", score);
    }
}