package lotto.ui;

import static lotto.PurchaseMoney.PURCHASE_MONEY_RE_REQUEST_MESSAGE;

public class Converter {
    public static int convertPurchaseMoney(String purchaseMoney) {
        try{
            return Integer.parseInt(purchaseMoney);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(PURCHASE_MONEY_RE_REQUEST_MESSAGE);
        }
    }
}
