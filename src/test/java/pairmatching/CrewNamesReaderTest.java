package pairmatching;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import pairmatching.initialization.CrewNamesReader;

public class CrewNamesReaderTest {
    @Test
    void basic_Flow() throws IOException {
        CrewNamesReader crewNamesReader = new CrewNamesReader();

        crewNamesReader.readBackendCrewNames();
        List<String> readBackendCrewNames = crewNamesReader.getReadCrewNames();
        assertThat(readBackendCrewNames.size()).isEqualTo(20);

        crewNamesReader.readFrontCrewNames();
        List<String> readFrontendCrewNames = crewNamesReader.getReadCrewNames();
        assertThat(readFrontendCrewNames.size()).isEqualTo(15);
    }
}
