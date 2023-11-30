package pairmatching.domain.pair;

import java.util.ArrayList;
import java.util.List;

public class Pair {
    private final List<Crew> crewPair;

    public Pair(List<Crew> crewPair) {
        this.crewPair = new ArrayList<>(crewPair);
    }
}
