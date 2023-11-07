package lotto;

public class PurchaseMoney {
    private static final int LOTTO_PRICE = 1000;
    private static final String POSITIVE_NUMBER_REQUEST_MESSAGE = "구입 금액은 양의 정수여야 합니다.";

    private final int amount;

    public PurchaseMoney(int amount) {
        this.amount = amount;
    }

    private void validatePositiveNumber() {
        if (amount <= 0) {
            throw new IllegalArgumentException(POSITIVE_NUMBER_REQUEST_MESSAGE);
        }
    }

    public int getLottoQuantity() {
        return amount / LOTTO_PRICE;
    }

    public int getAmount() {
        return amount;
    }
}