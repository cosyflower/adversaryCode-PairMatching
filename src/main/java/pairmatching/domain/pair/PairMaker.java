package pairmatching.domain.pair;

import camp.nextstep.edu.missionutils.Randoms;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import pairmatching.domain.Course;
import pairmatching.initialization.CrewNamesReader;

public class PairMaker {
    private final Course course;
    private final CrewNamesReader crewNamesReader;

    public PairMaker(Course course) throws IOException {
        this.crewNamesReader = new CrewNamesReader();
        this.course = course;
    }
    
    public List<Pair> generatePairs() throws IOException {
        List<Pair> matchedPair = new ArrayList<>();
        List<String> shuffledNames = Randoms.shuffle(readCrewNameFromReader());

        int division = shuffledNames.size() / 2;
        if (shuffledNames.size() % 2 == 0) {
            generateTwoCrewPair(matchedPair, shuffledNames, division);
            return matchedPair;
        }

        generateTwoCrewPair(matchedPair, shuffledNames, division - 1);
        generateThreeCrewPair(matchedPair, shuffledNames, division);
        return matchedPair;
    }

    private void generateThreeCrewPair(List<Pair> matchedPair, List<String> shuffledNames, int division) {
        matchedPair.add(new Pair(Arrays.asList(
                        new Crew(shuffledNames.get(2 * division - 2), course),
                        new Crew(shuffledNames.get(2 * division - 1), course),
                        new Crew(shuffledNames.get(2 * division), course))
                )
        );
    }

    private void generateTwoCrewPair(List<Pair> matchedPair, List<String> shuffledNames, int division) {
        IntStream.range(0, division)
                .forEach(num -> matchedPair.add(
                        new Pair(Arrays.asList(new Crew(shuffledNames.get(2 * num), course),
                                new Crew(shuffledNames.get(2 * num + 1), course)))
                ));
    }

    private List<String> readCrewNameFromReader() throws IOException {
        if (course == Course.BACKEND) {
            crewNamesReader.readBackendCrewNames();
            return crewNamesReader.getReadCrewNames();
        }
        crewNamesReader.readFrontendCrewNames();
        return crewNamesReader.getReadCrewNames();
    }
}
