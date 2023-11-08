package lotto;

public class PurchaseMoney {
    private static final int LOTTO_PRICE = 1000;
    private static final String POSITIVE_NUMBER_REQUEST_MESSAGE = "구입 금액은 양의 정수여야 합니다.";
    private static final String THOUSAND_UNIT_REQUEST_MESSAGE = "구입 금액은 천단위여야 합니다.";

    private final int amount;

    public PurchaseMoney(int amount) {
        validatePositiveNumber(amount);
        validateThousandUnit(amount);
        this.amount = amount;
    }

    private void validatePositiveNumber(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(POSITIVE_NUMBER_REQUEST_MESSAGE);
        }
    }

    private void validateThousandUnit(int amount) {
        if ((amount % LOTTO_PRICE) != 0) {
            throw new IllegalArgumentException(THOUSAND_UNIT_REQUEST_MESSAGE);
        }
    }

    public int calculateLottoQuantity() {
        return amount / LOTTO_PRICE;
    }

    public int getAmount() {
        return amount;
    }
}