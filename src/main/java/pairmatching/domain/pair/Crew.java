package pairmatching.domain.pair;

import pairmatching.domain.Course;

public class Crew {
    private final String crewName;
    private final Course course;

    public Crew(String crewName, Course course) {
        this.crewName = crewName;
        this.course = course;
    }
}
