package lotto;

import static lotto.BonusNumber.BONUS_NUMBER_RE_REQUEST_MESSAGE;

public class WinningLotto {
    private final Lotto lotto;
    private final BonusNumber bonusNumber;

    public WinningLotto(Lotto lotto, BonusNumber bonusNumber) {
        validateLottoNumberNotDuplicateBonusNumber(lotto, bonusNumber);

        this.lotto = lotto;
        this.bonusNumber = bonusNumber;
    }

    private void validateLottoNumberNotDuplicateBonusNumber(Lotto lotto, BonusNumber bonusNumber) {
        if (lotto.isContainNumber(bonusNumber.getNumber())) {
            throw new IllegalArgumentException(BONUS_NUMBER_RE_REQUEST_MESSAGE);
        }
    }
}
