package lotto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    public static final String LOTTO_NUMBER_RE_REQUEST_MESSAGE = "로또 번호를 다시 입력해 주십시오.";
    public static final int LOTTO_PRICE = 1000;
    public static final int LOTTO_NUMBER_MAX_LIMIT = 45;
    public static final int LOTTO_NUMBER_MIN_LIMIT = 1;

    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validateNumbersDuplication(numbers);
        validateNumbersRange(numbers);

        this.numbers = numbers;
    }

    private void validateNumbersDuplication(List<Integer> numbers) {
        Set<Integer> duplicationChecker = new HashSet<>(numbers);
        if (duplicationChecker.size() != numbers.size()) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RE_REQUEST_MESSAGE);
        }
    }

    private void validateNumbersRange(List<Integer> numbers) {
        for (int number : numbers) {
            if ((number < LOTTO_NUMBER_MIN_LIMIT) || (number > LOTTO_NUMBER_MAX_LIMIT)) {
                throw new IllegalArgumentException(LOTTO_NUMBER_RE_REQUEST_MESSAGE);
            }
        }
    }

    public boolean isContainNumber(int number) {
        return numbers.contains(number);
    }
}