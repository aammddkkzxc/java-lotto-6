package lotto;

import java.util.List;

public class Lotto {
    public static final int LOTTO_PRICE = 1000;
    public static final String LOTTO_NUMBER_RE_REQUEST_MESSAGE = "로또 번호를 다시 입력해 주십시오.";

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        this.numbers = numbers;
    }

}