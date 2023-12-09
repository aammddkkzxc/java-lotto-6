package lotto;

public class PurchaseMoney {
    public static final String PURCHASE_MONEY_RE_REQUEST_MESSAGE = "구입 금액을 다시 입력해 주십시오.";
    private static final int PURCHASE_MONEY_MINIMUM_LIMIT = 0;

    private final int amount;

    public PurchaseMoney(int amount) {
        validatePurchaseMoneyRange(amount);

        this.amount = amount;
    }

    private void validatePurchaseMoneyRange(int amount) {
        if (amount < PURCHASE_MONEY_MINIMUM_LIMIT) {
            throw new IllegalArgumentException(PURCHASE_MONEY_RE_REQUEST_MESSAGE);
        }
    }

    public int getAmount() {
        return amount;
    }
}
