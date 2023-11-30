package pairmatching;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import pairmatching.domain.Course;
import pairmatching.domain.pair.Pair;
import pairmatching.domain.pair.PairMaker;

public class PairMakerTest {
    @Test
    void Pair_Size() throws IOException {
        PairMaker pairMaker = new PairMaker(Course.BACKEND);
        List<Pair> backendPairs = pairMaker.generatePairs();

        assertThat(backendPairs.size()).isEqualTo(10); // 20

        PairMaker frontPairMaker = new PairMaker(Course.FRONTEND);
        List<Pair> frontPairs = frontPairMaker.generatePairs();
        assertThat(frontPairs.size()).isEqualTo(7); // 15
    }
}
