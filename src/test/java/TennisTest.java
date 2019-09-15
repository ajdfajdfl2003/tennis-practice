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

    @Test
    public void when_0_2_then_Love_Thirty() {
        givenPlayerBGameTimes(2);
        assertEquals("Love Thirty", tennis.score());
    }

    @Test
    public void when_5_3_then_Tom_Win() {
        givenPlayerAGameTimes(5);
        givenPlayerBGameTimes(3);
        assertEquals("Tom Win", tennis.score());
    }

    @Test
    public void when_3_5_then_Joe_Win() {
        givenPlayerAGameTimes(3);
        givenPlayerBGameTimes(5);
        assertEquals("Joe Win", tennis.score());
    }

    @Test
    public void when_3_4_then_playerB_Adv() {
        givenPlayerAGameTimes(3);
        givenPlayerBGameTimes(4);
        assertEquals("Joe Adv", tennis.score());
    }

    @Test
    public void when_4_3_then_playerA_Adv() {
        givenPlayerAGameTimes(4);
        givenPlayerBGameTimes(3);
        assertEquals("Tom Adv", tennis.score());
    }

    @Test
    public void when_4_4_then_Deuce() {
        givenPlayerAGameTimes(4);
        givenPlayerBGameTimes(4);
        assertEquals("Deuce", tennis.score());
    }

    @Test
    public void when_3_3_then_Deuce() {
        givenPlayerAGameTimes(3);
        givenPlayerBGameTimes(3);
        assertEquals("Deuce", tennis.score());
    }

    @Test
    public void when_2_2_then_Thirty_All() {
        givenPlayerAGameTimes(2);
        givenPlayerBGameTimes(2);
        assertEquals("Thirty All", tennis.score());
    }

    @Test
    public void when_1_1_then_Fifteen_All() {
        givenPlayerAGameTimes(1);
        givenPlayerBGameTimes(1);

        assertEquals("Fifteen All", tennis.score());
    }

    @Test
    public void when_0_1_then_Love_Fifteen() {
        givenPlayerBGameTimes(1);
        assertEquals("Love Fifteen", tennis.score());
    }

    private void givenPlayerBGameTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.playerBHit();
        }
    }

    @Test
    public void when_3_0_then_Forty_Love() {
        givenPlayerAGameTimes(3);
        assertEquals("Forty Love", tennis.score());
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