package pairmatching.domain.pair;

import java.util.Objects;
import pairmatching.domain.Course;

public class Crew {
    private final String crewName;
    private final Course course;

    public Crew(String crewName, Course course) {
        this.crewName = crewName;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Crew crew = (Crew) o;
        return Objects.equals(crewName, crew.crewName) && course == crew.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(crewName, course);
    }
}
