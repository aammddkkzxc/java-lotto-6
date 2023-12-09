package lotto;

public class PurchaseMoney {
    public static final String PURCHASE_MONEY_RE_REQUEST_MESSAGE = "구입 금액을 다시 입력해 주십시오.";

    private final int amount;

    public PurchaseMoney(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
