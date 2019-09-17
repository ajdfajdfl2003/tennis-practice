import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {

    @Test
    public void when_0_0_then_Love_All() {
        Tennis tennis = new Tennis();
        assertEquals("Love All", tennis.score());
    }
}