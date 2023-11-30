package pairmatching;

import java.io.IOException;
import org.junit.jupiter.api.Test;
import pairmatching.initialization.CrewNamesReader;

public class CrewNamesTest {
    @Test
    void flow() throws IOException {
        CrewNamesReader crewNamesReader = new CrewNamesReader();
        crewNamesReader.readFrontCrewNames();

        CrewNames frontendNames = new CrewNames(crewNamesReader.getReadCrewNames());
        System.out.println(frontendNames.getCrewNames().size());

        crewNamesReader.readBackendCrewNames();
        CrewNames backendNames = new CrewNames(crewNamesReader.getReadCrewNames());
        System.out.println(backendNames.getCrewNames().size());
    }
}
