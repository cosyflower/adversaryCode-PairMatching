package pairmatching;

public enum Course { // 17M
    BACKEND("백엔드"),
    FRONTEND("프론트엔드")
    ;

    private final String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }
}
