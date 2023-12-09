package lotto;

import java.util.HashMap;
import java.util.Map;

public class LottoResult {
    private final Map<Rank, Integer> result = new HashMap<>();

    public LottoResult() {
        initialize();
    }

    public void initialize() {
        result.put(Rank.THREE, 0);
        result.put(Rank.THREE_AND_BONUS, 0);
        result.put(Rank.FOUR, 0);
        result.put(Rank.FOUR_AND_BONUS, 0);
        result.put(Rank.FIVE, 0);
        result.put(Rank.FIVE_AND_BONUS, 0);
        result.put(Rank.SIX, 0);
    }

    public Map<Rank, Integer> getResult() {
        return result;
    }

    public void calculateProfitRate() {

    }

    public void calculateTotalPrize() {

    }
}
