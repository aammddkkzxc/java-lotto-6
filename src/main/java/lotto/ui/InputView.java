package lotto.ui;

import camp.nextstep.edu.missionutils.Console;
import lotto.PurchaseMoney;

public class InputView {
    private static final String PURCHASE_MONEY_REQUEST_MESSAGE = "구입금액을 입력해 주세요.";

    public static PurchaseMoney readPurchaseMoney() {
        System.out.println(PURCHASE_MONEY_REQUEST_MESSAGE);
        String purchaseMoney = Console.readLine();

        return new PurchaseMoney(Converter.convertPurchaseMoney(purchaseMoney));
    }
}
