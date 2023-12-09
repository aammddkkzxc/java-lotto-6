package lotto;

public enum Rank {
    THREE(3, false, 5_000),
    THREE_AND_BONUS(3, true, 5_000),
    FOUR(4, false, 50_000),
    FOUR_AND_BONUS(4, true, 50_000),
    FIVE(5, false, 1_500_000),
    FIVE_AND_BONUS(5, true, 30_000_000),
    SIX(6, false, 2_000_000_000);

    private final int count;
    private final boolean match;
    private final int prize;

    Rank(int count, boolean match, int prize) {
        this.count = count;
        this.match = match;
        this.prize = prize;
    }

    public static Rank decideRank(int count, boolean match) {
        Rank[] ranks = values();

        for (Rank rank : ranks) {
            if ((rank.getCount() == count) && (rank.getMatch() == match)) {
                return rank;
            }
        }

        return null;
    }

    public Integer getCount() {
        return count;
    }

    public Boolean getMatch() {
        return match;
    }

    public Integer getPrize() {
        return prize;
    }
}
