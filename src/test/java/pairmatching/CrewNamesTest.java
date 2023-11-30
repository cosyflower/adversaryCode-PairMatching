package pairmatching;

import java.io.IOException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pairmatching.domain.CrewNames;
import pairmatching.initialization.CrewNamesReader;

public class CrewNamesTest {
    @Test
    void flow() throws IOException {
        CrewNamesReader crewNamesReader = new CrewNamesReader();
        crewNamesReader.readFrontCrewNames();

        CrewNames frontendNames = new CrewNames(crewNamesReader.getReadCrewNames());
        Assertions.assertThat(frontendNames.getCrewNames().size()).isEqualTo(15);

        crewNamesReader.readBackendCrewNames();
        CrewNames backendNames = new CrewNames(crewNamesReader.getReadCrewNames());
        Assertions.assertThat(backendNames.getCrewNames().size()).isEqualTo(20);
    }
}
