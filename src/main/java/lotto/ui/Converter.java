package lotto.ui;

import static lotto.Lotto.LOTTO_NUMBER_RE_REQUEST_MESSAGE;
import static lotto.PurchaseMoney.PURCHASE_MONEY_RE_REQUEST_MESSAGE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {
    private static final String LOTTO_NUMBER_DELIMITER = ",";

    public static int convertPurchaseMoney(String purchaseMoney) {
        try {
            return Integer.parseInt(purchaseMoney);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(PURCHASE_MONEY_RE_REQUEST_MESSAGE);
        }
    }

    public static List<Integer> convertWinningLottoNumber(String winningLottoNumber) {
        List<String> separatedWinningLottoNumber = separateWinningLottoNumber(winningLottoNumber);
        List<Integer> convertedWinningLottoNumber = new ArrayList<>();

        for (String number : separatedWinningLottoNumber) {
            try {
                int convertedNumber = Integer.parseInt(number);
                convertedWinningLottoNumber.add(convertedNumber);
            } catch (NumberFormatException e) {
                System.out.println(LOTTO_NUMBER_RE_REQUEST_MESSAGE);
            }
        }

        return convertedWinningLottoNumber;
    }

    private static List<String> separateWinningLottoNumber(String winningLottoNumber) {
        String[] separatedWinningLottoNumber = winningLottoNumber.split(LOTTO_NUMBER_DELIMITER);
        return new ArrayList<>(Arrays.asList(separatedWinningLottoNumber));
    }
}
