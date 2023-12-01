package pairmatching.domain.pair;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    private final List<Crew> crewPair;

    public Pair(List<Crew> crewPair) {
        this.crewPair = new ArrayList<>(crewPair);
    }

    public boolean hasSamePair(Pair uncheckedPair) {
        List<Crew> otherCrews = uncheckedPair.crewPair;
        long duplicatedCrewCount = crewPair.stream()
                .filter(crew -> otherCrews.contains(crew))
                .count();

        if (duplicatedCrewCount > 1) {
            return true;
        }
        return false;
    }
}
