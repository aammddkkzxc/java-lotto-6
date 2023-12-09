package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lotto.ui.InputView;
import lotto.ui.OutputView;

public class LottoGame {
    public void run() {
        PurchaseMoney purchaseMoney = InputView.inputPurchaseMoney();
        List<Lotto> publishedLottos = publishLotto(purchaseMoney.calculateTicketsNumber());

        Lotto lotto = InputView.inputWinningLottoNumber();
        WinningLotto winningLotto = InputView.inputWinningLotto(lotto);

        List<Rank> ranks = checkWinning(publishedLottos, winningLotto);
        LottoResult lottoResult = new LottoResult();
        calculateLottoStats(ranks, lottoResult);
        OutputView.printStats(lottoResult);
    }

    private List<Lotto> publishLotto(int ticketNumber) {
        List<Lotto> publishedLottos = new ArrayList<>();

        for (int i = 0; i < ticketNumber; i++) {
            List<Integer> lotto = NumberGenerator.generate();
            Collections.sort(lotto);
            System.out.println(lotto);
            publishedLottos.add(new Lotto(lotto));
        }

        return publishedLottos;
    }

    private List<Rank> checkWinning(List<Lotto> publishedLottos, WinningLotto winningLotto) {
        List<Rank> ranks = new ArrayList<>();
        for (Lotto publishedLotto : publishedLottos) {
            int count = publishedLotto.countDuplicationWinningNumbers(winningLotto.getLotto());
            boolean match = publishedLotto.isContainNumber(winningLotto.getBonusNumber().getNumber());
            ranks.add(Rank.decideRank(count, match));
        }
        return ranks;
    }

    private void calculateLottoStats(List<Rank> ranks, LottoResult lottoResult) {
        for(Rank rank : ranks) {
            lottoResult.getResult().put(rank, lottoResult.getResult().getOrDefault(rank, 0) + 1);
        }
    }
}
