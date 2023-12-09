package lotto.ui;

import camp.nextstep.edu.missionutils.Console;
import lotto.Lotto;
import lotto.PurchaseMoney;

public class InputView {
    private static final String PURCHASE_MONEY_REQUEST_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String WINNING_NUMBER_REQUEST_MESSAGE = "당첨 번호를 입력해 주세요.";

    public static PurchaseMoney inputPurchaseMoney() {
        try {
            return readPurchaseMoney();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputPurchaseMoney();
        }
    }

    private static PurchaseMoney readPurchaseMoney() {
        System.out.println(PURCHASE_MONEY_REQUEST_MESSAGE);
        String purchaseMoney = Console.readLine();

        return new PurchaseMoney(Converter.convertPurchaseMoney(purchaseMoney));
    }

    private static Lotto inputWinningLottoNumber() {
        System.out.println(WINNING_NUMBER_REQUEST_MESSAGE);
        String winningLottoNumber = Console.readLine();

        return new Lotto(Converter.convertWinningLottoNumber(winningLottoNumber));
    }
}
