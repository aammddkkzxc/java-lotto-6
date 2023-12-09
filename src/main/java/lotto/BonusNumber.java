package lotto;

import static lotto.Lotto.LOTTO_NUMBER_MAX_LIMIT;
import static lotto.Lotto.LOTTO_NUMBER_MIN_LIMIT;

public class BonusNumber {
    public static final String BONUS_NUMBER_RE_REQUEST_MESSAGE = "보너스 번호를 다시 입력해 주십시오.";
    private final int number;

    public BonusNumber(int number) {
        this.number = number;
    }

    private void validateBonusNumberRange(int number) {
        if((number < LOTTO_NUMBER_MIN_LIMIT) || (number > LOTTO_NUMBER_MAX_LIMIT)) {
            throw new IllegalArgumentException(BONUS_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    public int getNumber() {
        return number;
    }
}
