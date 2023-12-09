package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    public static final int LOTTO_PRICE = 1000;
    public static final String LOTTO_NUMBER_RE_REQUEST_MESSAGE = "로또 번호를 다시 입력해 주십시오.";

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateNumbersDuplication(numbers);

        this.numbers = numbers;
    }

    private void validateNumbersDuplication(List<Integer> numbers) {
        Set<Integer> duplicationChecker = new HashSet<>(numbers);
        if (duplicationChecker.size() != numbers.size()) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RE_REQUEST_MESSAGE);
        }
    }
}