package lotto.ui;

import static lotto.PurchaseMoney.PURCHASE_MONEY_RE_REQUEST_MESSAGE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    private static final String LOTTO_NUMBER_DELIMITER = ",";

    public static int convertPurchaseMoney(String purchaseMoney) {
        try{
            return Integer.parseInt(purchaseMoney);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(PURCHASE_MONEY_RE_REQUEST_MESSAGE);
        }
    }

    private static List<String> separateWinningLottoNumber(String winningLottoNumber) {
        String[] separatedWinningLottoNumber = winningLottoNumber.split(LOTTO_NUMBER_DELIMITER);
        return new ArrayList<>(Arrays.asList(separatedWinningLottoNumber));
    }
}
