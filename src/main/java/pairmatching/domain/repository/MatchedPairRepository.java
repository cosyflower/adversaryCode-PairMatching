package pairmatching.domain.repository;

import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.pair.MatchedPair;

public class MatchedPairRepository {
    public final List<MatchedPair> matchedPairs; // Level, List<Pair> 정보를 가지고 있다

    public MatchedPairRepository() {
        this.matchedPairs = new ArrayList<>();
    }

    public boolean hasDuplicatedPair(MatchedPair uncheckedMatchedPair) {
        return matchedPairs.stream()
                .filter(matchedPair -> matchedPair.hasSameLevel(uncheckedMatchedPair)) // 같은 레벨인 MatchedPair
                .anyMatch(matchedPair -> matchedPair.hasSamePair(uncheckedMatchedPair));
    }

    public void addNewPair(MatchedPair uncheckedMatchedPair) {
        matchedPairs.add(uncheckedMatchedPair);
    }
}
