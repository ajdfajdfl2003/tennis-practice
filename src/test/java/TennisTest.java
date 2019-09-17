import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    private Tennis tennis;

    @Before
    public void setUp() {
        tennis = prepareTennis("Tom", "Joe");
    }

    private Tennis prepareTennis(String firstPlayerName, String secondPlayerName) {
        return new Tennis(firstPlayerName, secondPlayerName);
    }

    @Test
    public void when_5_4_then_FirstPlayer_Adv() {
        givenPlayerAHitGameTimes(5);
        givenPlayerBHitGameTimes(4);
        assertEquals("Tom Adv", tennis.score());
    }

    @Test
    public void when_4_4_then_Deuce() {
        givenPlayerAHitGameTimes(4);
        givenPlayerBHitGameTimes(4);
        assertEquals("Deuce", tennis.score());
    }

    @Test
    public void when_5_3_then_FirstPlayer_Win() {
        givenPlayerAHitGameTimes(5);
        givenPlayerBHitGameTimes(3);
        assertEquals("Tom Win", tennis.score());
    }

    @Test
    public void when_3_5_then_SecondPlayer_Win() {
        givenPlayerAHitGameTimes(3);
        givenPlayerBHitGameTimes(5);
        assertEquals("Joe Win", tennis.score());
    }

    @Test
    public void when_3_4_then_SecondPlayer_Adv() {
        givenPlayerAHitGameTimes(3);
        givenPlayerBHitGameTimes(4);
        assertEquals("Joe Adv", tennis.score());
    }

    @Test
    public void when_4_3_then_FirstPlayer_Adv() {
        givenPlayerAHitGameTimes(4);
        givenPlayerBHitGameTimes(3);
        assertEquals("Tom Adv", tennis.score());
    }

    @Test
    public void when_3_3_then_Deuce() {
        givenPlayerAHitGameTimes(3);
        givenPlayerBHitGameTimes(3);
        assertEquals("Deuce", tennis.score());
    }

    @Test
    public void when_2_2_then_Thirty_All() {
        givenPlayerAHitGameTimes(2);
        givenPlayerBHitGameTimes(2);
        assertEquals("Thirty All", tennis.score());
    }

    @Test
    public void when_1_1_then_Fifteen_All() {
        givenPlayerAHitGameTimes(1);
        givenPlayerBHitGameTimes(1);
        assertEquals("Fifteen All", tennis.score());
    }

    @Test
    public void when_0_2_then_Love_Thirty() {
        givenPlayerBHitGameTimes(2);
        assertEquals("Love Thirty", tennis.score());
    }

    @Test
    public void when_0_1_then_Love_Fifteen() {
        givenPlayerBHitGameTimes(1);
        assertEquals("Love Fifteen", tennis.score());
    }

    private void givenPlayerBHitGameTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.playerBHit();
        }
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