package lotto.ui;

import java.util.Map;
import lotto.LottoResult;
import lotto.Rank;

public class OutputView {
    public static void printStats(LottoResult lottoResult) {
        Map<Rank, Integer> result = lottoResult.getResult();
        System.out.println(result.get(Rank.THREE) + result.get(Rank.THREE_AND_BONUS));
        System.out.println(result.get(Rank.FOUR) + result.get(Rank.FOUR_AND_BONUS));
        System.out.println(result.get(Rank.FIVE));
        System.out.println(result.get(Rank.FIVE_AND_BONUS));
        System.out.println(result.get(Rank.SIX));
    }
}
