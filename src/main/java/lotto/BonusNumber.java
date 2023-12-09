package lotto;

public class BonusNumber {
    public static final String BONUS_NUMBER_RE_REQUEST_MESSAGE = "보너스 번호를 다시 입력해 주십시오.";
    private final int number;

    public BonusNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
