import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private static Map<Integer, String> scoreLookup = new HashMap<>();

    static {
        scoreLookup.put(1, "Fifteen");
        scoreLookup.put(2, "Thirty");
        scoreLookup.put(3, "Forty");
    }

    private int playerAGameTimes;

    public String score() {
        if (playerAGameTimes > 0) {
            return scoreLookup.get(playerAGameTimes) + " Love";
        }
        return "Love All";
    }

    public void playerAHit() {
        this.playerAGameTimes++;
    }
}
