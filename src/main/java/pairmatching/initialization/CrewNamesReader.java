package pairmatching.initialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CrewNamesReader {
    public static final String BACKEND_FILE_PATH = "/Users/hwangseonghun/Desktop/wootaecourse_precourse/"
            + "adversaryCode-pairmatching/src/main/resources/backend-crew.md";
    public static final String FRONTEND_FILE_PATH = "/Users/hwangseonghun/Desktop/wootaecourse_precourse/"
            + "adversaryCode-pairmatching/src/main/resources/frontend-crew.md";

    private final List<String> readCrewNames;

    public CrewNamesReader() throws IOException {
        this.readCrewNames = new ArrayList<>();
    }

    public void readBackendCrewNames() throws IOException {
        readCrewNames.clear();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(BACKEND_FILE_PATH));
        readCrewNames(bufferedReader);
    }

    public void readFrontCrewNames() throws IOException {
        readCrewNames.clear();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FRONTEND_FILE_PATH));
        readCrewNames(bufferedReader);
    }

    private void readCrewNames(BufferedReader bufferedReader) throws IOException {
        String eachName;
        while ((eachName = bufferedReader.readLine()) != null) {
            readCrewNames.add(eachName);
        }
    }

    public List<String> getReadCrewNames() {
        return Collections.unmodifiableList(readCrewNames);
    }
}
