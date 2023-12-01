package pairmatching.domain.pair;

import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.Level;
import pairmatching.domain.Mission;

public class MatchedPair {
    private final Level level;
    private final Mission mission;
    private final List<Pair> uncheckedPairs;

    public MatchedPair(Level level, Mission mission, List<Pair> pairs) {
        this.level = level;
        this.mission = mission;
        this.uncheckedPairs = new ArrayList<>(pairs);
    }

    public boolean hasSameLevel(MatchedPair otherMatchedPair) {
        return level == otherMatchedPair.level;
    }

    public boolean hasSamePair(MatchedPair otherMatchedPair) {
        List<Pair> otherUncheckedPairs = otherMatchedPair.uncheckedPairs;
        for (Pair uncheckedPair : this.uncheckedPairs) {
            if (otherUncheckedPairs.stream()
                    .anyMatch(pair -> pair.hasSamePair(uncheckedPair))) {
                return true;
            }
        }
        return false;
    }
}
