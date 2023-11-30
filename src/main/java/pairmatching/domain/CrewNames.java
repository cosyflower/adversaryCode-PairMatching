package pairmatching.domain;

import java.util.ArrayList;
import java.util.List;

public class CrewNames {
    private final List<String> crewNames;

    public CrewNames(List<String> crewNames) {
        this.crewNames = new ArrayList<>(crewNames);
    }

    public List<String> getCrewNames() {
        return crewNames;
    }
}
