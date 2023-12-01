package pairmatching.repository;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import pairmatching.domain.Course;
import pairmatching.domain.Level;
import pairmatching.domain.pair.Crew;
import pairmatching.domain.pair.MatchedPair;
import pairmatching.domain.pair.Pair;
import pairmatching.domain.repository.MatchedPairRepository;

public class MatchedPairRepositoryTest {
    @Test
    void 중복된_Pair_검증() { // 2 : 26
        MatchedPairRepository matchedPairRepository = new MatchedPairRepository();
        List<Pair> addedBackendPairs = Arrays.asList(
                new Pair(Arrays.asList(
                        new Crew("성훈", Course.BACKEND),
                        new Crew("헤림", Course.BACKEND)
                )),
                new Pair(Arrays.asList(
                        new Crew("상호", Course.BACKEND),
                        new Crew("선영", Course.BACKEND)
                ))
        );

        matchedPairRepository.addNewPair(new MatchedPair(Level.LEVEL1, addedBackendPairs));

        List<Pair> duplicatedBackendPairs = Arrays.asList(
                new Pair(Arrays.asList(
                        new Crew("성훈", Course.BACKEND),
                        new Crew("혜림", Course.BACKEND)
                )),
                new Pair(Arrays.asList(
                        new Crew("상호", Course.BACKEND),
                        new Crew("선영", Course.BACKEND)
                ))
        );

        boolean result = matchedPairRepository.hasDuplicatedPair(
                new MatchedPair(Level.LEVEL2, duplicatedBackendPairs));

        System.out.println(result);
    }
}
